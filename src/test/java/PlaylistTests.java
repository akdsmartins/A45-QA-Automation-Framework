import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistTests extends BasePage{

    @Test
    public void createNewPlaylist () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        playlistPage.clickCreatePlaylist();
        playlistPage.clickNewPlaylist();
        playlistPage.enterPlaylistName("playlist2");
        playlistPage.verify();
    }

    @Test
    public void addSongsToPlaylist (){
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        allSongsPage.clickAllSongs();
        allSongsPage.clickSong();
        allSongsPage.clickAddToBtn();
        allSongsPage.selectPlaylist();
        playlistPage.verify();
    }

    @Test
    public void deleteSongFromPlaylist (){
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        playlistPage.selectFirstPlaylist();
        playlistPage.selectFirstSongInPlaylist();
        deleteKeyBoard();
        playlistPage.verify();
    }

    @Test
    public void deletePlaylist () {
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        playlistPage.selectFirstPlaylist();
        playlistPage.deletePlaylist();
        playlistPage.verify();
    }

    @Test
    public void createSmartPlaylistOneRule () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        playlistPage.clickCreatePlaylist();
        playlistPage.clickNewSmartPlaylist();
        playlistPage.enterSmartPlaylistName("SmartPlaylist");
        playlistPage.enterCriteriaValue("Hand");
        playlistPage.clickSave();
        playlistPage.verify();
    }

    @Test
    public void createSmartPlaylistMultipleRule() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        playlistPage.clickCreatePlaylist();
        playlistPage.clickNewSmartPlaylist();
        playlistPage.enterSmartPlaylistName("SmartPlaylist2");
        playlistPage.enterCriteriaValue("Frantic");
        playlistPage.clickAddRule();
        playlistPage.clickCriteriaOneRuleTwo();
        playlistPage.changeCriteriaToAlbumRuleTwo();
        playlistPage.enterSecondCriteriaValue("Defunct");
        playlistPage.clickSave();
        playlistPage.verify();
    }

}
