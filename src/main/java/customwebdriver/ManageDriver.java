package customwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageDriver {
    private static ManageDriver instance;
    private static WebDriver driver;

    private ManageDriver(){
        driver = new ChromeDriver();
        //driver.manage().window().maximize();//no funciona bien con el navegador chrome
    }

    public static ManageDriver getInstance(){
        if (instance == null){
            instance = new ManageDriver();
        }
        return instance;
    }

    public WebDriver getDriver(){
        return driver;
    }

    /*public static WebDriver getDriver(){
        if(driver==null){
            //System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }*/
}
