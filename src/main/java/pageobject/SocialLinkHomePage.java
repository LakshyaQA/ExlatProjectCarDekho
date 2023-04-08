package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.WebTest;

public class SocialLinkHomePage extends WebTest {

    @FindBy(xpath = "//span[@class='icon-cd-fb-icon']")
    WebElement facebookClick;

    public SocialLinkHomePage() {
        PageFactory.initElements(driver , this);
    }
    public void clickFacebook(){
        facebookClick.click();
    }
}
