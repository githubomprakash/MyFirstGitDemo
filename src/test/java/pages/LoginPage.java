package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver rdriver) {

        this.driver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

   
    // Method2 - By PageFactory

    @FindBy(id = "Email")
    WebElement txtEmail;
    
   
    // Method3
    @FindBy(how = How.NAME, using = "Password")
    WebElement txtPass;

    // Ruto- utility

    @FindBy(how = How.TAG_NAME, using = "button")
    private WebElement btnLogIn;

    @FindBy(xpath = "//a[contains(@href,'logout')]")
    WebElement btnLogout;

    @FindBy(xpath = "//h2[text()='Defaults for admin area']")
    WebElement lblDashBoard;

    public void enterUserName(String username) {

        txtEmail.clear();
        txtEmail.sendKeys(username);

    }

    public void enterPassword(String password) {

        txtPass.clear();
        txtPass.sendKeys(password);

    }

    public void clickLoginButton() throws Exception {

        btnLogIn.click();
        Thread.sleep(2000);

    }

    public String getAppTitle() {

        return driver.getTitle();
    }

    public boolean verifyAppLogo() {

        return lblDashBoard.isDisplayed();
    }

    public void clickLogout() {

        btnLogout.click();

    }

	/*
	 * public void clickCustomerMenu() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	

}

