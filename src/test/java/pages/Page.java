package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Page {

    private WebDriver driver = Driver.getDriver();

    @FindBy (xpath= "//span[@id='idcta-username']")
    public WebElement signin;

    @FindBy (id="user-identifier-input")
    public WebElement username;

    @FindBy (id="password-input")
    public WebElement password;

    @FindBy (id="submit-button")
    public WebElement signinButton;

    @FindBy (linkText = "More")
    public WebElement moreLink;

    @FindBy (linkText = "Weather")
    public WebElement weather;

    @FindBy (id="ls-c-search__input-label")
    public WebElement searchlabel;




    public Page() {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }




    public void getUrl(final String url) {
        driver.navigate().to(url);
    }

    public void clickSignin() throws InterruptedException {
        Thread.sleep(2000);
        signin.click();

    }
    public void enterUsername(String name)
    {
        username.sendKeys(name);
    }
    public void enterPassword(String pwd)
    {
    password.sendKeys(pwd);
    }
    public void signin()
    {
        signinButton.click();
    }

    public void clickMore()
    {
        moreLink.click();
    }
    public void clickweather()
    {
       weather.click();
    }
    public void searchnewcastle() throws InterruptedException {
       searchlabel.sendKeys("Newcastle-upon-tyne");
       searchlabel.sendKeys(Keys.ENTER);
        searchlabel.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }



}
