package pl.mystoretestlab;


import org.openqa.selenium.By;

public class MyStorePage extends BasePage {

    private By signInButton = By.xpath("//span[text()='Sign in']");
    private By signOutButton = By.xpath("//*[@id=\'_desktop_user_info\']/div/a[1]");
    private By addressesButton = By.xpath("//*[@id=\'footer_account_list\']/li[4]/a");
    private By loggedUsername = By.xpath("//a[@class='account']");


    public LoginPage goToLoginPage(){
        click(signInButton);
        return new LoginPage();
    }

    public void clickSignInPageButton(){
        click(signInButton);
    }

    public void clickSignOutPageButton(){
        click(signOutButton);
    }

    public void clickAddressesButton(){
        click(addressesButton);
    }

    public void checkLoggedUsername(){
        getText(loggedUsername);
    }

    /* ASSERT IN TEST!
    public void isUserLoggedOut(){
        Assert.assertEquals(getText(signInPageButton), "\uE7FF Sign in",
                "USER LOGGED IN!");
    }

    public void isUserLoggedIn(){
        Assert.assertEquals(getText(signOutPageButton), "\uE7FF Sign out",
                "USER NOT LOGGED IN!");
    }

     */
}
