import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest {
    @Test
    public void addSongToPlaylist() {
        setUpBrowser();
        openLoginUrl();
        enterValidEmail("amanda.martins@testpri.io");
        enterValidPassword("te$t$tudent");
        clickSubmit();

        WebElement searchField = driver.findElement(By.cssSelector("[type='search']"));
        searchField.click();
        searchField.sendKeys("dark days");

        WebElement viewAllButton = driver.findElement(By.cssSelector("[data-test='view-all-songs-btn']"));
        viewAllButton.click();

        WebElement firstSong = driver.findElement(By.cssSelector("tr.song-item.playing.selected td:nth-child(2)"));
        firstSong.click();

        WebElement addTo = driver.findElement(By.cssSelector("[title='Add selected songs to…']"));
        addTo.click();

        WebElement addToFavorites = driver.findElement(By.cssSelector("#songResultsWrapper li:nth-child(5)"));
        addToFavorites.click();

        WebElement notificationMessage = driver.findElement(By.cssSelector("div.success.show"));
        Assert.assertEquals();



    }



}
