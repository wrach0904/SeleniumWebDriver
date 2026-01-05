package com.saucedemo;

import com.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    private By productHeader = By.xpath("//span[text()=\"Products\"]");

    public boolean isProductHeaderDisplayed(){
        return find(productHeader).isDisplayed();
    }

}
