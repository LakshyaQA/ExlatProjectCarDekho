package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.WebTestBase;
import utils.TestUtils;

import java.util.List;

public class HomePage extends WebTestBase {

    //list all elements on home page and search text

    @FindBy(xpath = "//input[@id='cardekhosearchtext']")
    WebElement searchTextBox;

    //radio button action

    @FindBy(xpath = "//li[contains(text(),'Used Car')]")
    WebElement usedCarTab;

    @FindBy(xpath = "(//input[@name='usedcar'])[2]")
    WebElement byModelRadioButton;

    // mouse hover and click

    @FindBy(xpath = "//a[@title='New Car']")
    WebElement mouseHover;

    // @FindBy(xpath = "//li[@data-slug='/newcars']/span/span[1]")
    // WebElement searchNewCarButton;

    //facebook click

    @FindBy(xpath = "//a[@title='Facebook']")
    WebElement facebookClick;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void searchBoxText(String searchtext) {
        searchTextBox.sendKeys(searchtext);
        searchTextBox.sendKeys(Keys.ENTER);
    }

    public String getTextOfPage() {
        return TestUtils.getTextOfPage("");
    }

    public void clickRadioBtn() {
        usedCarTab.click();
        byModelRadioButton.click();
    }

    public void mouseAction() {
        Actions act = new Actions(driver);
        act.moveToElement(mouseHover).build().perform();//which one to put
        //act.moveToElement(searchNewCarButton).click().build().perform();
    }

    public void clickFacebook() {
        TestUtils.scrollDowByPixel();
        TestUtils.getWindowHandles();
        facebookClick.click();
    }
}