package tests.PracticPackage05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class P02 extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1(){

        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
// 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.id("button1")).click();

// 3. Açılır metni alın
       String actualText= driver.switchTo().alert().getText();
// 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String expectedText="I am an alert box!";
        actualText=  driver.switchTo().alert().getText();
        Assert.assertEquals(expectedText,actualText);
// 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();
    }




}
