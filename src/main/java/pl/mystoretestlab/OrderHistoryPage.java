package pl.mystoretestlab;

import org.openqa.selenium.By;

public class OrderHistoryPage extends BasePage {
    private By firstPrice = By.className("text-xs-right");
    private By firstStatus = By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[4]/span");

    public String checkPrice(){
        return getText(firstPrice);
    }

    public String checkStatus(){
        return getText(firstStatus);
    }
}
