import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistTests extends BasePage{

    //Playlist Tests

    @Test
    public void createNewPlaylist () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("te$t$tudent");
        loginPage.clickLogin();

        playlistPage.clickCreatePlaylist();
        playlistPage.clickNewPlaylist();
        playlistPage.enterPlaylistName("playlist2");
    }

    @Test
    public void addSongsToPlaylist (){
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("te$t$tudent");
        loginPage.clickLogin();

        allSongsPage.clickAllSongs();
        allSongsPage.clickSong();
        allSongsPage.clickAddToBtn();
        allSongsPage.selectPlaylist();
        playlistPage.verifySongIsAdded();
    }

}
