import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

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


