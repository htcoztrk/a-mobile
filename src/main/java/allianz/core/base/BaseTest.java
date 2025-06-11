package allianz.core.base;

import allianz.core.config.AllianzGlobalConfig;
import allianz.core.driver_manager.DriverManager;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.ExecutionContext;
import com.thoughtworks.gauge.Step;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseTest {

    private Logger log = Logger.getLogger(BaseTest.class);

    @BeforeScenario
    public void setUp(ExecutionContext context) {
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        AllianzGlobalConfig.CurrentScenarioName = context.getCurrentScenario().getName();
        log.info(String.format("********** %s SENARYOSU BAŞLADI **********", AllianzGlobalConfig.CurrentScenarioName.toUpperCase()));
    }

    @AfterScenario
    public void tearDown() {

        //DriverManager.killDriver();
        log.info(String.format("********** %s SENARYOSU BİTTİ **********", AllianzGlobalConfig.CurrentScenarioName.toUpperCase()));
    }

    @Step("<ortam> ortamında çalıştır")
    public void setEnvironment(String environment) {

        if ("and".equals(environment.toLowerCase()))
            AllianzGlobalConfig.IsTestRunningOnAndroidDevice = true;
    }

    @Step("Testi başlat")
    public void startTest() {

        DriverManager.initDriver();
        AllianzGlobalConfig.writeGlobalConfiguration();
    }
}
