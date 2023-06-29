import org.testng.annotations.Test;

public class AllSongsTests extends BasePage{


    //All Songs Page Tests
    @Test
    public void totalCountOfSongsDisplayed() {
        LoginPage loginPage = new LoginPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        allSongsPage.clickAllSongs();
        allSongsPage.verifyTotalCountAndDurationDisplayed();
    }
    @Test
    public void totalDurationOfAllSongsDisplayed (){
        LoginPage loginPage = new LoginPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        allSongsPage.clickAllSongs();
        allSongsPage.verifyTotalCountAndDurationDisplayed();
    }
    @Test
    public void idColumnIsDisplayed(){
        LoginPage loginPage = new LoginPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        allSongsPage.clickAllSongs();
        allSongsPage.verifyIdColumnDisplayed();
    }
    @Test
    public void titleColumnIsDisplayed(){
        LoginPage loginPage = new LoginPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        allSongsPage.clickAllSongs();
        allSongsPage.verifyTitleColumnDisplayed();
    }
    @Test
    public void artistColumnIsDisplayed(){
        LoginPage loginPage = new LoginPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        allSongsPage.clickAllSongs();
        allSongsPage.verifyArtistColumnDisplayed();
    }
    @Test
    public void albumColumnIsDisplayed(){
        LoginPage loginPage = new LoginPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        allSongsPage.clickAllSongs();
        allSongsPage.verifyAlbumColumnDisplayed();
    }
    @Test
    public void timeColumnIsDisplayed(){
        LoginPage loginPage = new LoginPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();

        allSongsPage.clickAllSongs();
        allSongsPage.verifyTimeColumnDisplayed();
    }
}
