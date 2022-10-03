package tests.day18;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_PageClassFaceBookTesti {
    @Test
    public void test01() {
       // https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
       // POM’a uygun olarak email, sifre kutularini ve giris yap
       // butonunu locate edin
       // Faker class’ini kullanarak email ve sifre degerlerini
       // yazdirip, giris butonuna basin
       // Basarili giris yapilamadigini test edin




    }
}
