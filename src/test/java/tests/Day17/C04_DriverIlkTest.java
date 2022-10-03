package tests.Day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_DriverIlkTest {
    @Test
    public void test01() {
        /*
        testbase clasina extend ederek kullandigimiz driver yerine artik driver clasimizdan kullanacgaimiz
        getDdriver()static methodu nu kullaniriz
         */
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://hepsiburada.com");
        Driver.closeDriver();
    }
}
