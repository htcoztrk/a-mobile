package allianz.core.user_variable;

import allianz.core.utils.AllianzUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;

import java.util.HashMap;

public class UserVariable {

    private static HashMap<String, String> userVariableHashMap;
    private static Logger log = Logger.getLogger(UserVariable.class);

    public static void addVariableToUserVariableHashMap(String key, String value) {
        if (AllianzUtils.isNullOrEmpty(key) || AllianzUtils.isNullOrEmpty(value))
            return;
        initUserVariableHashMap();
        userVariableHashMap.put(key, value);
        log.info(String.format("'%s' değişkenine '%s' değeri atandı", key, value));
    }

    private static void initUserVariableHashMap() {
        if (userVariableHashMap == null)
            userVariableHashMap = new HashMap<>();
    }

    public static String getVarilableValue(String variableName) {

        String variableValue = userVariableHashMap.get(variableName);
        if (AllianzUtils.isNullOrEmpty(variableName)) {
            String logMessage = String.format("Kullanıcı değişkenleri içerisinde '%s' değişkeni bulunamadı!", variableName);
            log.error(logMessage);
            Assert.fail(logMessage);
        }
        return variableValue;
    }
}
