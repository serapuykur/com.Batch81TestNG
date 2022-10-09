package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;

public class CrossDriver {
    private CrossDriver(){

    }
    static WebDriver driver;


    public static WebDriver getDriver(String browser) {
        //eger browsere bir deger atanmamissa propertis dosyasindaki  browser calisir
        browser=browser==null ? ConfigReader.getProperty("browser") : browser;

        //testlerimizi xml fileden farkli browserlar ile calistirabilmek icin getDriver()methoduna
        //paramatre atamamiz gerekir
        if (driver == null) {
            switch (browser){
                //CrossBrowser icin bizim gonderdigimiz browser uzerinden calismasi icin buraya
                // buraya paramartre olarak girdigimiz degeri yazdik
                case"chrome"  :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case"edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case"opera":
                    WebDriverManager.operadriver().setup();
                    driver=new OperaDriver();
                case"headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {//drivere deger atanmissa kapat
            driver.close();
            driver = null;//kapandiktan sonraki acmalari garanti altina almak icin driveri tekrr null yaptik
        }
    }
    public static void quitDriver(){
        if(driver!=null)
            driver.quit();
        driver=null;
    }


}
