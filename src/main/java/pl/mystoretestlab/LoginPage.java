package pl.mystoretestlab;

import com.hoteltestlab.CreateAccountPage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private By createAccountButton = By.linkText("No account? Create one here");
    private By emailField = By.xpath("//*[@id=\'field-email\']");
    private By passwordField = By.xpath("//*[@id=\'field-password\']");
    private By signInButton = By.id("submit-login");


    public CreateAccountPage clickCreateAccountButton(){
        click(createAccountButton);
        return new CreateAccountPage();
    }

    public void loginTheUser(String email, String passwd){
        type(emailField, email);
        type(passwordField, passwd);
        click(signInButton);
    }

}
