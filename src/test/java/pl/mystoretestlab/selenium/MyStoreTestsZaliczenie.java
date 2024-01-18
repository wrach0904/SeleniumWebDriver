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
    OrderHistoryPage orderHistoryPage = new OrderHistoryPage();


    @Test
    public void Zadadnie1() {
        myStorePage.goToLoginPage();
        loginPage.loginTheUser("examination@cwmxc.com", "Abcd1234");
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
        loginPage.loginTheUser("examination@cwmxc.com", "Abcd1234");
        myAccountPage.goToWomenClothesPage();
        assertEquals("Discount isn't equal to -20%.", "-20%",
                clothesPage.checkDiscount());
        clothesPage.orderHummingbirdSweater('M', 5);
        clothesPage.addToCart();
        clothesPage.proceedToCheckout();
        orderControlPage.proceedOrder("pick", "check");
        orderConfirmation.takeScreenshot();
        String orderPrice = orderConfirmation.checkPrice();
        orderConfirmation.goToMyAccountPage();
        myAccountPage.goToOrderHistoryPage();
        assertEquals("Price doesn't match!", orderPrice,
                orderHistoryPage.checkPrice());
        assertEquals("Status doesn't match!", "Awaiting check payment",
                orderHistoryPage.checkStatus());
    }

}
