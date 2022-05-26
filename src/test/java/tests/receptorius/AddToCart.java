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
    public void addAmountThatIsMoreThanThereIsInStorage(){

        String largeNumberAmount = "10";
        String expectedTextInToManyItemsAlertMessage = "Pageidaujamo kiekio";

        pages.receptorius.AddToCart.click25kgButton();
        pages.receptorius.AddToCart.clearValueInInput();
        pages.receptorius.AddToCart.addNewAmountOfItems(largeNumberAmount);
        pages.receptorius.AddToCart.clickAddToCartButton();
        pages.receptorius.AddToCart.waitForAlertMesssageToBeVisible();
        String actualToManyItemsAlertMessage = pages.receptorius.AddToCart.readNotEnoughItemsAvailableAlertMessage();

        Assert.assertTrue(actualToManyItemsAlertMessage.contains(expectedTextInToManyItemsAlertMessage));

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
