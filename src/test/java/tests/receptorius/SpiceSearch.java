package tests.receptorius;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

import static pages.Constants.*;

public class SpiceSearch extends BaseTests {
    @BeforeMethod
    public void openMainPage() {

        pages.receptorius.SpiceSearch.open();
    }

    @Test
    public void searchForSpicesWithSearchBar() {

        pages.receptorius.SpiceSearch.addSpiceNameToSearchBar(SPICE_DEGGI_MIRCH);
        pages.receptorius.SpiceSearch.clickSearchButton();
        String textFromSpiceDeggiMirch = pages.receptorius.SpiceSearch.getTextFromDeggiMirchName();
        Assert.assertEquals(SPICE_DEGGI_MIRCH, textFromSpiceDeggiMirch);
    }

    @Test
    public void searchForSpicesWithFilters() {

        pages.receptorius.SpiceSearch.dragMouseToProductSection();
        pages.receptorius.SpiceSearch.clickOnCategorySpices();
        String spiceBasilElementText = pages.receptorius.SpiceSearch.getTextFromBasilName();

        Assert.assertEquals(SPICE_BASIL, spiceBasilElementText);

        pages.receptorius.SpiceSearch.clickOnCiliPeppersInFilterMenu();
        pages.receptorius.SpiceSearch.clickOnSpicyInFilterMenu();
        String spiceDeggiMirchName = pages.receptorius.SpiceSearch.getTextFromDeggiMirchName();

        Assert.assertEquals(SPICE_DEGGI_MIRCH, spiceDeggiMirchName);
        Assert.assertFalse(pages.receptorius.SpiceSearch.checkIfSpiceBasilIsVisible());
    }
}
