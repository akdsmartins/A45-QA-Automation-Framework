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

    @FindBy(css = ".menu a.songs")
    private WebElement allSongsPage;

    @FindBy(css = "#songsWrapper span.meta.text-secondary")
    private WebElement totalCount;

    @FindBy(css = "#songsWrapper th.track-number")
    private WebElement idColumn;

    @FindBy(css = "#songsWrapper th.title")
    private WebElement titleColumn;

    @FindBy(css = "#songsWrapper th.artist")
    private WebElement artistColumn;

    @FindBy(css = "#songsWrapper th.album")
    private WebElement albumColumn;

    @FindBy(css = "#songsWrapper th.time")
    private WebElement timeColumn;

    @FindBy(css = "#songsWrapper .items tr:nth-child(1)")
    private WebElement firstSong;

    @FindBy(css = ".btn-add-to")
    private WebElement addToBtn;

    @FindBy(css = "#songsWrapper li:nth-child(5)")
    private WebElement selectPlaylistFromAllSongsPage;

    //Methods
    public void clickAllSongs() {
        click(allSongsPage);
    }

    public void verifyTotalCountAndDurationDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#songsWrapper span.meta.text-secondary")));
        Assert.assertEquals(totalCount.isDisplayed(), true);
    }

    public void verifyIdColumnDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#songsWrapper th.track-number")));
        Assert.assertEquals(idColumn.isDisplayed(), true);
    }

    public void verifyTitleColumnDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#songsWrapper th.title")));
        Assert.assertEquals(titleColumn.isDisplayed(), true);
    }

    public void verifyArtistColumnDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#songsWrapper th.artist")));
        Assert.assertEquals(artistColumn.isDisplayed(), true);
    }

    public void verifyAlbumColumnDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#songsWrapper th.album")));
        Assert.assertEquals(albumColumn.isDisplayed(), true);
    }

    public void verifyTimeColumnDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#songsWrapper th.time")));
        Assert.assertEquals(timeColumn.isDisplayed(), true);
    }

    public void clickSong (){
        click(firstSong);
    }

    public void clickAddToBtn (){
        click(addToBtn);
    }

    public void selectPlaylist (){
        click(selectPlaylistFromAllSongsPage);
    }


}
