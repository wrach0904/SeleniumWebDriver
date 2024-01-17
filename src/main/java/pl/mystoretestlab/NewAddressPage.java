package pl.mystoretestlab;

import org.apache.commons.lang3.RandomStringUtils;
import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Random;

public class NewAddressPage extends BasePage {

    private By streetField = By.id("field-address1");
    private By houseNo = By.id("field-address2");
    private By cityField = By.id("field-city");
    private By zipCodeField = By.id("field-postcode");
    private By saveButton = By.className("form-control-submit");
    private By aliasField = By.id("field-alias");
    private By phoneField = By.id("field-phone");



    public void enterNewRandomAddress(){
        type(aliasField, "MyAddress"+RandomStringUtils.random(2, false, true));
        type(streetField, generateRandomStreet());
        type(houseNo, generateRandomHouseNumber());
        type(cityField, generateRandomCity());
        type(zipCodeField, generateRandomZipCode());
        click(saveButton);
    }

    public void enterNewAddress(String alias, String street, String house, String city, String zipcode, String phone){
        type(aliasField, alias);
        type(streetField, street);
        type(houseNo, house);
        type(cityField, city);
        type(zipCodeField, zipcode);
        type(phoneField, phone);
        click(saveButton);
    }


    private String generateRandomStreet(){
        return streets[new Random().nextInt(streets.length)];
    }

    private String generateRandomCity(){
        return cities[new Random().nextInt(cities.length)];
    }

    private String generateRandomZipCode(){
        return zipcodes[new Random().nextInt(zipcodes.length)];
    }

    private String generateRandomHouseNumber(){
        return RandomStringUtils.random(2, false, true);
    }

    String streets[] = {"High Street", "Station Road", "Main Street", "Park Road", "Church Road",
            "London Road", "Victoria Road", "Green Lane", "Park Avenue"};
    String cities[] = {"Lichfield", "Lincoln", "Liverpool", "London", "Oxford",
            "Norwich", "Newcastle", "Milton", "Manchester", "Nottingham"};
    String zipcodes[] = {"A31", "A32", "A33", "A34", "A35", "A36", "A37", "A38"};




}
