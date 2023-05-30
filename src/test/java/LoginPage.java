import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}


