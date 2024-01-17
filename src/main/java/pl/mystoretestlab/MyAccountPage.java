package pl.mystoretestlab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePage {

    private By information = By.xpath("//*[@id=\"identity-link\"]");
    private By addresses = By.xpath("//*[@id=\"addresses-link\"]");
    private By orderHistory = By.xpath("//*[@id=\"history-link\"]");
    private By creditSlips = By.xpath("//*[@id=\"order-slips-link\"]");
    private By myWishlists = By.xpath("//*[@id=\"wishlist-link\"]");
    private By clothesButton = By.xpath("//*[@id=\"category-3\"]/a");
    private By womenButton = By.xpath("//*[@id=\"category-5\"]/a");

    public AddressesPage goToAddressesPage(){
        click(addresses);
        return new AddressesPage();
    }

    public void goToWomenClothesPage(){
        hoverOver(clothesButton);
        click(womenButton);
    }

}
