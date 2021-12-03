package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By customerName = By.xpath("//select[@id='userSelect']");
    By currency = By.xpath("//select[@id='currency']");
    By processBtn = By.xpath("//button[contains(text(),'Process')]");

    public void selectCustomerName() throws InterruptedException {

        selectByVisibleTextFromDropdown(customerName, "Boris Patel");
    }
    public void selectCurrency(){
        selectByVisibleTextFromDropdown(currency,"Pound");
    }
    public void clickOnProcessButton(){
        clickOnElement(processBtn);
    }
    public void acceptPopUpMessage(){
        acceptAlert();
    }
}
