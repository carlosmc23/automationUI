package stepdefinitions;

import browsermanager.BrowserManager;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class LoginStepdefs {

    WebDriver driver = BrowserManager.getDriver();

    @When("^I access the \"([^\"]*)\" page$")
    public void iAccessThePage(String url) {
        driver.navigate().to(url);
    }
}
