import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage{

    //This method is set, so you can pass the driver to the test method
    public LoginPage(WebDriver driver) {
        //Since we are using POM, lets initialize Page Factory which will let us initialize page elements without using the FindElement
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }

    //Web elements Page Factory
    @FindBy(css = "input[type='email']")
    private WebElement emailField;
    @FindBy(css = "input[type='password']")
    private WebElement passwordField;
    @FindBy(css = "button[type='submit']")
    private WebElement submitBtn;
    @FindBy(css = ".home.active")
    private WebElement homePage;

    @FindBy(css = "#app .error")
    private WebElement loginError;

    //Methods
    public void provideEmail (String email){
        emailField.sendKeys(email);
    }
    public void providePassword (String password){
        passwordField.sendKeys(password);
    }
    public void clickLogin (){
        submitBtn.click();
    }

    public void verifyLogin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home.active")));
        Assert.assertEquals(homePage.isDisplayed(), true);
    }

    public void verifyInvalidLogin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#app .error")));
        Assert.assertEquals(loginError.isDisplayed(), true);
    }
}


