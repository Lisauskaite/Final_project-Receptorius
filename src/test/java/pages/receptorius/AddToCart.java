package pages.receptorius;

import org.openqa.selenium.StaleElementReferenceException;
import pages.Common;
import pages.Locators;

public class AddToCart {

    public static void open() {
        Common.openUrl("https://receptorius.lt/grynieji-prieskoniai/102-246-aitriosios-cili-paprikos-maltos-4771224991069.html#/1-svoris-60_g");
    }

    public static void click1kgButton() {
        Common.clickElement(Locators.Receptorius.AddToCart.button1Kg);
    }

    public static void clickAddAmountButton() {
        Common.clickElement(Locators.Receptorius.AddToCart.buttonAddAmount);
    }

    public static void clickAddToCartButton() {
        try {
            Common.clickElement(Locators.Receptorius.AddToCart.buttonAddToCart);
        } catch (StaleElementReferenceException e) {
            System.out.println("Button did not work");
        }
    }

    public static void waitForCartToBeVisible() {
        Common.waitForElementToBeVisible(Locators.Receptorius.AddToCart.frameItemsInCart);
    }

    public static String getCartConfirmationText() {
        return Common.getElementText(Locators.Receptorius.AddToCart.fieldItemsAddedSuccessfullyMessage);
    }

    public static void clickContinueShoppingButton() {
        Common.clickElement(Locators.Receptorius.AddToCart.buttonContinueShopping);
    }

    public static String getNumberOfItemsInCartIcon() {
        return Common.getElementText(Locators.Receptorius.AddToCart.iconItemsInCart);
    }
}
