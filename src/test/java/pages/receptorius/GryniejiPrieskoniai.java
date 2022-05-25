package pages.receptorius;

import pages.Common;
import pages.Locators;

public class GryniejiPrieskoniai {
    public static void openLoginUrl() {
        Common.openUrl("https://receptorius.lt/67-grynieji-prieskoniai");
    }

    public static void addSpiceNameToSearchBar(String spiceName) {
        Common.sendKeysToElement(Locators.Receptorius.GryniejiPrieskoniai.searchBarInput, spiceName);
    }

    public static void clickSearchButton() {
        Common.clickElement(Locators.Receptorius.GryniejiPrieskoniai.searchButton);
    }

    public static boolean checkIfElementDeggiMirchIsVisible() {
        return Common.checkIfElementIsVisible(Locators.Receptorius.GryniejiPrieskoniai.deggiMirchProductIcon);
    }

    public static void clickOnCiliPeppersInFilter() {
        Common.clickElement(Locators.Receptorius.GryniejiPrieskoniai.cilliPeppersButtonFromFilterMenu);
    }

    public static void clickOnSpicyInFilterMenu() {
        Common.clickElement(Locators.Receptorius.GryniejiPrieskoniai.spicyButtonFromFilterMenu);
    }
    public static boolean checkIfElementDeggiMirchIsVisibleAfterFilter() {
        return Common.checkIfElementIsVisible(Locators.Receptorius.GryniejiPrieskoniai.deggiMirchProductIconAfterFilter);
    }

    public static boolean checkIfElement706isVisible() {
        return Common.checkIfElementIsVisible(Locators.Receptorius.GryniejiPrieskoniai.seven06ProductIconBeforeFilter);
    }
    public static boolean checkIfElement706isVisibleAfterFilter() {
        return Common.isElementPresent(Locators.Receptorius.GryniejiPrieskoniai.seven06ProductIconAfterFilter);
    }
}
