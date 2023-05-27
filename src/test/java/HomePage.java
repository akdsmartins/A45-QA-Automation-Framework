import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage{

    //This method is set, so you can pass the driver to the test method
    public HomePage(WebDriver driver) {
        //Since we are using POM, lets initialize Page Factory which will let us initialize page elements without using the FindElement
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }

    //Web elements Page Factory
    @FindBy(css = "input[type='search']")
    private WebElement avatarIcon;

    //Methods
    public void verifyLogin (){
        Assert.assertEquals(avatarIcon.isDisplayed(), true);
    }
}
