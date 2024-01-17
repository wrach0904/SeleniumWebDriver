package pl.mystoretestlab;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {

    private By information = By.xpath("//*[@id=\"identity-link\"]");
    private By addresses = By.xpath("//*[@id=\"addresses-link\"]");
    private By orderHistory = By.xpath("//*[@id=\"history-link\"]");
    private By creditSlips = By.xpath("//*[@id=\"order-slips-link\"]");
    private By myWishlists = By.xpath("//*[@id=\"wishlist-link\"]");

    public AddressesPage goToAddressesPage(){
        click(addresses);
        return new AddressesPage();
    }

}
