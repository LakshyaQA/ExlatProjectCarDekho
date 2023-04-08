package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.RadioButtonHomePage;
import testcase.WebTest;

public class RadioButtonHomeTest extends WebTest {
    public RadioButtonHomePage radioButtonHomePage;

    RadioButtonHomeTest() {
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        radioButtonHomePage = new RadioButtonHomePage();
    }
    @Test
    public void test1(){    //partially working
        System.out.println("running");
        radioButtonHomePage.clickRadioBtn();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(5000);
        //driver.close();
    }

}
