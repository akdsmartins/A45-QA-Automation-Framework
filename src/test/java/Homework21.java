import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
public class Homework21 extends BaseTest{
    @Test
    public void renamePlaylist(){
        navigateToPage();
        provideEmail("amanda.martins@tetpro.io");
        providePassword("te$t$tudent");
        clickSubmit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mainWrapper #sidebar #playlists li:nth-child(3)")));
        actions.contextClick(driver.findElement(By.cssSelector("#mainWrapper #sidebar #playlists li:nth-child(3)"))).perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".menu.playlist-item-menu li:nth-child(1)")));
        actions.click(driver.findElement(By.cssSelector(".menu.playlist-item-menu li:nth-child(1)"))).perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mainWrapper #sidebar .active")));
        actions.contextClick(driver.findElement(By.cssSelector("#mainWrapper #sidebar #playlists li:nth-child(3)"))).perform();






    }
}
