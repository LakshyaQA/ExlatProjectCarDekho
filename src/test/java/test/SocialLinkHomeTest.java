package test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.SocialLinkHomePage;
import testcase.WebTest;

public class SocialLinkHomeTest extends WebTest {
    public SocialLinkHomePage socialLinkHomePage;

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        socialLinkHomePage = new SocialLinkHomePage();
    }
    @Test
    void Test1(){
        driver.findElement(By.xpath("//a[@title='Facebook']")).click();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
