package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);}
        @FindBy(xpath = "//*[@id='u_0_e_AP']")
                public WebElement cookies;

        @FindBy(xpath ="//*[@id='email']" )
        public WebElement email;
        @FindBy(xpath = "//*[@id='pass']")
    public WebElement sifre;

}
