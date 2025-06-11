package allianz.core.operation;

import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;

public class SendKeyOperation {

    private WaitOperation waitOperation = null;
    private Logger log = Logger.getLogger(SendKeyOperation.class);

    public SendKeyOperation() {

        waitOperation = new WaitOperation();
    }

    public void sendKeys(String key, CharSequence... value) {

        try {
            waitOperation.waitPresence(key);
            waitOperation.waitVisible(key);
            MobileElement mobileElement = waitOperation.waitClickable(key);
            mobileElement.sendKeys(value);
        } catch (StaleElementReferenceException | ElementNotInteractableException exception) {
            String logMessage = String.format("'%s' objesine sendKey işlemi yaparken sorun oluştu!", key);
            log.error(logMessage);
            waitOperation.waitDoNotWriteToLogFile(1);
            sendKeys(key, value);
        }
    }
}
