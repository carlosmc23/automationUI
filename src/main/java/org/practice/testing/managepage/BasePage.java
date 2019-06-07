package org.practice.testing.managepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.practice.testing.custonwebdriver.ManageDriver;

public abstract class BasePage {

    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    public BasePage(){
        webDriver = ManageDriver.getInstance().getWebDriver();
    }
}
