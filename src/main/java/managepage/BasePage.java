package managepage;

import customwebdriver.ManageDriver;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {


    protected WebDriver webDriver;

    public BasePage(){
        webDriver = ManageDriver.getInstance().getDriver();
    }
}
