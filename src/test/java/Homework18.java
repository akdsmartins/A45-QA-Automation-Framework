import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest{

  @Test
  public void playSong(){
   navigateToPage();
   provideEmail("amanda.martins@testpro.io");
   providePassword("te$t$tudent");
   clickSubmit();

   WebElement clickPlayNextSong = driver.findElement(By.cssSelector(".next.fa.fa"));
   clickPlayNextSong.click();

   WebElement clickPlaySong = driver.findElement(By.cssSelector("[title='Play or resume']"));
   clickPlaySong.click();

   WebElement verifySongPlaying = driver.findElement(By.cssSelector("span.pause"));




     
 }



}
