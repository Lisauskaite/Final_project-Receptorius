package tests.receptorius;

import org.testng.annotations.BeforeMethod;
import tests.BaseTests;

public class PapildytiKrepseli extends BaseTests {

    @BeforeMethod
    public void openLoginPage() {
        pages.receptorius.PapildytiKrepseli.openLoginUrl();
    }

}
