package com.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.PrintsPage;

public class WebTablesPage extends ElementsPage{

    private By editAgeField = By.id("age");
    private By submitButton = By.id("submit");

    public void clickEdit(String email){
        By edit = By.xpath("//div[text()='"+ email +"']//following::span[@title='Edit']");
        click(edit);
    }

    public void setAge(String age){
        set(editAgeField, age);
    }

    public void clickSumbitButton(){
        click(submitButton);
    }

    public String getAge(String email){
        By tableAge = By.xpath
                ("//div[text()='"+ email +"']//preceding::div[1]"); //locating by index
        return find(tableAge).getText();
    }
}
