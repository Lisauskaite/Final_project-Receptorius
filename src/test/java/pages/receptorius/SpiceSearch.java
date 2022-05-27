package pages.receptorius;

import org.openqa.selenium.By;
import pages.Common;
import pages.Locators;

public class SpiceSearch {

    public static void open() {
        Common.openUrl("https://receptorius.lt/");
    }

    public static void addSpiceNameToSearchBar(String spiceName) {
        Common.sendKeysToElement(Locators.Receptorius.SpiceSearch.inputSearch, spiceName);
    }

    public static void clickSearchButton() {
        Common.clickElement(Locators.Receptorius.SpiceSearch.buttonSearch);
    }

    public static void clickOnCiliPeppersInFilterMenu() {
        By locator = Locators.Receptorius.SpiceSearch.buttonCilliPeppersFromFilterMenu;
        Common.waitForElementToBeClickable(locator);
        Common.clickElement(locator);
    }

    public static void clickOnSpicyInFilterMenu() {
        By locator = Locators.Receptorius.SpiceSearch.buttonSpicyFromFilterMenu;
        Common.waitForElementToBeClickable(locator);
        Common.clickElement(locator);
        Common.waitForElementToFilterOut(Locators.Receptorius.SpiceSearch.fieldBasilProductIconName);
    }

    public static void clickOnCategorySpices() {
        Common.clickElement(Locators.Receptorius.SpiceSearch.buttonSpicesCategory);
    }

    public static boolean checkIfSpiceBasilIsVisible() {
        return Common.isElementPresent(Locators.Receptorius.SpiceSearch.fieldBasilProductIconName);
    }

    public static void dragMouseToProductSection() {
        Common.dragMouseToElement(Locators.Receptorius.SpiceSearch.fieldProductSection);
    }

    public static String getTextFromDeggiMirchName() {
        return Common.getElementText(Locators.Receptorius.SpiceSearch.fieldDeggiMirchProductIconName);
    }

    public static String getTextFromBasilName() {
        return Common.getElementText(Locators.Receptorius.SpiceSearch.fieldBasilProductIconName);
    }

}
