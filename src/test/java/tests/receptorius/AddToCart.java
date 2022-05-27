package tests.receptorius;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class AddToCart extends BaseTests {

    @BeforeMethod
    public void openPage() {
        pages.receptorius.AddToCart.open();
    }

    @Test
    public void addItemsToCart() {

        String expectedSuccessfullyAddedToCartMessage = "Prekė sėkmingai pridėta";
        String expectedNumberOfItemsInShoppingCartIcon = "2";

        pages.receptorius.AddToCart.click1kgButton();
        pages.receptorius.AddToCart.clickAddAmountButton();
        pages.receptorius.AddToCart.clickAddToCartButton();
        String actualSuccessfullyAddedToCartMessage = pages.receptorius.AddToCart.getCartConfirmationText();

        Assert.assertTrue(actualSuccessfullyAddedToCartMessage.contains(expectedSuccessfullyAddedToCartMessage));

        pages.receptorius.AddToCart.clickContinueShoppingButton();
        String actualNumberOfItemsInShoppingCartIcon = pages.receptorius.AddToCart.getNumberOfItemsInCartIcon();

        Assert.assertTrue(actualNumberOfItemsInShoppingCartIcon.contains(expectedNumberOfItemsInShoppingCartIcon));

    }

}
