import org.testng.annotations.Test;

public class LoginTests extends BasePage{

    @Test
    public void LoginValidEmailAndPassword (){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("te$t$tudent");
        loginPage.clickLogin();
    }


}
