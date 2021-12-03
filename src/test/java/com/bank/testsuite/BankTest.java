package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.annotations.Test;

public class BankTest extends TestBase {

    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();


    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.inputFirstName();
        addCustomerPage.inputLastName();
        addCustomerPage.inputPostcode();
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.acceptPopUpMessage();
        homePage.clickOnHomeButton();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
       bankManagerShouldAddCustomerSuccessfully();
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomerName();
        openAccountPage.selectCurrency();
        openAccountPage.clickOnProcessButton();
        addCustomerPage.acceptPopUpMessage();
        homePage.clickOnHomeButton();
    }

    @Test
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        bankManagerShouldAddCustomerSuccessfully();
        bankManagerShouldOpenAccountSuccessfully();
        homePage.clickOnCustomerLoginButton();
        customersPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        accountPage.verifyLogoutTabVisible();
        accountPage.clickOnLogoutButton();
        accountPage.verifyYourNameTextVisible();

    }

    @Test
    public void customerShouldDepositMoneySuccessfully(){
        homePage.clickOnCustomerLoginButton();
        customersPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.inputDepositAmount();
        accountPage.clickOnSubmitButton();
        accountPage.verifyDepositSuccessfulMessage();
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.clickOnCustomerLoginButton();
        customersPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnWithdrawlTab();
        accountPage.inputWithdrawAmount();
        accountPage.clickOnWithdrawButton();
        accountPage.verifyTransactionSuccessfulMessage();
    }


    @Test
    public void customerAccountManagement() throws InterruptedException {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.inputFirstName();
        addCustomerPage.inputLastName();
        addCustomerPage.inputPostcode();
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.acceptPopUpMessage();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomerName();
        openAccountPage.selectCurrency();
        openAccountPage.clickOnProcessButton();
        openAccountPage.acceptPopUpMessage();
        homePage.clickOnHomeButton();

        // Test 3
        homePage.clickOnCustomerLoginButton();
        customersPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        accountPage.verifyLogoutTabVisible();
        accountPage.clickOnLogoutButton();
        accountPage.verifyYourNameTextVisible();

        // Test 4
        homePage.clickOnHomeButton();
        homePage.clickOnCustomerLoginButton();
        customersPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.inputDepositAmount();
        accountPage.clickOnSubmitButton();
        accountPage.verifyDepositSuccessfulMessage();

        // Test 5
        homePage.clickOnHomeButton();
        homePage.clickOnCustomerLoginButton();
        customersPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnWithdrawlTab();
        accountPage.inputWithdrawAmount();
        accountPage.clickOnWithdrawButton();
        accountPage.verifyTransactionSuccessfulMessage();

    }
}
