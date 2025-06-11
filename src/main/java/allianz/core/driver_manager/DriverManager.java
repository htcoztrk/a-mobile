package allianz.core.driver_manager;

import allianz.core.capabilities.AllianzCapabilities;
import allianz.core.config.AllianzGlobalConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static allianz.core.config.AllianzGlobalConfig.IsTestRunningOnAndroidDevice;
import static allianz.core.utils.AllianzUtils.isTestRunningOnTestinium;

public class DriverManager {

    private static Logger log = Logger.getLogger(DriverManager.class);

    private static URL url;
    private static AppiumDriver<MobileElement> appiumDriver;
    private static final String LOCAL_HOST = "http://0.0.0.0:4723/wd/hub";
    private static final String TESTINIUM_IO = "http://host.docker.internal:4444";
    private static DesiredCapabilities desiredCapabilities;

    private DriverManager() {
    }

    public static boolean initDriver() {

        try {
            if (isTestRunningOnTestinium()) {
                log.info("Testinium ortamında cihaz bilgileri alınıyor...");
                AllianzGlobalConfig.CurrentPhoneName = System.getenv("browser");
                AllianzGlobalConfig.CurrentPhoneVersion = System.getenv("version");

                if ("ANDROID".equals(System.getenv("platform"))) {
                    AllianzGlobalConfig.IsTestRunningOnAndroidDevice = true;
                    desiredCapabilities = new AllianzCapabilities().getANDTestiniumCapabilities();
                    appiumDriver = new AndroidDriver<MobileElement>(new URL(TESTINIUM_IO), desiredCapabilities);
                } else {
                    AllianzGlobalConfig.IsTestRunningOnAndroidDevice = false;
                    desiredCapabilities = new AllianzCapabilities().getIOSTestiniumCapabilities();
                    appiumDriver = new IOSDriver<MobileElement>(new URL(TESTINIUM_IO), desiredCapabilities);
                }
            } else {
                if (IsTestRunningOnAndroidDevice) {
                    url = new URL(LOCAL_HOST);
                    desiredCapabilities = new AllianzCapabilities().getANDCapabilities();
                    appiumDriver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
                } else {
                    url = new URL(LOCAL_HOST);
                    desiredCapabilities = new AllianzCapabilities().getIOSCapabilities();
                    appiumDriver = new IOSDriver<MobileElement>(url, desiredCapabilities);
                }
            }
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return appiumDriver;
    }

    public static void killDriver() {
        if (appiumDriver != null) {
            appiumDriver.quit();
        }
    }
}
