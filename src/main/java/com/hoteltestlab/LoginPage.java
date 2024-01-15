package com.hoteltestlab;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By emailAddressInput = By.className("is_required");
    private By passwordInput = By.id("passwd");
    private By emailAddressLoginInput = By.id("email");
    private By submitLogin = By.id("SubmitLogin");
    private By submitCreate = By.id("SubmitCreate");
    private By loginAssertCheck = By.className("page-heading");


    public void logInUser(String email, String password){
        type(emailAddressLoginInput, email);
        type(passwordInput, password);
        click(submitLogin);
    }

    public void goToCreateAccountPage(String email){
        type(emailAddressInput, email);
        click(submitCreate);
    }

    public String loginAssertCheck(){
        return getText(loginAssertCheck);
    }


}
