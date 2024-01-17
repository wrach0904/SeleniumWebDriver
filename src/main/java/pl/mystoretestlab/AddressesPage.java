package pl.mystoretestlab;

import org.openqa.selenium.By;

public class AddressesPage extends BasePage{
    private By createNewAddressButton = By.xpath("//*[@id=\"content\"]/div[3]/a");
    private By assertingAddress = By.xpath("//*[@id=\"content\"]/div[2]");
    private By deleteButton = By.xpath("/html/body/main/section/div/div/section/section/div[2]/article/div[2]/a[2]");
    private By assertDelete = By.xpath("//*[@id=\"notifications\"]/div/article/ul");

    public NewAddressPage goToNewAddressPage(){
        click(createNewAddressButton);
        return new NewAddressPage();
    }

    public String getAddressAssert(){
        return getText(assertingAddress);
    }

    public void deleteAddress(){
        click(deleteButton);
    }

    public String getDeleteAssert(){
        return getText(assertDelete);
    }

    public String theAddress(){
        return "My Address 02\n" + "Wiktoria Chmielewska\n" + "Oxford St\n" + "33\n" + "Liverpool\n" +
                "L69\n" + "United Kingdom\n" + "669797516\n" ;
    }
}
