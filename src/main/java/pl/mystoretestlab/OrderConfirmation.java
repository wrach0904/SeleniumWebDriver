package pl.mystoretestlab;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class OrderConfirmation extends BasePage{

    public void takeScreenshot() {
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try{
            Files.move(screenshot, new File("src/test/resources/screenshots/testscreenshot.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
