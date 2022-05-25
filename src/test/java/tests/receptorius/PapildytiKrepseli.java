package tests.receptorius;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class PapildytiKrepseli extends BaseTests {

    @BeforeMethod
    public void openLoginPage() {
        pages.receptorius.PapildytiKrepseli.openLoginUrl();
    }

    @Test
    public void idekPrekeIKrepseli(){
        pages.receptorius.PapildytiKrepseli.click1kgButton();
        pages.receptorius.PapildytiKrepseli.clickAddAmountButton();
    }

}
