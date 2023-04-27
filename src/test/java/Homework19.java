import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {
    @Test
    public void deletePlaylist(){
        String playlistName = "new";

        launchBrowser(url);
        provideEmail("amanda.martins@testpro.io");
        providePassword("te$t$tudent");

        WebElement selectPlaylist = driver.findElement(By.cssSelector(".side.side-nav #playlists li:nth-child(3)"));
        selectPlaylist.click();

        WebElement deletePlaylist = driver.findElement(By.cssSelector(".del.btn-delete-playlist"));
        deletePlaylist.click();

        WebElement notificationMessage = driver.findElement(By.cssSelector(".success.show"));
        Assert.assertEquals(notificationMessage.getText(), "Deleted playlist "+playlistName);
    }
}
