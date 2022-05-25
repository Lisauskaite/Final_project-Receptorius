package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

public class BaseTests {

    @BeforeMethod
    public void setup() {
        Driver.setDriver();
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}
