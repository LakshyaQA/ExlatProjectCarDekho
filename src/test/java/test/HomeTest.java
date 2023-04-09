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

    @Test
    public void carSearch() { //partially running
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.textOfElement(), "The most searched cars", "Title must match element)");//which line t put and get text element first
        homePage.searchBoxText(prop.getProperty("searchtext"));
    }

    @Test  //new created //failed
    public void verifyTextIput() {
        homePage.searchBoxText(prop.getProperty("searchtext"));
    }

    @Test
    public void verifyMouseHover() {                   //hover action passed PASSSING
        homePage.mouseAction();
    }

    @Test                                               //CLICKING ON FACEBOOK LINK PASSING PASSED
    public void verifyFacebookLink() { //partially working
        homePage.clickFacebook();
    }

    @Test
    public void verifyRadioButtonSelection() {    //passsing
        SoftAssert softAssert = new SoftAssert();
        homePage.clickRadioBtn();
        softAssert.assertTrue(homePage.selectRadioButton(), "Radio Button Should Be Selected");
        softAssert.assertAll();
    }


    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(5000);
       // driver.close();
    }

}
