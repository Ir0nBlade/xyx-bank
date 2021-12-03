package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By getFirstName = By.xpath("//input[@placeholder='First Name']");
    By getLastName = By.xpath("//input[@placeholder='Last Name']");
    By getPostCode = By.xpath("//input[@placeholder='Post Code']");
    By getAddCustomerBtn = By.xpath("//button[@type='submit']");

    public void inputFirstName(){
        sendTextToElement(getFirstName, "Boris");
    }
    public void inputLastName(){
        sendTextToElement(getLastName, "Patel");
    }
    public void inputPostcode(){
        sendTextToElement(getPostCode, "364001");
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(getAddCustomerBtn);
    }
    public void acceptPopUpMessage(){
        acceptAlert();
    }


}
