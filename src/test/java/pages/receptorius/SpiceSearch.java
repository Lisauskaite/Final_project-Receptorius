package pages.receptorius;

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

    public static boolean checkIfElementDeggiMirchIsVisible() {
        return Common.isElementPresent(Locators.Receptorius.SpiceSearch.fieldDeggiMirchProductIconBeforeApplyingFilter);
    }

    public static void clickOnCiliPeppersInFilter() {
        Common.clickElement(Locators.Receptorius.SpiceSearch.buttonCilliPeppersFromFilterMenu);
    }

    public static void clickOnSpicyInFilterMenu() {
        Common.clickElement(Locators.Receptorius.SpiceSearch.buttonSpicyFromFilterMenu);
    }

    public static boolean checkIfRandomSpiceIsVisible() {
        return Common.isElementPresent(Locators.Receptorius.SpiceSearch.fieldOtherSpiceIconBeforeApplyingFilter);
    }

    public static void dragMouseToProductSection() {
        Common.dragMouseToElement(Locators.Receptorius.SpiceSearch.fieldProductSection);
    }

    public static void clickOnCategorySpices() {
        Common.clickElement(Locators.Receptorius.SpiceSearch.buttonSpicesCategory);
    }

    public static void waitForDropDownMenuToExpand() {
            Common.waitForElementToBeClickable(Locators.Receptorius.SpiceSearch.buttonCilliPeppersFromFilterMenu);
    }
}
