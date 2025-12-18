package pl.mystoretestlab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClothesPage extends BasePage {

    private By hummingbirdSweater = By.xpath("//*[@id='js-product-list']/div[1]/div[1]/article/div/div[2]/h2/a");
    private By raiseQuantity = By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div/div[1]/div/span[3]/button[1]");
    private By sizeField = By.id("group_1");
    private By sSize = By.xpath("//*[@id='group_1']/option[1]");
    private By mSize = By.xpath("//*[@id='group_1']/option[2]");;
    private By lSize = By.xpath("//*[@id='group_1']/option[3]");;
    private By xlSize = By.xpath("//*[@id='group_1']/option[4]");;
    private By addToCartButton = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");
    private By proceedToCheckoutButton = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");
    private By proceedToCheckoutButton2 = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a");


    public void orderHummingbirdSweater(char size, int quantity){
        click(hummingbirdSweater);

        for (int i=1; i < quantity; i ++) {
          click(raiseQuantity);
        }

        click(sizeField);
        if (size == 'S'){
            click(sSize);
        } else if ( size == 'M'){
            click(mSize);
        } else if ( size == 'L') {
            click(lSize);
        } else if (size == 'X'){
            click(xlSize);
        }
    }

    public void addToCart(){
        click(addToCartButton);
    }

    public void proceedToCheckout(){
        click(proceedToCheckoutButton);
        click(proceedToCheckoutButton2);
    }

    public String checkDiscount() {
        WebElement discountFieldForSweater = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/div[1]/article/div/ul/li"));
        String discount = discountFieldForSweater.getText();
        if (discount.equals("-20%")) {
            System.out.println("Hummingbird Printed Sweater: " + discount + " discount!");
        }
        return discount;
    }
}
