package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.WebTestBase;
import utils.TestUtils;

import java.util.List;

public class HomePage extends WebTestBase { //1 webtest error and driver error
    //list all elements on home page
    @FindBy(xpath = "//input[@id='cardekhosearchtext']")
    WebElement searchTextBox;                                   //click and sendkeys action to perform //issue//was it reqired to create


    @FindBy(xpath = "//div[@class='gs_ta_results width100   ']//child::ul/li")
    List<WebElement> select;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement searchButtonClick;                               //after above click to search final result

    @FindBy(xpath = "//h2[text()='The most searched cars']")
    WebElement homePageMostUsedCarText;

    @FindBy(xpath = "//li[normalize-space()='Used Car']")//working
    WebElement selectTab;

    @FindBy(xpath = "(//input[@name='usedcar'])[2]") //(//input[@name='usedcar'])[2]  //(//i[normalize-space()='By Model'])
    WebElement byModelRadioButton;

    // mouse hover and click

    @FindBy(xpath = "//a[@title='New Car']")
    WebElement mouseHover;

    @FindBy(xpath = "//li[@data-slug='/newcars']/span/span[1]")
    WebElement searchNewCarButton;

    //facebook click

    @FindBy(xpath = "//a[@title='Facebook']") //(//a[@target='_blank'])[27]
    WebElement facebookClick;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //searchtext key used value and key stored in cofig.properties file CHECK IF DIDI RIGHT
    public void searchText(String searchtext) {                   //String searchtext
        searchTextBox.click();
        searchTextBox.sendKeys(searchtext);
        TestUtils.getSearch(select, searchtext);
                                                    //do wee need to put in properties file?
    }

    public void searchBoxText(String searchtext) {  //search text to use??
        byModelRadioButton.sendKeys(searchtext);
        //TestUtils.getSearch(select, searchtext);
        byModelRadioButton.sendKeys(Keys.ENTER);
    }

    public void buttonClick() {
        searchButtonClick.click();
    }

    public String textOfElement() {
        return TestUtils.getTextOfElement(homePageMostUsedCarText);
    }

    public void clickRadioBtn() {
        selectTab.click();
        byModelRadioButton.click();
    }

    public Boolean selectRadioButton(){
        return TestUtils.elementIsSelected(byModelRadioButton);
    }

    public void mouseAction(){   //object of action class //mouse hover
        Actions act = new Actions(driver);
        act.moveToElement(mouseHover).moveToElement(searchNewCarButton).click().build().perform();//which one to put
    }

    public void clickFacebook(){
        TestUtils.scrollDowByPixel();
        TestUtils.getWindowHandles();
        facebookClick.click();

    }


}
