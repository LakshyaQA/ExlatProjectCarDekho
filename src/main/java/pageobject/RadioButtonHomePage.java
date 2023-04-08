package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.WebTest;

public class RadioButtonHomePage extends WebTest {

    @FindBy(xpath = "//li[normalize-space()='Used Car']")//working
    WebElement selectTab;

    @FindBy(xpath = "(//input[@name='usedcar'])[2]") //(//input[@name='usedcar'])[2]  //(//i[normalize-space()='By Model'])
    WebElement selectRadioButton;

    public RadioButtonHomePage() {
         PageFactory.initElements(driver , this);
    }
    public void clickRadioBtn(){
    selectTab.click();
    selectRadioButton.click();
    }
}
