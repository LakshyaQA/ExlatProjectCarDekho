package test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pageobject.HoverMouseHomePage;
import testcase.WebTest;

public class HoverMouseHomeTest extends WebTest {

    public HoverMouseHomePage hoverMouseHomePage;


    HoverMouseHomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
    }
    @Test
    public void Hover(){
        HoverMouseHomePage.mouseHover();
       // HoverMouseHomePage.mouseAction();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }





}
