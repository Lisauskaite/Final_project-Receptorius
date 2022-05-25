package pages;

import org.openqa.selenium.By;

public class Locators {

    public class Receptorius{

        public class Prisijungti{

            public static By inputEmail = By.xpath("//*[@name='email']");
            public static By inputPassword = By.xpath("//*[@name='password']");
            public static By loginButton = By.xpath("//*[@id='submit-login']");
        }
    }
}
