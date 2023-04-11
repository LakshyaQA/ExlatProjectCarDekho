package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

import static testcase.WebTestBase.driver;

public class TestUtils {
    public static final long IMPLICIT_WAIT = 20;
    public static final long PAGE_LOAD_WAIT = 20;

    public static String getTextOfPage(String title) {
        return driver.getTitle();
    }

    public static String getTxtOfPage(WebElement element) {
        return element.getText();
    }

    public static String getTxtOfHover(WebElement element) {
        return element.getText();
    }

    public static String textTab(WebElement element) {
        return element.getText();
    }


    public static void getSearch(List<WebElement> elements, String searchtext) {  //homepage
        for (WebElement e : elements) {
            if (e.getText().equalsIgnoreCase(searchtext)) {
                e.click();
                break;
            }
        }
    }

    public static void scrollDowByPixel() {      //social link homepage
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)");
    }

    public static void getWindowHandles() {
        String parentId = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if (!parentId.contentEquals(s)) {
                driver.switchTo().window(s);
                driver.close();
            }
            driver.switchTo().window(parentId);
        }
    }
}