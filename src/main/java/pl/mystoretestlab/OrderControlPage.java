package pl.mystoretestlab;

import org.openqa.selenium.By;

public class OrderControlPage extends BasePage {
    private By continueAddressButton = By.name("confirm-addresses");
    private By continueShippingButton = By.xpath("//*[@id=\"js-delivery\"]/button");
    private By carrierOption = By.id("delivery_option_6");
    private By checkOption = By.id("payment-option-1");
    private By wireOption = By.id("payment-option-2");
    private By agreeToTermsButton = By.id("conditions_to_approve[terms-and-conditions]");
    private By placeOrderButton = By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button");


    public void proceedOrder(String pickORcarrier, String checkORwire){
        click(continueAddressButton);
        if (pickORcarrier.equals("pick")){
            click(continueShippingButton);
        } else {
            click(carrierOption);
            click(continueShippingButton);
        }

        if (checkORwire.equals("check")){
            click(checkOption);
        } else {
            click(wireOption);
        }

        click(agreeToTermsButton);
        click(placeOrderButton);
    }
}
