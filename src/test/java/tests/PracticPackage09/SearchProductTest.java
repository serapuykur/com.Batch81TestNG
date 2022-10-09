package tests.PracticPackage09;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchProductPage;
import utilities.Driver;

public class SearchProductTest {
    SearchProductPage searchProductPage;
    @Test
    public void searchProductPage() {

        // 1. Tarayıcıyı başlat
// 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get("http://automationexercise.com");
// 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String homeUrl="https://automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),homeUrl);
         searchProductPage = new SearchProductPage();

// 4. 'Ürünler' butonuna tıklayın

// 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın

// 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
// 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
// 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
    }
}