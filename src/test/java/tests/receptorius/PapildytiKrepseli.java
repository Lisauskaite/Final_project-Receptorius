package tests.receptorius;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class PapildytiKrepseli extends BaseTests {

    @BeforeMethod
    public void openLoginPage() {
        pages.receptorius.PapildytiKrepseli.openLoginUrl();
    }

    @Test
    public void idekPrekeIKrepseli() {
        String expectedMessageSuccesfullyAddedToCartMessage = "Prekė sėkmingai pridėta";
        String expectedNumberOfItemsInShoppingCartIcon = "2";

        pages.receptorius.PapildytiKrepseli.click1kgButton();
        pages.receptorius.PapildytiKrepseli.clickAddAmountButton();
        pages.receptorius.PapildytiKrepseli.clickAddToCartButton();
        pages.receptorius.PapildytiKrepseli.waitForCartToBeVisible();
        String actualMessageSuccessfullyAddedToCartMessage = pages.receptorius.PapildytiKrepseli.getCartConfirmationText();

        Assert.assertTrue(actualMessageSuccessfullyAddedToCartMessage.contains(expectedMessageSuccesfullyAddedToCartMessage));

        pages.receptorius.PapildytiKrepseli.clickContinueShoppingButton();
        String actualNumberOfItemsInShoppingCartIcon = pages.receptorius.PapildytiKrepseli.getNumberOfItemsInCartIcon();

        Assert.assertTrue(actualNumberOfItemsInShoppingCartIcon.contains(expectedNumberOfItemsInShoppingCartIcon));
    }

}
