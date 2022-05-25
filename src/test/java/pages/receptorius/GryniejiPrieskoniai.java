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
}
