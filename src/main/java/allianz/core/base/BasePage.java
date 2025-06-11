package allianz.core.base;

import allianz.core.operation.WaitOperation;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;

public class BasePage {

    private Logger log = Logger.getLogger(BasePage.class);

    public void clear(String key) {

        new WaitOperation().waitPresence(key);
        new WaitOperation().waitVisible(key);
        MobileElement mobileElement = new WaitOperation().waitClickable(key);
        try {
            mobileElement.clear();
        }catch (Exception ex) {
            log.error(String.format("'%s' alanı temizlenirken sorun oluştu! Hata mesajı: %s", key, ex.getMessage()));
        }
    }
}
