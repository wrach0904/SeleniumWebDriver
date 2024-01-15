package com.hoteltestlab;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {

    private By orderHistory = By.xpath("//a[@title='Orders']");
    private By creditSlips = By.xpath("//a[@title='Credit slips']");
    private By myAddresses = By.xpath("//a[@title='Addresses']");
    private By myPersonalInfo = By.xpath("//a[@title='Information']");

    public void goToOrderHistoryPage(){
        click(orderHistory);
    }

    public void goToCreditSlipsPage(){
        click(creditSlips);
    }

    public void goToAddressesPage(){
        click(myAddresses);
    }

    public void goToIdentityPage(){
        click(myPersonalInfo);
    }

    public void goToPreviousPage() {
        driver.navigate().back();
    }
}
