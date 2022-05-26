package tests.receptorius;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class Login extends BaseTests {

    @BeforeMethod
    public void openLoginPage() {
        pages.receptorius.Login.open();

    }

    @Test
    public void tryToLogInWithNonExistingAccountInfo() {

        String nonExistingEmail = "vardenis@email.com";
        String nonExistingPassword = "password";
        String expectedAlertMessage = "Identifikavimas nepavyko";

        pages.receptorius.Login.enterEmailAdress(nonExistingEmail);
        pages.receptorius.Login.enterPassword(nonExistingPassword);
        pages.receptorius.Login.clickLoginButton();
        String actualAlertMessage = pages.receptorius.Login.readAlertMessage();

        Assert.assertEquals(expectedAlertMessage, actualAlertMessage);

    }

    @Test
    public void tryToLogInWithExistingAccountInfo() {

        String existingEmail = "vismante.lisauskaite@gmail.com";
        String existingPassword = "vcsprojektas";
        String expectedAccountNameAfterLoggingIn = "Vismante Lisauskaite";

        pages.receptorius.Login.enterEmailAdress(existingEmail);
        pages.receptorius.Login.enterPassword(existingPassword);
        pages.receptorius.Login.clickLoginButton();
        String actualAccountNameAfterLoggingIn = pages.receptorius.Login.getAccountNameAfterLoggingIn();

        Assert.assertEquals(expectedAccountNameAfterLoggingIn, actualAccountNameAfterLoggingIn);

    }
}