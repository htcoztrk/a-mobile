package allianz.core.implementation;

import allianz.core.base.BasePage;
import allianz.core.config.AllianzGlobalConfig;
import allianz.core.driver_manager.DriverManager;
import allianz.core.operation.*;
import allianz.core.path_manager.PathEnum;
import allianz.core.path_manager.PathManager;
import allianz.core.user_variable.UserVariable;
import allianz.core.utils.Direction;
import com.codoid.products.fillo.Recordset;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.junit.Assert;

import java.sql.Driver;

import static allianz.core.config.AllianzGlobalConfig.APP_PACKAGE;
import static allianz.core.config.AllianzGlobalConfig.BUNDLE_ID;

public class StepImplementation {

    private Logger log = Logger.getLogger(StepImplementation.class);
    private String logMessage = "";

    @Step("<key> alanına <value> yaz")
    public void sendKeys(String key, String value) {

        new SendKeyOperation().sendKeys(key, value);
        logMessage = String.format("'%s' alanına '%s' yazıldı.", key, value);
        log.info(logMessage);
    }

    @Step("<key> alanını temizle")
    public void clear(String key) {

        new BasePage().clear(key);
    }

    @Step("<key> objesine tıkla")
    public void click(String key) {

        new ClickOperation().click(key);
        logMessage = String.format("'%s' objesine tıklandı.", key);
        log.info(logMessage);
    }

    @Step("<key> objesi varsa tıkla")
    public void clickIfExist(String key) {

        new ClickOperation().clickIfExists(key, 3);
    }

    @Step("<key> objesi var mı kontrol et")
    public void checkIsTheObjectExist(String key) {

        boolean isExist = new WaitOperation().isExist(key, 30);

        if (!isExist) {
            logMessage = String.format("'%s' objesi sayfa üzerinde bulunamadı!", key);
            log.error(logMessage);
            Assert.fail(logMessage);
        }
        log.info(String.format("'%s' objesi sayfa üzerinde bulundu.", key));
    }

    @Step("<second> saniye bekle")
    public void wait(int second) {
        new WaitOperation().waitDoNotWriteToLogFile(second);
    }

    @Step("<key> objesi görüntülenene kadar bekle")
    public void waitTillTheObjectVisible(String key) {

        new WaitOperation().waitVisible(key);
        log.info(String.format("'%s' objesi görüntülenene kadar beklendi.", key));
    }

    @Step("<yön> kaydır")
    public void swipeScreen(String yon) {

        Direction direction = null;
        switch (yon) {
            case "YUKARI":
                direction = Direction.UP;
                break;
            case "AŞAĞI":
                direction = Direction.DOWN;
                break;
            case "SAĞA":
                direction = Direction.RIGHT;
                break;
            case "SOLA":
                direction = Direction.LEFT;
                break;
            default:
                break;
        }
        new SwipeOperation().swipeScreen(direction);
        log.info(String.format("'%s' yönünde kaydırma işlemi yapıldı.", yon));
    }

    @Step("Sayfa üzerinde <text> değeri var mı kontrol et")
    public void waitUntilTextLoadedIntoPageSource(String text) {

        new WaitOperation().waitUntilTextIsLoadedInToPageSource(text);
        log.info(String.format("Sayfa kaynağında '%s' değeri bulundu!", text));
    }

    @Step("Giriş bilgilerini bul. TCKN değerini <tckn> değişkenine PAROLA değerini <parola> değişkenine kaydet")
    public void findProperLoginDataAndThenSaveToUserVariable(String tckn, String pass) {

        String phoneName = AllianzGlobalConfig.CurrentPhoneName;
        String scenarioName = AllianzGlobalConfig.CurrentScenarioName;

        ExcelOperation excelOperation = new ExcelOperation();
        excelOperation.openExcelConnection(PathManager.getPath(PathEnum.MOBILE_DATA));

        String command = String.format("SELECT * FROM \"Mobile_Regression_Data\" WHERE \"TELEFON_ADI\" ='%s' AND \"SENARYO_ADI\" ='%s'", phoneName, scenarioName);
        //String command = String.format("SELECT * FROM \"Mobile_Regression_Data\" WHERE \"TELEFON_ADI\" = 'GALAXY_A70'");
        Recordset recordset = excelOperation.executeQuery(command);

        try {
            String logMessage = "---------- SORGU SONUCU ----------";
            log.info(logMessage);
            String foundTCKN = "";
            String foundPwd = "";
            while (recordset.next()) {
                foundTCKN = recordset.getField("USERNAME");
                foundPwd = recordset.getField("PASSWORD");
                log.info(String.format("USERNAME: '%s' PASSWORD: '%s'", foundTCKN, foundPwd));
            }
            log.info(logMessage);
            UserVariable.addVariableToUserVariableHashMap(tckn,foundTCKN);
            UserVariable.addVariableToUserVariableHashMap(pass, foundPwd);

        } catch (Exception ex) {
            log.error(ex.getStackTrace());
        }
        excelOperation.closeExcelConnection();

        //UserVariable.addVariableToUserVariableHashMap(tckn,"10102644750");
        //UserVariable.addVariableToUserVariableHashMap(pass, "Kalem2016");
    }

    @Step("<key> alanına <variableName> değişkenini yaz")
    public void implementation1(String key, String variableName) {
        String variableValue = UserVariable.getVarilableValue(variableName);
        sendKeys(key, variableValue);
    }

