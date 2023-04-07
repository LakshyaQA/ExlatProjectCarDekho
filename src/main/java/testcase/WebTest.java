package testcase;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.TestUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebTest {

    public static WebDriver driver;
                                                                                                        // public static WebDriverManager driver;
    public static Properties prop;

    public WebTest() {                                                                                 //properties file handling
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/properties/config.properties");
            prop = new Properties();
            prop.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            }                                                                                       //always forgot to add this
                                                                                                    //initialize driver method create
        public static void initialization() {
            String browser = prop.getProperty("browser");                                           //getting the browser which ever name meets feeding driver of browsers in browser key
            if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivermanager/chromedriver.exe");
            driver = new ChromeDriver();
        }   else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/drivermanager/geckodriver.exe");
                driver = new ChromeDriver();
        }   else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/resources/drivermanager/msedgedriver.exe");
                driver = new ChromeDriver();
        }   else   {
                try{
                    throw new Exception("Enter valid Browser Name");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            driver.navigate().to(prop.getProperty("url"));                                                   //when required calling key frm properties class by get properties
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.PAGE_LOAD_WAIT));//goto TestUtils files
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtils.IMPLICIT_WAIT));
            driver.manage().deleteAllCookies();
        }
    }


