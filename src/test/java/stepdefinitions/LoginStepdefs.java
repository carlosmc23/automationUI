package stepdefinitions;

import customwebdriver.ManageDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginStepdefs {

    WebDriver driver = ManageDriver.getInstance().getDriver();

    @When("^I access the \"([^\"]*)\" page$")
    public void iAccessThePage(String url) {
        driver.navigate().to(url);
    }

    @And("^I filled the email field with \"([^\"]*)\"$")
    public void iFilledTheEmailFieldWith(String email){
        emailTextBox().sendKeys(email);
    }

    @And("^I filled the password field whit \"([^\"]*)\"$")
    public void iFilledThePasswordFieldWhit(String pass){
        passwordTextBox().sendKeys(pass);
    }

    @And("^I click on the button Entrar$")
    public void iClickOnTheButtonEntrar() {
        enterButton().click();
    }

    private WebElement emailTextBox(){
        return driver.findElement(By.cssSelector("input#email"));
    }

    private WebElement passwordTextBox(){
        return driver.findElement(By.cssSelector("input#pass"));
    }

    private WebElement enterButton(){
        return driver.findElement(By.cssSelector("input[data-testid='royal_login_button']"));
    }
}
