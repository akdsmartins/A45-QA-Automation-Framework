import org.testng.annotations.Test;

public class LoginTests extends BasePage {

    @Test
    public void loginWithRegisteredEmailAndPassword (){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.provideEmail("amanda.martins@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();
        loginPage.verifyLogin();
    }

    @Test
    public void loginWithInvalidEmailAndValidPassword (){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.provideEmail("amanda.martins1@testpro.io");
        loginPage.providePassword("amanda147*");
        loginPage.clickLogin();
        loginPage.verifyInvalidLogin();
    }

//    @Test
//    public void loginWithValidEmailAndInvalidPassword (){
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.provideEmail("amanda.martins@testpro.io");
//        loginPage.providePassword("amanda147*12");
//        loginPage.clickLogin();
//
//    }

    


}
