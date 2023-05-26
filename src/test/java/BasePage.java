import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import javax.swing.*;

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

    //Launch the browser in before method
    @BeforeMethod
    static void launchBrowser (){
        //Added ChromeOptions argument below to fix websocket errorAdded ChromeOptions argument below to fix websocket error


    }



}