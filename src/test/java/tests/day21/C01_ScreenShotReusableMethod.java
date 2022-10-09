package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    @Test
    public void test01() throws IOException {
        //hepsiburada sayfasina  gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        //ve sayfanin resmini aliniz
        ReusableMethods.getScreenshot("hepsiburada");
        Driver.closeDriver();
    }

    @Test
    public void test02() {
        //amazon sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amznPage=new AmazonPage();
        //nutella aratiniz
        amznPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //arama sonuc yazisi webelement resmini aliniz
      //  ReusableMethods.getScreenshot("AramaSonucuWe",amznPage.aramaSonucWE);///hatali duzelt
    }
}
