package pages.receptorius;

import pages.Common;
import pages.Locators;

public class Prisijungti {

    public static void openLoginUrl(){
        Common.openUrl("https://receptorius.lt/prisijungimas?back=my-account");
    }

    public static void enterEmailAdress(String Email) {
        Common.sendKeysToElement(Locators.Receptorius.Prisijungti.inputEmail, Email);
        }
    }