    @Step("Uygulamayı sil")
    public void removeApplication() {

        if (AllianzGlobalConfig.IsTestRunningOnAndroidDevice)
            DriverManager.getDriver().removeApp(APP_PACKAGE);
        else
            DriverManager.getDriver().removeApp(BUNDLE_ID);
    }

    @Step("Mobil Data excel dosyasını temizle")
    public void implementation2() {

        ExcelOperation excelOperation = new ExcelOperation();
        String mobileDataPath = PathManager.getPath(PathEnum.MOBILE_DATA);
        excelOperation.openExcelConnection(mobileDataPath);
        excelOperation.executeUpdate("DELETE FROM Mobile_Regression_Data");
        excelOperation.closeExcelConnection();
    }

    @Step("<xPoint> X ve <yPoint> Y Koordinatları ile tıkla")
    public void clickWithCoordinate(int x, int y){
        new ClickOperation().clickWithXAndYCoordinates(x,y);
        logMessage = String.format("'%s'X ve '%s'Y koordinatları ile tıklandı.", x,y);
        log.info(logMessage);
    }

    @Step("<key> objesine AC ile tıkla")
    public void clickWithActions(String key){
        new ClickOperation().clickWithTouchAction(key);
        logMessage = String.format("'%s' objesine AC ile tıklandı.", key);
        log.info(logMessage);
    }

    @Step("bu senaryonun implementasyonu sonra yapılacak")
    public void bosTest() {
        log.info("Boş senaryolar mevcut");
    }


    @Step("<key> objesinden <direction> kaydır")
    public void swipeOnObject(String key, String direction){
        Direction dir = null;
        switch (direction) {
            case "YUKARI":
                dir = Direction.UP;
                break;
            case "AŞAĞI":
                dir = Direction.DOWN;
                break;
            case "SAĞA":
                dir = Direction.RIGHT;
                break;
            case "SOLA":
                dir = Direction.LEFT;
                break;
            default:
                break;
        }
        new SwipeOperation().swipeFromObject(key, dir);
        logMessage = String.format("'%s' objesinden %s swipe yapıldı.", key, direction);
        log.info(logMessage);
    }

    @Step("<key> objesinin yokluğunu kontrol et")
    public void checkIsTheObjectDoesntExist(String key) {

        boolean isExist = new WaitOperation().isExist(key, 30);

        if (isExist) {
            logMessage = String.format("'%s' objesi sayfa üzerinde bulunmamalıdır!", key);
            log.error(logMessage);
            Assert.fail(logMessage);
        }
        log.info(String.format("'%s' objesi sayfa üzerinde yoktur.", key));
    }

    @Step("<key> objesi <value> text değerini içeriyor mu kontrol et")
    public void checkIfObjectHasGivenTextValue(String key, String value){
        MobileElement mobileElement = new WaitOperation().waitVisible(key);
        if(!mobileElement.getText().contains(value)){
            logMessage = String.format("'%s' objesi %s text değerini içermemektedir!", key, value);
            log.error(logMessage);
            Assert.fail(logMessage);
        }
        else{
            log.info(String.format("'%s' objesi %s text değerini içermektedir.", key, value));
        }
    }

    @Step("<key> objesinden <value> text değeri görüntülenene kadar <duration> saniye boyunca <direction> kaydır")
    public void swipeFromObjectUntilTextValueIsSeen(String key, String value, String duration, String direction){
        Direction dir = null;
        switch (direction) {
            case "YUKARI":
                dir = Direction.UP;
                break;
            case "AŞAĞI":
                dir = Direction.DOWN;
                break;
            case "SAĞA":
                dir = Direction.RIGHT;
                break;
            case "SOLA":
                dir = Direction.LEFT;
                break;
            default:
                break;
        }

        boolean textExists = new SwipeOperation().swipeFromObjectUntilTextValueIsSeen(key,value,dir,duration);
        if(textExists){
            log.info(value + " değeri " + duration + " süresince sayfa üzerinde bulundu!");
        }
        else{
            String logMessage = value + " değeri " + duration + " süresince sayfa üzerinde bulunamadı!";
            Assert.fail(logMessage);
            log.error(logMessage);
        }

    }

    @Step("<key> objesinin tıklanabilir olmadığını kontrol et")
    public void checkIfDisabled(String key){
        MobileElement mobileElement = new WaitOperation().waitVisible(key);
        String logMessage;
        if(mobileElement.isEnabled()){
            logMessage = key + " objesi tıklanabilir olmamalıdır!";
            log.error(logMessage);
            Assert.fail(logMessage);
        }
        else{
            logMessage = key + " objesi tıklanabilir değildir.";
            log.info(logMessage);
        }

    }

    @Step("<key> objesinin tıklanabilir olduğunu kontrol et")
    public void checkIfEnabled(String key){
        MobileElement mobileElement = new WaitOperation().waitVisible(key);
        String logMessage;
        if(!mobileElement.isEnabled()){
            logMessage = key + " objesi tıklanabilir olmalıdır!";
            log.error(logMessage);
            Assert.fail(logMessage);
        }
        else{
            logMessage = key + " objesi tıklanabilirdir.";
            log.info(logMessage);
        }

    }

    @Step("<key> objesi text değeri içeriyor mu kontrol et")
    public void checkIfObjectContainsTextValue(String key){
        MobileElement mobileElement = new WaitOperation().waitVisible(key);
        if(mobileElement.getText().equals("")){
            logMessage = String.format("'%s' objesi text değeri içermemektedir!", key);
            log.error(logMessage);
            Assert.fail(logMessage);
        }
        else{
            log.info(String.format("'%s' objesi text değeri içermektedir.", key));
        }
    }

}
