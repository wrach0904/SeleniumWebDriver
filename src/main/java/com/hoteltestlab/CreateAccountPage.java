package com.hoteltestlab;

import org.openqa.selenium.By;

public class CreateAccountPage extends BasePage {

    private By nameInput = By.id("customer_firstname");
    private By lastNameInput = By.id("customer_lastname");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("passwd");
    private By submitButton = By.xpath("//*[@id=\"submitAccount\"]");

    public void createAccount(String email, String name, String surname, String password){
        type(nameInput, name);
        type(lastNameInput, surname);
        clear(emailInput);
        type(emailInput, email);
        type(passwordInput, password);
        click(submitButton);
    }


}
