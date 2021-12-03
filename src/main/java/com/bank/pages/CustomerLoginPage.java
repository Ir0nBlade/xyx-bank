package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {


    By loginButton = By.xpath("//button[contains(text(),'Login')]");


    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

}
