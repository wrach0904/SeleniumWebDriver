package com.hoteltestlab;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import java.util.Random;

public class AddressesPage extends BasePage {

    private By addNewButton = By.xpath("//a[@title='Add an address']");
    private By streetField = By.id("address1");
    private By houseNoField = By.id("address2");
    private By postCodeField = By.id("postcode");
    private By cityField = By.id("city");
    private By phoneNoField = By.id("phone_mobile");
    private By saveButton = By.id("submitAddress");
    private By aliasField = By.id("alias");
    private By assertPageName = By.xpath("//*[@id=\"center_column\"]/h1");

    public String newAddAssertCheck(){
        return getText(assertPageName);
    }

    public void addNewAddress(){
        click(addNewButton);
        type(streetField, generateRandomStreet());
        type(houseNoField, generateRandomHouseNumber());
        type(postCodeField, generateRandomZipCode());
        type(cityField, generateRandomCity());
        type(phoneNoField, generateRandomPhoneNumber());
        clear(aliasField);
        type(aliasField, "MyAddress" + new Random().nextInt(100));
        click(saveButton);
    }

    private String generateRandomStreet(){
        return streets[new Random().nextInt(streets.length)];
    }

    private String generateRandomCity(){
        return cities[new Random().nextInt(cities.length)];
    }

    private String generateRandomZipCode(){
        return RandomStringUtils.random(2, false, true) + "-" +
                RandomStringUtils.random(3, false, true);
    }

    private String generateRandomHouseNumber(){
        return RandomStringUtils.random(2, false, true);
    }

    private String generateRandomPhoneNumber(){
        return RandomStringUtils.random(9, false, true);
    }

    String streets[] = {"High Street", "Station Road", "Main Street", "Park Road", "Church Road",
            "London Road", "Victoria Road", "Green Lane", "Park Avenue"};

    String cities[] = {"Lichfield", "Lincoln", "Liverpool", "London", "Oxford",
            "Norwich", "Newcastle", "Milton", "Manchester", "Nottingham"};
}
