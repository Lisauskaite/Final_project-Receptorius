package tests.receptorius;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class SpiceSearch extends BaseTests {
    @BeforeMethod
    public void openMainPage() {

        pages.receptorius.SpiceSearch.open();
    }

    @Test
    public void searchForSpicesWithSearchBar() {

        String spiceName = "Deggi Mirch";

        pages.receptorius.SpiceSearch.addSpiceNameToSearchBar(spiceName);
        pages.receptorius.SpiceSearch.clickSearchButton();

        Assert.assertTrue(pages.receptorius.SpiceSearch.checkIfElementDeggiMirchIsVisible());
    }
    @Test
    public void searchForSpicesWithFilters(){

        pages.receptorius.SpiceSearch.dragMouseToProductSection();
        pages.receptorius.SpiceSearch.clickOnCategorySpices();

        Assert.assertTrue(pages.receptorius.SpiceSearch.checkIfRandomSpiceIsVisible());

        pages.receptorius.SpiceSearch.waitForDropDownMenuToExpand();
        pages.receptorius.SpiceSearch.clickOnCiliPeppersInFilter();
        pages.receptorius.SpiceSearch.clickOnSpicyInFilterMenu();

        Assert.assertTrue(pages.receptorius.SpiceSearch.checkIfElementDeggiMirchIsVisible());
        Assert.assertFalse(pages.receptorius.SpiceSearch.checkIfRandomSpiceIsVisible());    }
}
