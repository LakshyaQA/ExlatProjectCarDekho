package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobject.HomePage;
import testcase.WebTest;

public class HomeTest extends WebTest {
    public HomePage homePage;

    HomeTest() {
        super();
    }

@BeforeMethod
public void beforeMethod(){
  initialization();
  homePage = new HomePage();
}
@Test
public void carSearch() {
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(homePage.textOfElement(),"The most searched cars", "Title must match element)");//which line t put and get text element first
    homePage.searchText(prop.getProperty("searchtext"));

}
@AfterMethod
public void afterMethod() throws InterruptedException {
    Thread.sleep(5000);
    driver.close();
}
}
