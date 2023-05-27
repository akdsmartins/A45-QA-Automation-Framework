import org.testng.annotations.Test;

public class LoginTests extends BasePage{

    @Test
    public void LoginValidEmailAndPassword (){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("te$t$tudent");
        loginPage.clickLogin();
        homePage.verifyLogin();
    }
}
