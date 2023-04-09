package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.WebTest;
import utils.TestUtils;

public class SocialLinkHomePage extends WebTest {

    @FindBy(xpath = "//a[@title='Facebook']") //(//a[@target='_blank'])[27]
    WebElement facebookClick;

    public SocialLinkHomePage() {
        PageFactory.initElements(driver , this);
    }
    public void clickFacebook(){
        facebookClick.click();
        TestUtils.scrollDowByPixel();
        TestUtils.getWindowHandles();
    }





}

/*<a href="https://www.facebook.com/CarDekho/" target="_blank" title="Facebook" rel="noopener"><span class="icon-cd-fb-icon"></span></a>*/
