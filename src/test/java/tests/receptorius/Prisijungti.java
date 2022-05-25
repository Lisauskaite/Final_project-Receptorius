package tests.receptorius;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import tests.BaseTests;

public class Prisijungti extends BaseTests {

    @BeforeMethod
    public void openLoginPage() {
        pages.receptorius.Prisijungti.openLoginUrl();
    }

    @Test
    public void tryToLogInWithNonExistingAccountInfo() {
        String nonExistingEmail = "vardenis@email.com";
        String nonExistingPassword = "password";
        pages.receptorius.Prisijungti.enterEmailAdress(nonExistingEmail);
        pages.receptorius.Prisijungti.enterPassword(nonExistingPassword);
        pages.receptorius.Prisijungti.clickLoginButton();
    }
}