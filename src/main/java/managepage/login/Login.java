package managepage.login;

import customwebdriver.ManageDriver;
import managepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage{

    private WebDriver driver = ManageDriver.getInstance().getWebDriver();

    /*@FindBy(css ="input#email") //por favor revisar por que no me esta funcionando las notaciones
    private WebElement userTextBox;

    @FindBy(css = "input#pass")
    private WebElement passTextBox;

    @FindBy(css = "input[data-testid='royal_login_button']")
    private WebElement enterButton;*/

    public void goToPage(String url){
        driver.navigate().to(url);
    }

    public void enterEmail(String email){
        //userTextBox.sendKeys(email); //por que no funciona de esta manera??
        emailTextBox().sendKeys(email);
    }

    public void enterPass(String password){
        //passwordTextBox().sendKeys(); //lo mismo
        passwordTextBox().sendKeys(password);
    }

    public void enterButton(){
        //enterButton.click(); //esto mas
        enterButtonn().click();
    }

    private WebElement emailTextBox(){
        return driver.findElement(By.cssSelector("input#email"));
    }

    private WebElement passwordTextBox(){
        return driver.findElement(By.cssSelector("input#pass"));
    }

    private WebElement enterButtonn(){
        return driver.findElement(By.cssSelector("input[data-testid='royal_login_button']"));
    }

}
