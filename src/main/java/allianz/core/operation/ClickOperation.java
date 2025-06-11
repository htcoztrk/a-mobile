package allianz.core.operation;

import allianz.core.driver_manager.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.Logger;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.touch.TouchActions;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class ClickOperation {

    private WaitOperation waitOperation;
    private Logger log = Logger.getLogger(ClickOperation.class);

    public ClickOperation() {

        waitOperation = new WaitOperation();
    }

    public void click(String key) {

        try {
            waitOperation.waitPresence(key);
            waitOperation.waitVisible(key);
            MobileElement mobileElement = waitOperation.waitClickable(key);
            mobileElement.click();
        } catch (StaleElementReferenceException | ElementClickInterceptedException exception) {
            String logMessage = String.format("'%s' objesine tıklanırken sorun oluştu!", key);
            log.error(logMessage);
            click(key);
        }
    }

    public void clickIfExists(String key, int waitSecond) {

        if (waitOperation.isExist(key, waitSecond)) {
            click(key);
            log.info(String.format("'%s' objesine tıklandı.", key));
        }
    }

    public void clickWithXAndYCoordinates(int xPoint, int yPoint) {

        try {
            TouchAction touchAction = new TouchAction(DriverManager.getDriver());
            touchAction.press(new PointOption().withCoordinates(xPoint, yPoint)).perform();

        } catch (StaleElementReferenceException | ElementClickInterceptedException exception) {
            String logMessage = String.format("X:'%s', Y: '%s' koordinatları ile tıklama işlemi sorun oluştu!", xPoint,yPoint);
            log.error(logMessage);
            clickWithXAndYCoordinates(xPoint,yPoint);
        }
    }

    public void clickWithTouchAction(String key){
        try {
            waitOperation.waitPresence(key);
            MobileElement mobileElement = waitOperation.waitVisible(key);
            TouchAction touchAction = new TouchAction(DriverManager.getDriver());
            touchAction.press(element(mobileElement))
                    .release()
                    .perform();

        } catch (StaleElementReferenceException | ElementClickInterceptedException exception) {
            String logMessage = String.format("'%s' objesine tıklanırken sorun oluştu!", key);
            log.error(logMessage);
            click(key);
        }
    }
}
