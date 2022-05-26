package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Receptorius{

        public static class Login{

            public static By inputEmail = By.xpath("//*[@name='email']");
            public static By inputPassword = By.xpath("//*[@name='password']");
            public static By buttonLogin = By.xpath("//*[@id='submit-login']");
            public static By fieldAlertMessage = By.xpath("//*[@class='alert alert-danger']");
            public static By fieldAccountNameAfterLoggingIn = By.xpath("(//*[@class='hidden-sm-down'])[2]");

        }
        public static class AddToCart{

            public static By button1Kg = By.xpath("//*[@value='3']");
            public static By button25Kg = By.xpath("//*[@value='5']");
            public static By buttonAddAmount = By.xpath("//*[@class='material-icons touchspin-up']");
            public static By buttonAddToCart = By.xpath("//*[@class='btn btn-primary add-to-cart']");
            public static By buttonContinueShopping = By.xpath("//*[@class='btn btn-secondary']");
            public static By fieldItemsAddedSuccessfullyMessage = By.xpath("//*[@id='myModalLabel']");
            public static By fieldNotAvailableAmountMessage = By.xpath("//*[@class='alert alert-danger ajax-error']");
            public static By frameItemsInCart = By.xpath("//*[@id='blockcart-modal']");
            public static By iconItemsInCart = By.xpath("(//*[@class='cart-products-count'])[1]");
            public static By inputCurrentAmount = By.xpath("//*[@id='quantity_wanted']");

        }
        public static class SpiceSearch{

            public static By inputSearch = By.xpath("//*[@class='ui-autocomplete-input']");
            public static By buttonSearch = By.xpath("//*[@class='material-icons search']");
            public static By buttonCilliPeppersFromFilterMenu = By.xpath("(//*[@class='category-sub-link'])[2]");
            public static By buttonSpicyFromFilterMenu = By.xpath("(//*[@class='ps-shown-by-js'])[3]");
            public static By fieldDeggiMirchProductIconBeforeApplyingFilter = By.xpath("//*[@data-id-product='409']");
            public static By fieldOtherSpiceIconBeforeApplyingFilter = By.xpath("//*[@data-id-product-attribute='706']");
            public static By fieldProductSection = By.xpath("(//*[@class='dropdown-item'])[1]");
            public static By buttonSpicesCategory = By.xpath("(//*[@class='dropdown-item dropdown-submenu'])[1]");
        }

    }
}

