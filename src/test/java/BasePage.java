import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import javax.swing.*;
import java.time.Duration;

public class BasePage {

    //Important variable to be declared first
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Action actions;
    public static String url = "https://bbb.testpro.io/";


    //Always set up the browser in before suite
    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.edgedriver().setup();
    }

    //Launch the browser and set the explicit wait in before method
    @BeforeMethod
    static void launchBrowser (){
        //Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        //Launch browser
        driver = new ChromeDriver(options);
        //driver = new EdgeDriver();

        //Explicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(url);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }



}