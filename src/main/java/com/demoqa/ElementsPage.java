package com.demoqa;


import org.openqa.selenium.By;


public class ElementsPage extends HomePage {

    private By webTables = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");

    public WebTablesPage clickWebTables() {
        click(webTables);
        return new WebTablesPage();
    }
}
