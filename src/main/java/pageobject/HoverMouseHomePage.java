package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcase.WebTest;

public class HoverMouseHomePage extends WebTest {

    @FindBy(xpath = "//a[@title='New Car']")
    WebElement mouseHover;

    public HoverMouseHomePage(){
        PageFactory.initElements(driver,this);
    }

    public void mouseAction(){
        Actions act = new Actions(driver);
        act.moveToElement(mouseHover).perform();
    }
























}
