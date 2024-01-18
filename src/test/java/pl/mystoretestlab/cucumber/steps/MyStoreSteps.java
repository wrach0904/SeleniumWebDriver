package pl.mystoretestlab.cucumber.steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pl.mystoretestlab.*;
import pl.mystoretestlab.selenium.BaseTest;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MyStoreSteps extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AddressesPage addressesPage = new AddressesPage();
    NewAddressPage newAddressPage = new NewAddressPage();
    ClothesPage clothesPage = new ClothesPage();
    OrderControlPage orderControlPage = new OrderControlPage();
    OrderConfirmation orderConfirmation = new OrderConfirmation();
    OrderHistoryPage orderHistoryPage = new OrderHistoryPage();


    @Given("an open mystore login page")
    public void goingToLoginPage(){
        setUp();
        loadApplication();
        myStorePage.goToLoginPage();
    }

    @Given("a logged in user")
    public void loggingTheUser(){
        setUp();
        loadApplication();
        myStorePage.goToLoginPage();
        loginPage.loginTheUser("examination@cwmxc.com", "Abcd1234");
    }

    @When("user logins with their valid credentials")
    public void userLogin(){
        loginPage.loginTheUser("examination@cwmxc.com", "Abcd1234");
    }

    @When("a Hummingbird Printed Sweater {} size {}x is added to the cart")
    public void addProductToTheCart(char size, int quantity){
        myAccountPage.goToWomenClothesPage();
        Assert.assertEquals("Discount isn't equal to -20%.", "-20%",
                clothesPage.checkDiscount());
        clothesPage.orderHummingbirdSweater(size, quantity);
        clothesPage.addToCart();
        clothesPage.proceedToCheckout();
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

    @Then("user buys the products {} {}")
    public void buyingTheProducts(String delivery, String payment){
        orderControlPage.proceedOrder(delivery, payment);
    }

    @And("receipt screenshot is taken")
    public void takeScreenshot(){
        orderConfirmation.takeScreenshot();
    }

    @And("user checks order history")
    public void orderHistory(){
        String orderPrice = orderConfirmation.checkPrice();
        orderConfirmation.goToMyAccountPage();
        myAccountPage.goToOrderHistoryPage();
        Assert.assertEquals("Price doesn't match!", orderPrice,
                orderHistoryPage.checkPrice());
        Assert.assertEquals("Status doesn't match!", "Awaiting check payment",
                orderHistoryPage.checkStatus());
    }

    @And("quit the browser")
    public void quitBrowser(){
        //tearDown();
    }


}
