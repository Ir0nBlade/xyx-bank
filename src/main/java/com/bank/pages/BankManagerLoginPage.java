package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");
    By openAccount = By.xpath("//button[@ng-click='openAccount()']");



    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomerTab);
    }

    public void clickOnOpenAccountTab(){
        clickOnElement(openAccount);
    }



}
