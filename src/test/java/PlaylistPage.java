import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Factory;

public class PlaylistPage extends BasePage{

    //This method is set, so you can pass the driver to the test method
    public PlaylistPage(WebDriver driver) {
        //Since we are using POM, lets initialize Page Factory which will let us initialize page elements without using the FindElement
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }

    //Web elements Page Factory
    @FindBy(xpath = "//nav[@id='sidebar']/section[@id='playlists']/h1[1]/i[1]")
    private WebElement createPlaylistBtn;
    @FindBy(css = "li[data-testid='playlist-context-menu-create-simple']")
    private WebElement newPlaylistBtn;
    @FindBy(css = "input[name='name']")
    private WebElement inputNameField;
    @FindBy(css = ".success.show")
    private WebElement verifyMessage;
    @FindBy(css = "#playlists li:nth-child(3)")
    private WebElement firstPlaylist;
    @FindBy(css = "#playlistWrapper td:nth-child(2)")
    private WebElement firstSongInPlaylist;
    @FindBy(css = ".del")
    private WebElement deletePlaylistBtn;
    @FindBy(css = "li[data-testid='playlist-context-menu-create-smart']")
    private WebElement newSmartPlaylistBtn;
    @FindBy(css = "[name='name']")
    private WebElement smartNameField;
    @FindBy(css = "[name='value[]']")
    private WebElement firstRuleCriteriaField;
    @FindBy(xpath = "//*[@id=\"mainWrapper\"]/div/div/div/form/footer/button[1]")
    private WebElement smartSaveBtn;
    @FindBy(css = ".btn-add-rule")
    private WebElement addRuleBtn;
    @FindBy(xpath = "//*[@id=\"mainWrapper\"]/div/div/div/form/div/div[2]/div/div[3]/select[1]")
    private WebElement criteriaOneFieldRuleTwo;
    @FindBy(xpath = "//*[@id=\"mainWrapper\"]/div/div/div/form/div/div[2]/div/div[3]/select[1]/option[2]")
    private WebElement criteriaAlbumRuleTwo;
    @FindBy(xpath = "//*[@id=\"mainWrapper\"]/div/div/div/form/div/div[2]/div/div[3]/span/input")
    private WebElement secondRuleCriteriaField;





    //Methods
    public void clickCreatePlaylist () throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@id='sidebar']/section[@id='playlists']/h1[1]/i[1]")));
        Thread.sleep(1000);
        click(createPlaylistBtn);
    }

    public void clickNewPlaylist (){
        click(newPlaylistBtn);
    }

    public void enterPlaylistName (String playlistName){
        sendKeys(inputNameField, playlistName);
        enterKeyBoard();
    }

    public void verify (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".success.show")));
        Assert.assertEquals(verifyMessage.isDisplayed(), true);
    }

    public void selectFirstPlaylist (){
        click(firstPlaylist);
    }
    public void selectFirstSongInPlaylist (){
        click(firstSongInPlaylist);
    }

    public void deletePlaylist (){
        click(deletePlaylistBtn);
    }

    public void clickNewSmartPlaylist (){
        click(newSmartPlaylistBtn);
    }

    public void enterSmartPlaylistName (String smartPlaylistName){
        sendKeys(smartNameField, smartPlaylistName);
    }

    public void enterCriteriaValue (String firstRuleCriteria){
        sendKeys(firstRuleCriteriaField, firstRuleCriteria);
    }

    public void clickSave (){
        click(smartSaveBtn);
    }

    public void clickAddRule (){
        click(addRuleBtn);
    }

    public void clickCriteriaOneRuleTwo (){
        click(criteriaOneFieldRuleTwo);
    }

    public void changeCriteriaToAlbumRuleTwo(){
        click(criteriaAlbumRuleTwo);
    }

    public void enterSecondCriteriaValue (String secondRuleCriteria){
        sendKeys(secondRuleCriteriaField, secondRuleCriteria);
    }
}
