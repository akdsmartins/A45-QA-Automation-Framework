import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Homework24 extends BaseTest{
    @Test
    public void renamePlaylist (){

        LoginPage loginpage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

<<<<<<< Updated upstream:src/test/java/Homework24.java
        loginpage.login();
        homePage.rightClickFirstPlaylist();
        homePage.clickEdit();
        homePage.enterPlaylistName();
        homePage.assertPlaylistExist();
=======

>>>>>>> Stashed changes:src/test/java/Homework23.java
    }
}
