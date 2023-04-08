package pageobject;

import io.opentelemetry.api.internal.Utils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.WebTest;
import utils.TestUtils;

import java.util.List;

public class HomePage extends WebTest { //1 webtest error and driver error
                                                                  //list all elements on home page
    @FindBy(xpath = "//input[@id='cardekhosearchtext']")
    WebElement searchTextBox;                                    //click and sendkeys action to perform
                                                                //issue//was it reqired to create
    @FindBy(xpath = "//div[@class='gs_ta_results width100   ']//child::ul/li")
    List<WebElement> select;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement searchButtonClick;                               //after above click to search final result

    @FindBy(xpath = "//h2[text()='The most searched cars']")
    WebElement homePageMostUsedCarText;

    public HomePage() {
        PageFactory.initElements(driver , this);
    }

    //searchtext key used value and key stored in cofig.properties file CHECK IF DIDI RIGHT
    public void searchText(){                   //String searchtext
        searchTextBox.click();
        //do wee need to put in properties file?
    }
    /*public void searchBoxText(String searchtext){  //search text to use??
        selectRadioButton.sendKeys(searchtext);
        Utils.getSearch(select, searchtext);
        selectRadioButton.sendKeys(Keys.ENTER);
    }*/
    public void buttonClick(){
        searchButtonClick.click();
    }
    public String textOfElement(){
        return TestUtils.getTextOfElement(homePageMostUsedCarText);
    }
}
