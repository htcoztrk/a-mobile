package allianz.core.operation;

import allianz.core.config.AllianzGlobalConfig;
import allianz.core.driver_manager.DriverManager;
import allianz.core.identity_manager.IdentityManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nullable;

public class WaitOperation {

    private AppiumDriver<?> driver = null;
    private String errorMessage;
    private MobileElement mobileElement = null;
    private By locator = null;
    private Logger log = Logger.getLogger(WaitOperation.class);

    public MobileElement waitPresence(String key) {
        return waitPresence(key, AllianzGlobalConfig.DEFAULT_WAIT);
    }

    public MobileElement waitPresence(String key, int waitSecond) {

        try {
            mobileElement = null;
            locator = IdentityManager.getLocator(key);
            driver = DriverManager.getDriver();
            WebDriverWait webDriverWait = new WebDriverWait(driver, waitSecond, AllianzGlobalConfig.SLEEP_IN_MILLIS);
            mobileElement = (MobileElement) webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception ex) {
            errorMessage = String.format("'%s' objesi sayfa üzerinde var olması beklenirken sorun oluştu!", key);
            log.error(errorMessage);
            Assert.fail(errorMessage);
        }
        return mobileElement;
    }

    public MobileElement waitVisible(String key) {
        return waitVisible(key, AllianzGlobalConfig.DEFAULT_WAIT);
    }

    public MobileElement waitVisible(String key, int waitSecond) {

        try {
            mobileElement = null;
            locator = IdentityManager.getLocator(key);
            driver = DriverManager.getDriver();
            WebDriverWait webDriverWait = new WebDriverWait(driver, waitSecond, AllianzGlobalConfig.SLEEP_IN_MILLIS);
            mobileElement = (MobileElement) webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception ex) {
            errorMessage = String.format("'%s' objesi sayfa üzerinde görünür olması beklenirken sorun oluştu!", key);
            log.error(errorMessage);
            Assert.fail(errorMessage);
        }
        return mobileElement;
    }

    public MobileElement waitClickable(String key) {
        return waitClickable(key, AllianzGlobalConfig.DEFAULT_WAIT);
    }

    public MobileElement waitClickable(String key, int defaultWait) {

        try {
            mobileElement = null;
            locator = IdentityManager.getLocator(key);
            driver = DriverManager.getDriver();
            WebDriverWait webDriverWait = new WebDriverWait(driver, defaultWait, AllianzGlobalConfig.SLEEP_IN_MILLIS);
            mobileElement = (MobileElement) webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception ex) {
            errorMessage = String.format("'%s' objesi sayfa üzerinde tıklanabilir olması beklenirken sorun oluştu!", key);
            log.error(errorMessage);
            Assert.fail(errorMessage);
        }
        return mobileElement;
    }

    public MobileElement until(ExpectedCondition<?> condition, int second) {
        driver = DriverManager.getDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, second, AllianzGlobalConfig.SLEEP_IN_MILLIS);
        return (MobileElement) webDriverWait.until(condition);
    }

    public void waitDoNotWriteToLogFile(int second) {

        try {
            Thread.sleep((long) second * 1000);
        } catch (Exception ex) {
            log.error(String.format("'%s' saniye beklerken sorun oluştu!", second));
        }
    }

    public boolean isPresence(String key, int second) {

        try {
            locator = IdentityManager.getLocator(key);
            mobileElement = null;
            mobileElement = until(ExpectedConditions.presenceOfElementLocated(locator), second);
            return mobileElement != null;
        } catch (Exception ex) {
        }
        return false;
    }

    public boolean isVisible(String key, int second) {

        try {
            locator = IdentityManager.getLocator(key);
            mobileElement = null;
            mobileElement = until(ExpectedConditions.visibilityOfElementLocated(locator), second);
            return mobileElement != null;
        } catch (Exception ex) {
        }
        return false;
    }

    public boolean isClickable(String key, int second) {

        try {
            locator = IdentityManager.getLocator(key);
            mobileElement = null;
            mobileElement = until(ExpectedConditions.elementToBeClickable(locator), second);
            return mobileElement != null;
        } catch (Exception ex) {
        }
        return false;
    }

    public boolean isExist(String key, int waitSecond) {

        try {
            boolean presence = isPresence(key, waitSecond);
            boolean visible = isVisible(key, 1);
            boolean clickable = isClickable(key, 1);
            return presence && visible && clickable;
        } catch (Exception ex) {
        }
        return false;
    }

    public void waitUntilTextIsLoadedInToPageSource(String text) {

        try {
            driver = DriverManager.getDriver();
            WebDriverWait webDriverWait = new WebDriverWait(driver, AllianzGlobalConfig.DEFAULT_WAIT, AllianzGlobalConfig.SLEEP_IN_MILLIS);
            webDriverWait.until(waitUntilTextIsLoaded(text));
        }
        catch (Exception ex) {
            Assert.fail(String.format("Sayfa kaynağına '%s' değeri yüklenemedi! Hata kodu: %s", text, ex.getMessage()));
        }
    }

    private ExpectedCondition<Boolean> waitUntilTextIsLoaded(String text) {

        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(@Nullable WebDriver webDriver) {
                try {
                    return driver.getPageSource().contains(text);
                }catch (Exception ex) {
                }
                return false;
            }
        };
    }
}
