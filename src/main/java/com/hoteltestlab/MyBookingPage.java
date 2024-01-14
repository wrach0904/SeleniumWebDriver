package com.hoteltestlab;

import org.openqa.selenium.By;

public class MyBookingPage extends BasePage{

    private By signInButton = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span");
    private By hotelLocation = By.id("hotel_location");
    private By selectHotel = By.id("hotel_cat_name");
    private By pickHotel = By.className("hotel_name");
    private By checkInDate = By.id("check_in_time");
    private By checkOutDate = By.id("check_out_time");
    private By searchButton = By.id("search_room_submit");
    private By languageButton = By.id("languages-block-top");
    private By changeLanguageEndToPl = By.xpath("//*[@id=\"first-languages\"]/li[2]/a");
    private By changeLanguagePlToEng = By.xpath("//*[@id=\"first-languages\"]/li[1]/a");
    private By assertionCheck = By.xpath("//*[@id=\"languages-block-top\"]/div/span");

    public LoginPage goToLoginPage(){
        click(signInButton);
        return new LoginPage();
    }

    public void searchHotel(String city, String checkinDMY, String checkoutDMY){
        type(hotelLocation, city);
        click(selectHotel);
        click(pickHotel);
        type(checkInDate, checkinDMY);
        type(checkOutDate, checkoutDMY);
        click(searchButton);
    }

    public void changePagesLanguageToPln(){
        click(languageButton);
        click(changeLanguageEndToPl);
    }

    public void changePagesLanguageToEng(){
        click(languageButton);
        click(changeLanguagePlToEng);
    }

    public String languageAssertCheck(){
        return getText(assertionCheck);
    }


}
