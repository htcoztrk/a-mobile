package allianz.core.capabilities;

import allianz.core.config.AllianzGlobalConfig;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import static allianz.core.config.AllianzGlobalConfig.*;

public class AllianzCapabilities {

    private DesiredCapabilities desiredCapabilities;

    private static final String PROP_KEY = "key";
    private static final String PROP_TESTID = "testID";
    private static final String PROP_APPTOKEN = "appToken"; // mobil
    private static final String PROP_PLATFORM = "platform";

    private static final String CAP_CLOUD_KEY = "testinium:key";
    private static final String CAP_CLOUD_TESTID = "testinium:testID";
    private static final String CAP_CLOUD_TAKE_SS = "testinium:takesScreenshot";
    private static final String CAP_CLOUD_RECORDVIDEO = "testinium:recordsVideo";

    public DesiredCapabilities getANDCapabilities() {

        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, AllianzGlobalConfig.CurrentPhoneName);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        //desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
        desiredCapabilities.setCapability("unicodeKeyboard", true); // klavye görünmesin
        desiredCapabilities.setCapability("resetKeyboard", true); // klavye görünmesin
        return desiredCapabilities;
    }

    public DesiredCapabilities getANDTestiniumCapabilities() {
        System.out.println("---TESTINIUMDA ANDROID TESTE GELDİ!---");
        String testID = System.getenv(PROP_TESTID);
        desiredCapabilities = new DesiredCapabilities();
        //desiredCapabilities.setCapability("key", System.getenv("key"));
        desiredCapabilities.setCapability(CAP_CLOUD_KEY, "allianz:c97328a52d6bcf9aac41876f195ad427");
        desiredCapabilities.setCapability(CAP_CLOUD_TESTID, testID);
        desiredCapabilities.setCapability(CAP_CLOUD_TAKE_SS, "only_failure"); // "yes", "true", true, false, "no", "off", "only_failure", "ONLY_FAILURE"
        desiredCapabilities.setCapability(CAP_CLOUD_RECORDVIDEO, true);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        return desiredCapabilities;
    }

    public DesiredCapabilities getIOSCapabilities() {

        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", MobilePlatform.IOS);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.2");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "e51ea3b61d4e7fc0399b8da08e7dac7e171be65b");
        desiredCapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, BUNDLE_ID);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, AllianzGlobalConfig.CurrentPhoneName);
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        desiredCapabilities.setCapability("sendKeyStrategy","setValue");
        desiredCapabilities.setCapability("usePrebuiltWDA", true);
        desiredCapabilities.setCapability("useNewWDA", true);
        return desiredCapabilities;
    }

    public DesiredCapabilities getIOSTestiniumCapabilities() {
        System.out.println("---TESTINIUMDA IOS TESTE GELDİ!---");
        String testID = System.getenv(PROP_TESTID);
        desiredCapabilities = new DesiredCapabilities();
        //desiredCapabilities.setCapability("key", System.getenv("key"));
        desiredCapabilities.setCapability(CAP_CLOUD_KEY, "allianz:c97328a52d6bcf9aac41876f195ad427");
        desiredCapabilities.setCapability(CAP_CLOUD_TESTID, testID);
        desiredCapabilities.setCapability(CAP_CLOUD_TAKE_SS, true); // "yes", "true", true, false, "no", "off", "only_failure", "ONLY_FAILURE"
        desiredCapabilities.setCapability(CAP_CLOUD_RECORDVIDEO, true);
        //desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
       // desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        //desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.1.2");
        //desiredCapabilities.setCapability("autoAcceptAlerts", true);
        desiredCapabilities.setCapability("bundleId", BUNDLE_ID);
        desiredCapabilities.setCapability("usePrebuiltWDA", true);
        desiredCapabilities.setCapability("useNewWDA", false);
        desiredCapabilities.setCapability("autoAcceptAlerts",true);
        //desiredCapabilities.setCapability("sendKeyStrategy","setValue");


        //desiredCapabilities.setCapability("maxTypeFrequency", 5);
        //desiredCapabilities.setCapability("usePrebuiltWDA", true);
        //desiredCapabilities.setCapability("useNewWDA", true);
        //desiredCapabilities.setCapability("waitForAppScript", "$.delay(1000);");
        //desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        //desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        return desiredCapabilities;
    }
}
