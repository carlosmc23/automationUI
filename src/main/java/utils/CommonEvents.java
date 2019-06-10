package utils;

import customwebdriver.ManageDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class CommonEvents {


    /**
     * This method set text content to web element.
     *
     * @param webElement Is web element.
     * @param content    Is the content that will be set to the web element.
     */
    public static void SetInputField(WebElement webElement, String content){
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(content);
    }
    /**
     * This method perform a click action in a web element.
     *
     * @param webElement Is the web element that will be pressed.
     */
    public static void clickButton(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * This method perform a click in a non visible element in the UI.
     *
     * @param webElement the WebElement non visible in the UI.
     */
    public static void jsClickElement(WebElement webElement) {
        ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
                .executeScript("arguments[0].click();", webElement);
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isVisible(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isPresent(WebElement webElement) {
        try {
            return webElement.isEnabled();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * This method perform a search in a WebElement list based on a content string parameter.
     *
     * @param elements is the WebElements lists.
     * @param content  is the content parameter.
     * @return the WebElement search result.
     */
    public static WebElement findWebElement(List<WebElement> elements, String content) {
        return elements.stream()
                .filter(element -> content.equals(element.getText()))
                .findAny()
                .orElse(null);
    }

    /**
     * This method return the text content of a WebElement.
     *
     * @param webElement is the WebElement to extract the text.
     * @return the text content of the WebElement.
     */
    public static String getTextContent(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    /**
     * This method get title of current page.
     *
     * @return title of the current page.
     */
    public static String getPageTitle() {
        return ManageDriver.getInstance().getWebDriver().getTitle();
    }

    /**
     * This method press enter key to web element.
     *
     * @param webElement is the WebElement.
     */
    public static void pressEnterKey(WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    /**
     * This method wait for an element to disappear.
     *
     * @param element is the WebElement.
     */
    public static void waitForElementIsNotVisible(WebElement element){
        /*WebDriverWait wait = new WebDriverWait(ManageDriver.getInstance().getWebDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(element));*/
        //ManageDriver.getInstance().getExplicitWait(10).until(ExpectedConditions.invisibilityOf(element));
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * This method wait for an element to appear.
     *
     * @param element is the WebElement.
     */
    public static void waitForElementIsVisible(WebElement element){
        /*WebDriverWait wait = new WebDriverWait(ManageDriver.getInstance().getWebDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));*/
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * This method click on the button accept alert.
     */

    public static void acceptAlert() {
        //WebDriverWait wait = ManageDriver.getInstance().getWebDriverWait();
        Alert alert = ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    /**
     * This method get inner text of an element.
     *
     * @param webElement is the WebElement.
     */

    public static String getInnerText(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getAttribute("innerText");
    }

    /**
     * This method wait for set text content to web element.
     *
     * @param webElement is the WebElement.
     * @param content Is the content that will be set to the web element
     */

    public static void setInputFieldWaitTexBox(WebElement webElement, String content) {
        ManageDriver.getInstance().getWebDriver().manage().timeouts().setScriptTimeout(5, SECONDS);
        webElement.clear();
        webElement.sendKeys(content);
    }

    public static  void dismissAlert(){
        Alert alert = ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
    }


}
