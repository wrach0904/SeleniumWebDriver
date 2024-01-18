package pl.mystoretestlab;

import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class OrderConfirmation extends BasePage{

    private By priceTotalProducts = By.xpath("//*[@id=\"order-items\"]/div[2]/div/div[3]/div/div[3]");
    private By userName = By.className("account");


    public void takeScreenshot() {
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try{
            Files.move(screenshot, new File("src/test/resources/screenshots/testscreenshot.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void goToMyAccountPage(){
        click(userName);
    }

    public String checkPrice(){
        return getText(priceTotalProducts);
    }
}
