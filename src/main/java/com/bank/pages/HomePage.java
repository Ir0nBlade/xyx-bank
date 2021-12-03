package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By bankManagerLoginBtn = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLoginBtn = By.xpath("//button[contains(text(),'Customer Login')]");
    By homeButton = By.xpath("//button[contains(text(),'Home')]");

    public void clickOnBankManagerLogin(){
        clickOnElement(bankManagerLoginBtn);
    }

    public void clickOnCustomerLoginButton(){
        clickOnElement(customerLoginBtn);
    }
    public void clickOnHomeButton(){
        clickOnElement(homeButton);
    }
}
