package com.bank.pages;

import com.bank.utility.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By logoutBtn = By.xpath("//button[contains(text(),'Logout')]");
    By yourNameText = By.xpath("//label[contains(text(),'Your Name :')]");
    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By depositAmount = By.xpath("//input[@placeholder='amount']");
    By submitBtn = By.xpath("//button[@type='submit']");
    By depositMessage = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By withdrawlTab = By.xpath("//button[normalize-space()='Withdrawl']");
    By withdrawAmount = By.xpath("//input[@placeholder='amount']");
    By withdrawButton = By.xpath("//button[normalize-space()='Withdraw']");
    By transactionSuccessText = By.xpath("//span[contains(text(),'Transaction successful')]");



    public void verifyLogoutTabVisible() throws InterruptedException {
        Thread.sleep(2000);
        boolean logoutBtnPresent  =driver.findElement(logoutBtn).isDisplayed();
        Assert.assertTrue(logoutBtnPresent);
        if (!logoutBtnPresent){
            System.out.println("Logout Button not displayed");
        }else{
            System.out.println("Logout Button is displayed");
        }
    }

    public void clickOnLogoutButton(){
        clickOnElement(logoutBtn);
    }

    public void verifyYourNameTextVisible(){
        verifyText("Your Name :", yourNameText, "Error, 'Your Name' text not displayed as expected");
    }

    public void clickOnDepositTab(){
        clickOnElement(depositTab);
    }

    public void inputDepositAmount(){
        sendTextToElement(depositAmount, "100");
    }

    public void clickOnSubmitButton(){
        clickOnElement(submitBtn);
    }

    public void verifyDepositSuccessfulMessage(){
        verifyText("Deposit Successful", depositMessage, "Error, 'Deposit Successful' message not displayed as expected");
    }

    public void clickOnWithdrawlTab(){
        clickOnElement(withdrawlTab);
    }

    public void inputWithdrawAmount(){
        sendTextToElement(withdrawAmount, "50");
    }

    public void clickOnWithdrawButton(){
        clickOnElement(withdrawButton);
    }

    public void verifyTransactionSuccessfulMessage(){
        verifyText("Transaction successful", transactionSuccessText, "Error, message not displayed as expected");
    }


}

//    public boolean verifyLogoutButtonVisible() {
//        List<WebElement> buttons = driver.findElements(logoutBtn);
//        if (buttons.size() > 0 && buttons.get(0).isDisplayed())
//        {
//            return true;
//        }
//        return false;
//    }

