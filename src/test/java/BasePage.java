import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BasePage {

    //Important variable to be declared first
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;
    public static String url = "https://bbb.testpro.io/";


    //Always set up the browser in before suite
    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.edgedriver().setup();
    }

    //Launch the browser, set the explicit wait and create an object of the action class in before method.
    @BeforeMethod
    void launchBrowser(){
        //Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        //Launch browser
        driver = new ChromeDriver(options);
        //driver = new EdgeDriver();

        //Explicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Actions class object
        actions = new Actions(driver);

        driver.get(url);
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }


    //Helper methods
    public WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void click (By locator) {
        findElement(locator).click();
    }
}


