package allianz.core.config;

import org.apache.log4j.Logger;

public class AllianzGlobalConfig {

    private static Logger log = Logger.getLogger(AllianzGlobalConfig.class);

    public static final int DEFAULT_WAIT = 30;
    public static final int SLEEP_IN_MILLIS = 500;

    public static final String APP_PACKAGE = "com.accenture.oneapp.prep";
    public static final String APP_ACTIVITY = "com.accenture.oneapp.ui.settings.ui.MASplashScreenActivity";
    public static final String BUNDLE_ID = "com.allianztr.myallianz.prep";

    public static String CurrentPhoneName = "GALAXY_A70";
    public static String CurrentPhoneVersion = "";
    public static String CurrentScenarioName = "";
    public static boolean IsTestRunningOnAndroidDevice = false;



    public static void writeGlobalConfiguration() {

        log.info("********** KONFİGÜRASYON BİLGİLERİ **********");
        log.info(String.format("Varsayılan bekleme süresi: %s saniye", DEFAULT_WAIT));
        log.info(String.format("Objelerin milisaniye cinsinden kontrol edilme süresi: %s", SLEEP_IN_MILLIS));
        log.info(String.format("Telefon adı: '%s'", CurrentPhoneName));
        log.info(String.format("Telefon versiyonu: '%s'", CurrentPhoneVersion));
        log.info(String.format("Test Android platformunda mı çalışıyor?: %s", IsTestRunningOnAndroidDevice));
        log.info("********** KONFİGÜRASYON BİLGİLERİ **********");
    }
}
