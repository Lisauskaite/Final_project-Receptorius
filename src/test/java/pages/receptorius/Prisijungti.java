package pages.receptorius;

import pages.Common;
import pages.Locators;

public class Prisijungti {

    public static void openLoginUrl() {
        Common.openUrl("https://receptorius.lt/prisijungimas?back=my-account");
    }

    public static void enterEmailAdress(String Email) {
        Common.sendKeysToElement(Locators.Receptorius.Prisijungti.inputEmail, Email);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locators.Receptorius.Prisijungti.inputPassword, password);
    }

    public static void clickLoginButton() {
        Common.clickElement(Locators.Receptorius.Prisijungti.loginButton);
    }

    public static String readAlertMessage() {
        return Common.getElementText(Locators.Receptorius.Prisijungti.fieldAlertMessage);
    }

    public static String getAccountNameAfterLoggingIn() {
        return Common.getElementText(Locators.Receptorius.Prisijungti.accountName);
    }
}
