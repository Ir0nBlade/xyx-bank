package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    By customerName = By.xpath("//select[@id='userSelect']");

    public void selectCustomerName(){
        selectByVisibleTextFromDropdown(customerName,"Boris Patel");
    }
}
