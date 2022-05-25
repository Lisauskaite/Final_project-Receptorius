package tests.receptorius;

import org.testng.annotations.BeforeMethod;
import pages.Common;

public class Prisijungti {

@BeforeMethod
    public void openLoginPage(){
    pages.receptorius.Prisijungti.openLoginUrl();
}
}
