import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 extends BaseTest{

    @Test
    public void registrationNavigation(){

        //Add ChromeOptions argument to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        //open Chrome Browser
        WebDriver driver = new ChromeDriver(options);
        //wait 10 seconds for an element to load before failing a test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //open a URL
        String url = "https://bbb.testpro.io/";
        driver.get(url);

        //Locate web element for registration button by css selector and click to element
        WebElement registrationButton = driver.findElement(By.cssSelector("a[type='submit']"));
        registrationButton.click();

        //Make sure that the driver matches the registration page
        WebElement registerButton = driver.findElement(By.cssSelector("#button"));
        Assert.assertEquals(registerButton.isDisplayed(), true);

        //close the browser
        driver.quit();
    }

}
