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

        String expectedMessageSuccessfullyAddedToCartMessage = "Prekė sėkmingai pridėta";
        String expectedNumberOfItemsInShoppingCartIcon = "2";

        pages.receptorius.AddToCart.click1kgButton();
        pages.receptorius.AddToCart.clickAddAmountButton();
        pages.receptorius.AddToCart.clickAddToCartButton();
        pages.receptorius.AddToCart.waitForCartToBeVisible();
        String actualMessageSuccessfullyAddedToCartMessage = pages.receptorius.AddToCart.getCartConfirmationText();

        Assert.assertTrue(actualMessageSuccessfullyAddedToCartMessage.contains(expectedMessageSuccessfullyAddedToCartMessage));

        pages.receptorius.AddToCart.clickContinueShoppingButton();
        String actualNumberOfItemsInShoppingCartIcon = pages.receptorius.AddToCart.getNumberOfItemsInCartIcon();

        Assert.assertTrue(actualNumberOfItemsInShoppingCartIcon.contains(expectedNumberOfItemsInShoppingCartIcon));

    }

}
