package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.WebTestBase;
import utils.TestUtils;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//input[@id='cardekhosearchtext']")
    WebElement searchTextBox;

    @FindBy(xpath = "//h2[normalize-space()='The most searched cars']")
    WebElement txt;

    @FindBy(xpath = "//li[contains(text(),'Used Car')]")
    WebElement usedCarTab;

    @FindBy(xpath = "(//input[@name='usedcar'])[2]")
    WebElement byModelRadioButton;

    @FindBy(xpath = "//h1[contains(text(),'Find your right car')]")
    WebElement tab;

    @FindBy(xpath = "//a[@title='New Car']")
    WebElement mouseHover;

    @FindBy(xpath = "//a[@title='New Car']")
    WebElement hover;

    @FindBy(xpath = "//a[@title='Facebook']")
    WebElement facebookClick;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void searchBoxText(String searchtext) {
        searchTextBox.sendKeys(searchtext);
        searchTextBox.sendKeys(Keys.ENTER);
    }

    public void clickRadioBtn() {
           usedCarTab.click();
        byModelRadioButton.click();
    }

    public void mouseAction() {
        Actions act = new Actions(driver);
        act.moveToElement(mouseHover).build().perform();//which one to put

    }

    public void clickFacebook() {
        TestUtils.scrollDowByPixel();
        TestUtils.getWindowHandles();
        facebookClick.click();
    }

    public String getTextOfPage() {
        return TestUtils.getTextOfPage("");
    }

    public String textOnPage() {
        return TestUtils.getTxtOfPage(txt);
    }

    public String textOnHover() {
        return TestUtils.getTxtOfHover(hover);
    }

    public String textTab() {
        return TestUtils.getTxtOfPage(tab);
    }

    public void handelWindow() {
        TestUtils.getWindowHandles();
    }
}