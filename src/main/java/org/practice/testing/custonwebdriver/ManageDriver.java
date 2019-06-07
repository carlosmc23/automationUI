package org.practice.testing.custonwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageDriver {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;
    private static ManageDriver instance;

    private ManageDriver(){
        //System.setProperty("webdriver.crhome.driver", "/usr/local/bin/geckodriver");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://www.facebook.com/");
    }

    public static ManageDriver getInstance(){
        if(instance == null){
            instance = new ManageDriver();
        }
        return instance;
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

}
