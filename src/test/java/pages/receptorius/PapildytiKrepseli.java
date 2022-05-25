package pages.receptorius;

import pages.Common;
import pages.Locators;

public class PapildytiKrepseli {
    public static void openLoginUrl() {
        Common.openUrl("https://receptorius.lt/grynieji-prieskoniai/102-246-aitriosios-cili-paprikos-maltos-4771224991069.html#/1-svoris-60_g");
    }

    public static void click1kgButton() {
        Common.clickElement(Locators.Receptorius.PapildytiKrepseli.oneKgButton);
    }

    public static void clickAddAmountButton() {
        Common.clickElement(Locators.Receptorius.PapildytiKrepseli.addAmountButton);
    }

    public static void clickAddToCartButton() {
        Common.clickElement(Locators.Receptorius.PapildytiKrepseli.addToCartButton);
    }

    public static void waitForCartToBeVisible() {
        Common.waitForElementToBeVisible(Locators.Receptorius.PapildytiKrepseli.cartOverviewWindow);
    }

    public static String getCartConfirmationText() {
        return Common.getElementText(Locators.Receptorius.PapildytiKrepseli.confirmMessageField);
    }

    public static void clickContinueShoppingButton() {
        Common.clickElement(Locators.Receptorius.PapildytiKrepseli.continueShopping);
    }

    public static String getNumberOfItemsInCartIcon() {
        return Common.getElementText(Locators.Receptorius.PapildytiKrepseli.cartIconCount);
    }

    public static void click25kgButton() {
        Common.clickElement(Locators.Receptorius.PapildytiKrepseli.twentyFiveKgButton);
    }
}