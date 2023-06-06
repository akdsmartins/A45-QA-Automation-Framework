import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Factory;

public class PlaylistPage extends BasePage{

    //This method is set, so you can pass the driver to the test method
    public PlaylistPage(WebDriver driver) {
        //Since we are using POM, lets initialize Page Factory which will let us initialize page elements without using the FindElement
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }

    //Web elements Page Factory
    @FindBy(xpath = "//nav[@id='sidebar']/section[@id='playlists']/h1[1]/i[1]")
    private WebElement createPlaylistBtn;
    @FindBy(css = "li[data-testid='playlist-context-menu-create-simple']")
    private WebElement newPlaylistBtn;
    @FindBy(css = "input[name='name']")
    private WebElement inputNameField;

    //Methods
    public void clickCreatePlaylist () throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@id='sidebar']/section[@id='playlists']/h1[1]/i[1]")));
        Thread.sleep(10000);
        click(createPlaylistBtn);
    }

    public void clickNewPlaylist (){
        click(newPlaylistBtn);
    }

    public void enterPlaylistName (String playlistName){
        sendKeys(inputNameField);
        enterKeyBoard();
    }

    public void addSongToPlaylist (){

    }
}
