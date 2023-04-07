package pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.WebTest;
import utils.TestUtils;

public class HomePage extends WebTest {
                                                                  //list all elements on home page
    @FindBy(xpath = "//input[@id='cardekhosearchtext']")
    WebElement searchTextBox;                                    //click and sendkeys action to perform
    WebElement searchTextBox1; //issue//was it reqired to create

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement searchButtonClick;                               //after above click to search final result

    @FindBy(xpath = "//h2[text()='The most searched cars']")
    WebElement homePageMostUsedCarText;

    public HomePage() {
        PageFactory.initElements(driver , this);
    }

    //searchtext key used value and key stored in cofig.properties file CHECK IF DIDI RIGHT
    public void searchText( String searchtext){
        searchTextBox.click();
        searchTextBox1.sendKeys("Maruti Alto 800");          //do wee need to put in properties file?
    }
    public void searchButton(){
        searchButtonClick.click();
    }
    public String textOfElement(){
        return TestUtils.getTextOfElement(homePageMostUsedCarText);
    }
}
