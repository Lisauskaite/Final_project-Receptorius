package pages.receptorius;

import pages.Common;
import pages.Locators;

public class Login {

    public static void open() {
        Common.openUrl("https://receptorius.lt/prisijungimas?back=my-account");
    }

    public static void enterEmailAdrress(String Email) {
        Common.sendKeysToElement(Locators.Receptorius.Login.inputEmail, Email);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locators.Receptorius.Login.inputPassword, password);
    }

    public static void clickLoginButton() {
        Common.clickElement(Locators.Receptorius.Login.buttonLogin);
    }

    public static String readAlertMessage() {
        return Common.getElementText(Locators.Receptorius.Login.fieldAlertMessage);
    }

    public static String getAccountNameAfterLoggingIn() {
        return Common.getElementText(Locators.Receptorius.Login.fieldAccountNameAfterLoggingIn);
    }
}

