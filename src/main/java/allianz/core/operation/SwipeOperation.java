package allianz.core.operation;

import allianz.core.driver_manager.DriverManager;
import allianz.core.utils.Direction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang.NotImplementedException;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;


import java.time.Duration;

public class SwipeOperation {

    private Logger log = Logger.getLogger(SwipeOperation.class);

    public void swipeScreen(Direction direction) {

        final int ANIMATION_TIME = 500;
        final int PRESS_TIME = 500;
        int borderThickness = 10; // kenar noktaların tahmini kalınlığı

        PointOption pointOptionStart, pointOptionEnd;

        Dimension screenSize = DriverManager.getDriver().manage().window().getSize();

        pointOptionStart = PointOption.point(screenSize.width / 2, screenSize.height / 2);

        switch (direction) {
            case DOWN: // merkez noktasından aşağı
                pointOptionEnd = PointOption.point(screenSize.width / 2, screenSize.height - borderThickness);
                break;
            case UP: // merkez noktasından yukarı
                pointOptionEnd = PointOption.point(screenSize.width / 2, borderThickness);
                break;
            case LEFT: // merkez noktasından sola
                pointOptionEnd = PointOption.point(borderThickness, screenSize.height / 2);
                break;
            case RIGHT: // merkez noktasından sağa
                pointOptionEnd = PointOption.point(screenSize.width - borderThickness, screenSize.height / 2);
                break;
            default:
                Assert.fail(String.format("Merkezkaç kuvveti aklımızı aldı! '%s' şeklinde yön tanımlı değil!", direction));
                throw new NotImplementedException();
        }

        try {
            new TouchAction(DriverManager.getDriver())
                    .press(pointOptionStart)
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();

            Thread.sleep(ANIMATION_TIME);
        } catch (Exception e) {
            log.error("Swipe işlemi yapılırken sorun oluştu! Hata mesajı: " + e.getMessage());
        }
    }

    public void swipeFromObject(String key, Direction direction){
        final int PRESS_TIME = 500;
        int borderThickness = 10; // kenar noktaların tahmini kalınlığı
        Dimension screenSize = DriverManager.getDriver().manage().window().getSize();

        WaitOperation waitOperation = new WaitOperation();
        waitOperation.waitPresence(key);
        MobileElement object = waitOperation.waitVisible(key);
        Point objCoordinates = object.getCenter();
        PointOption swipeEndingPoint;
        switch (direction) {
            case DOWN: // merkez noktasından aşağı
                swipeEndingPoint = PointOption.point(objCoordinates.getX(), screenSize.height - borderThickness);
                break;
            case UP: // merkez noktasından yukarı
                swipeEndingPoint = PointOption.point(objCoordinates.getX(), borderThickness);
                break;
            case LEFT: // merkez noktasından sola
                swipeEndingPoint = PointOption.point(borderThickness, objCoordinates.getY());
                break;
            case RIGHT: // merkez noktasından sağa
                swipeEndingPoint = PointOption.point(screenSize.width - borderThickness, objCoordinates.getY());
                break;
            default:
                Assert.fail(String.format("Merkezkaç kuvveti aklımızı aldı! '%s' şeklinde yön tanımlı değil!", direction));
                throw new NotImplementedException();
        }
        new TouchAction<>(DriverManager.getDriver())
                .press(PointOption.point(objCoordinates))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                .moveTo(swipeEndingPoint)
                .release()
                .perform();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            log.error(key + " objesinden swipe işlemi yapılırken sorun oluştu! Hata mesajı: " + e.getMessage());
        }

    }

    public boolean swipeFromObjectUntilTextValueIsSeen(String key, String value, Direction direction, String searchDuration){
        long waitingDuration = Integer.parseInt(searchDuration);
        long startTime = System.currentTimeMillis();
        boolean textExists = false;
        while(((System.currentTimeMillis() - startTime) < (waitingDuration * 1000))){
            if(DriverManager.getDriver().getPageSource().contains(value)){
                textExists = true;
                break;
            }
            else{
                swipeFromObject(key,direction);
            }
        }

        return textExists;
    }
}
