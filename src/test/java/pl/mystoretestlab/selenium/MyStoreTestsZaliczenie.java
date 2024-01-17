package pl.mystoretestlab.selenium;

import org.testng.annotations.Test;
import pl.mystoretestlab.AddressesPage;
import pl.mystoretestlab.LoginPage;
import pl.mystoretestlab.MyAccountPage;
import pl.mystoretestlab.NewAddressPage;

import static org.junit.Assert.*;

public class MyStoreTestsZaliczenie extends BaseTest {
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AddressesPage addressesPage = new AddressesPage();
    NewAddressPage newAddressPage = new NewAddressPage();

    @Test
    public void Zadadnie1() {
        myStorePage.goToLoginPage();
        loginPage.loginTheUser("ehkigoieqhsgmkymjt@cwmxc.com", "Abcd1234");
        myAccountPage.goToAddressesPage();
        addressesPage.goToNewAddressPage();
        newAddressPage.enterNewAddress("My Address 02", "Oxford St", "33",
                                    "Liverpool", "L69", "669797516");
        assertTrue("Input doesn't match", addressesPage.getAddressAssert().contains(addressesPage.theAddress()));

        addressesPage.deleteAddress();
        assertEquals("Address wasn't deleted.", "Address successfully deleted!",
                        addressesPage.getDeleteAssert());
    }


    /*
        dane powinny być pobierane z tabeli Examples w Gherkinie
        (alias, address, city, zip/postal code, country, phone),
    -sprawdzi czy dane w dodanym adresie są poprawne.

    @Test
    public void Zadadnie2(){

    }
     */
}
