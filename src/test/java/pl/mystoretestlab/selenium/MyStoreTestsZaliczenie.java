package pl.mystoretestlab.selenium;

import org.testng.annotations.Test;
import pl.mystoretestlab.*;

import static org.junit.Assert.*;

public class MyStoreTestsZaliczenie extends BaseTest {
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AddressesPage addressesPage = new AddressesPage();
    NewAddressPage newAddressPage = new NewAddressPage();
    ClothesPage clothesPage = new ClothesPage();
    OrderControlPage orderControlPage = new OrderControlPage();
    OrderConfirmation orderConfirmation = new OrderConfirmation();

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

    @Test
    public void Zadadnie2() {
        myStorePage.goToLoginPage();
        loginPage.loginTheUser("ehkigoieqhsgmkymjt@cwmxc.com", "Abcd1234");
        myAccountPage.goToWomenClothesPage();
        assertEquals("Discount isn't equal to -20%.", "-20%",
                clothesPage.checkDiscount());
        clothesPage.orderHummingbirdSweater('M', 5);
        clothesPage.addToCart();
        clothesPage.proceedToCheckout();
        orderControlPage.proceedOrder("pick", "check");
        orderConfirmation.takeScreenshot();
    }

    /*

    wybierze do zakupu Hummingbird Printed Sweater (opcja dodatkowa: sprawdzi czy rabat na niego wynosi 20%),
    wybierze rozmiar M (opcja dodatkowa: zrób tak żeby można było sparametryzować rozmiar i wybrać S,M,L,XL),
    wybierze 5 sztuk według parametru podanego w teście (opcja dodatkowa: zrób tak żeby można było sparametryzować liczbę sztuk),
    dodaj produkt do koszyka,
    przejdzie do opcji - checkout,
    potwierdzi address (możesz go dodać wcześniej ręcznie),
    wybierze metodę odbioru - PrestaShop "pick up in store",
    wybierze opcję płatności - Pay by Check,
    kliknie na "order with an obligation to pay",
    zrobi screenshot z potwierdzeniem zamówienia i kwotą.
     */
}
