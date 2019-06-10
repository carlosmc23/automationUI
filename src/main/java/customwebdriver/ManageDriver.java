package customwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageDriver {
    private static ManageDriver instance;
    private WebDriver driver;
    private WebDriverWait webDriverWait;


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

    public WebDriverWait getWebDriverWait(){
        int implicitTimeWait = 20;
        webDriverWait = new WebDriverWait(getInstance().getDriver(), implicitTimeWait);
        return webDriverWait;
    }


    /*public static WebDriver getDriver(){
        if(driver==null){
            //System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }*/
}
