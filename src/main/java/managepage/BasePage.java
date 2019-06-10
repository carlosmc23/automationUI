package managepage;

import customwebdriver.ManageDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {


    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    public BasePage(){
        webDriver = ManageDriver.getInstance().getWebDriver();
        webDriverWait = ManageDriver.getInstance().getWebDriverWait();
    }
}
