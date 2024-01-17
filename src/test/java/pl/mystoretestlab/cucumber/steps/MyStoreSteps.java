package pl.mystoretestlab.cucumber.steps;

import io.cucumber.java.en.*;
import pl.mystoretestlab.*;
import pl.mystoretestlab.selenium.BaseTest;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MyStoreSteps extends BaseTest {

    pl.mystoretestlab.LoginPage loginPage = new LoginPage();
    pl.mystoretestlab.MyAccountPage myAccountPage = new MyAccountPage();
    pl.mystoretestlab.AddressesPage addressesPage = new AddressesPage();
    NewAddressPage newAddressPage = new NewAddressPage();


    @Given("an open mystore login page")
    public void goingToLoginPage(){
        setUp();
        loadApplication();
        myStorePage.goToLoginPage();
    }

    @When("user logins with their valid credentials")
    public void userLogin(){
        loginPage.loginTheUser("ehkigoieqhsgmkymjt@cwmxc.com", "Abcd1234");
    }


    @Then("they can add their new address {}  {} {} {} {} {}")
    public void enterNewAddress(String alias, String street, String house, String city, String zipcode, String phone) {
        myAccountPage.goToAddressesPage();
        addressesPage.goToNewAddressPage();
        newAddressPage.enterNewAddress(alias, street, house, city, zipcode, phone);
        assertTrue("Input doesn't match", addressesPage.getAddressAssert().contains(addressesPage.theAddress()));

        addressesPage.deleteAddress();
        assertEquals("Address wasn't deleted.", "Address successfully deleted!",
                addressesPage.getDeleteAssert());
    }


    @And("quit the browser")
    public void quitBrowser(){
        tearDown();
    }


}
