import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AllSongsPage extends BasePage {

    //This method is set, so you can pass the driver to the test method
    public AllSongsPage(WebDriver driver) {
        //Since we are using POM, lets initialize Page Factory which will let us initialize page elements without using the FindElement
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }

    @FindBy(css = ".songs.active")
    private WebElement AllSongsPage;

    @FindBy(css = "#songsWrapper span.meta.text-secondary")
    private WebElement totalCount;

    public void clickAllSongs() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".songs.active")));
        AllSongsPage.click();
    }

    public void verifyTotalCountSongsDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#songsWrapper span.meta.text-secondary")));
        Assert.assertEquals(totalCount.isDisplayed(), true);
    }
}
