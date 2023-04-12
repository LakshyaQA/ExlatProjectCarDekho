package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobject.HomePage;
import testcase.WebTestBase;


public class HomeTest extends WebTestBase {   //error 1
    public HomePage homePage;

    HomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
    }

    @Test(priority = 1)
    public void verifySearchOfProduct() {
        SoftAssert softAssert = new SoftAssert();
        homePage.searchBoxText(prop.getProperty("searchtext"));
        softAssert.assertEquals(homePage.textOnPage(), "The most searched cars", "Title must match");
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void verifyClickRadioButton() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickRadioBtn();
        softAssert.assertEquals(homePage.textTab(), "Find your right car", "Title must match element)");
        softAssert.assertAll();

    }

    @Test(priority = 3)
    public void verifyMouseHover() {
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseAction();
        softAssert.assertEquals(homePage.textOnHover(), "NEW CAR", "Title must match element)");
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void verifyFacebookLink() {
        SoftAssert softAssert = new SoftAssert();
        homePage.handelWindow();
        homePage.clickFacebook();
        softAssert.assertEquals(homePage.getTextOfPage(), "CarDekho: New Cars, Car Prices, Buy & Sell Used Cars in India", "Title must match element)");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}