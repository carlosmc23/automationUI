package org.practice.testing.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.practice.testing.managepage.BasePage;

public class Login extends BasePage {


    @FindBy(css = "input#email")
    private WebElement userName;

    @FindBy(css = "input#pass")
    private WebElement password;

    /*public void goToPage(String url){
        webDriver.navigate().to(url);
    }*/

    public void addUserName(String user){
        userName.sendKeys(user);
    }

}
