package utils;

import org.openqa.selenium.WebElement;

import java.util.List;

public class TestUtils {
    public static final long IMPLICIT_WAIT = 20;         //using final long
    public static final long PAGE_LOAD_WAIT = 20;

    public static String getTextOfElement(WebElement element) {
        return element.getText();
    }

    public static void getSearch(List<WebElement> elements ,String searchtext) {
        for (WebElement e : elements) {
            if (e.getText().equalsIgnoreCase("searchtext")) {
                e.click();
                break;
            }
        }
    }

}

