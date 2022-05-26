package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class Common {

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Constants.TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void deleteDefaultValueInInput(By locator) {
        getElement(locator).clear();
    }

    public static boolean isElementPresent(By locator) {
        try {
            Driver.getDriver().findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void dragMouseToElement(By locator) {
        WebElement element = getElement(locator);
        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(element);
        action.perform();
    }
}

