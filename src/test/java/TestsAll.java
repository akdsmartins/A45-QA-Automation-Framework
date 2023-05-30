import org.testng.annotations.Test;

public class TestsAll extends BasePage{


    //Login Tests
    @Test
    public void LoginValidEmailAndPassword (){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("te$t$tudent");
        loginPage.clickLogin();
        homePage.verifyLogin();
    }

    //All Songs Page Tests
    @Test
    public void totalCountOfSongsDisplayed() {
        LoginPage loginPage = new LoginPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("te$t$tudent");
        loginPage.clickLogin();
        allSongsPage.clickAllSongs();
        allSongsPage.verifyTotalCountSongsDisplayed();
    }
}
