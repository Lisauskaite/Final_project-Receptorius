package pages;

import org.openqa.selenium.By;

public class Locators {

    public class Receptorius{

        public class Prisijungti{

            public static By inputEmail = By.xpath("//*[@name='email']");
            public static By inputPassword = By.xpath("//*[@name='password']");
            public static By loginButton = By.xpath("//*[@id='submit-login']");
            public static By fieldAlertMessage = By.xpath("//*[@class='alert alert-danger']");

        }
        public class PapildytiKrepseli{

            public static By oneKgButton = By.xpath("//*[@value='3']");
            public static By addAmountButton = By.xpath("//*[@class='material-icons touchspin-up']");
            public static By addToCartButton = By.xpath("//*[@class='btn btn-primary add-to-cart']");
            public static By cartOverviewWindow = By.xpath("//*[@id=\"blockcart-modal\"]");
            public static By confirmMessageField = By.xpath("//*[@id=\"myModalLabel\"]");
            public static By continueShopping = By.xpath("//*[@class=\"btn btn-secondary\"]");
            public static By cartIconCount = By.xpath("(//*[@class='cart-products-count'])[1]");
            public static By twentyFiveKgButton = By.xpath("//*[@value='5']");
            public static By currentAmmountInput = By.xpath("//*[@id='quantity_wanted']");
            public static By notAvailableAmountAlertMessage = By.xpath("//*[@class='alert alert-danger ajax-error']");
        }
        public class GryniejiPrieskoniai{
            public static By searchBarInput = By.xpath("//*[@class='ui-autocomplete-input']");
            public static By searchButton = By.xpath("//*[@class='material-icons search']");
            public static By deggiMirchproductIcon = By.xpath("//*[@data-id-product='409']");
            public static By cilliPeppersButtonFromFilterMenu = By.xpath("(//*[@data-depth='1'])[8]");
        }
        }
    }

