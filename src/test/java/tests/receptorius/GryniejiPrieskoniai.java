package tests.receptorius;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class GryniejiPrieskoniai extends BaseTests {
    @BeforeMethod
    public void openSpicePage() {

        pages.receptorius.GryniejiPrieskoniai.openLoginUrl();
    }

    @Test
    public void searchForSpicesWithSearchBar() {

        String spiceName = "Deggi Mirch";

        pages.receptorius.GryniejiPrieskoniai.addSpiceNameToSearchBar(spiceName);
        pages.receptorius.GryniejiPrieskoniai.clickSearchButton();

        Assert.assertTrue(pages.receptorius.GryniejiPrieskoniai.checkIfElementDeggiMirchIsVisible());
    }
    @Test
    public void searchForSpicesWithFilter(){

        pages.receptorius.GryniejiPrieskoniai.clickOnCiliPeppersInFilter();
        pages.receptorius.GryniejiPrieskoniai.clickOnSpicyInFilterMenu();

        Assert.assertTrue(pages.receptorius.GryniejiPrieskoniai.checkIfElementDeggiMirchIsVisibleAfterFilter());
    }
}
