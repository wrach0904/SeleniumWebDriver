package com.demoqa;

import com.BasePage;
import org.openqa.selenium.*;

import static com.demoqa.utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private  By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private  By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");

    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }
}

