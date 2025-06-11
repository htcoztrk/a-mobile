package allianz.core.identity_manager;

import allianz.core.identities.AndroidIdentities;
import allianz.core.identities.IosIdentities;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import static allianz.core.config.AllianzGlobalConfig.IsTestRunningOnAndroidDevice;

public class IdentityManager {

    private static Logger log = Logger.getLogger(IdentityManager.class);

    private IdentityManager() {
    }

    public static By getLocator(String key) {

        By locator = null;

        if (IsTestRunningOnAndroidDevice)
            locator = AndroidIdentities.getAndroidIdentities().get(key);
        else
            locator = IosIdentities.getIosIdentities().get(key);

        if (locator == null) {
            String logMessage = String.format("'%s' keyine ait locator bulunamadı!", key);
            log.error(logMessage);
            Assert.fail(logMessage);
        }
        return locator;
    }
}
