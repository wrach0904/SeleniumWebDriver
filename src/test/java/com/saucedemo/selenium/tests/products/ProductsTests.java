package com.saucedemo.selenium.tests.products;

import com.saucedemo.ProductsPage;
import com.saucedemo.selenium.base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ProductsTests extends BaseTest{

    @Test
    public void testProductsHeaderIsDisplayed(){
        ProductsPage productsPage = loginPage.logIntoApp("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductHeaderDisplayed(), "\n Products Header is not Displayed \n");


    }


}
