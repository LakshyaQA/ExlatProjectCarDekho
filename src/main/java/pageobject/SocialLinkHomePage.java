package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.WebTest;

public class SocialLinkHomePage extends WebTest {

    @FindBy(partialLinkText = "https://www.facebook") //(//a[@target='_blank'])[27]
    WebElement facebookClick;

    public SocialLinkHomePage() {
        PageFactory.initElements(driver , this);
    }
    public void clickFacebook(){
        facebookClick.click();
    }
}

/*<a href="https://www.facebook.com/CarDekho/" target="_blank" title="Facebook" rel="noopener"><span class="icon-cd-fb-icon"></span></a>*/
