package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage 
{
    //variable
	@FindBy(xpath="//a[text()='Sign in']") private WebElement signInButtonHomePage;
	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement mobileNumberField;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signInWithPassword;
	@FindBy(name="password")private WebElement passwordField;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signInButton;
	@FindBy(xpath="//div[text()='My Account']")private WebElement myAccountButton;
	@FindBy(xpath="//span[text()=' My profile ']")private WebElement myProfileButton;
	
	//constructor
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	//methods
	public void clickOnHomePageSignInButton() 
	{
		Reporter.log("clicking on home page signInButton",true);
		signInButtonHomePage.click();	
	}
	
	public void enterMobileNum(String mobNum)
	{   
		Reporter.log("entering mobile number",true);
	    mobileNumberField.sendKeys("8261853158");	
	}
	public void clickOnSignInWithPassword()
	{
		Reporter.log("clicking on signInWithPassword",true);
		signInWithPassword.click();
	}
	public void enterPassword(String pwd )
	{
		Reporter.log("entering password",true);
		passwordField.sendKeys("anju2510");
	}
	public void clickOnSignInButton()
	{
		Reporter.log("clicking on signInButton",true);
		signInButton.click();
	}
	public void clickOnMyAccountButton()
	{
		Reporter.log("clicking on myAccount Button",true);
		myAccountButton.click();
	}
	public void clickOnMyProfileButton()
	{
		Reporter.log("clicking on myProfile Button",true);
		myProfileButton.click();
	}
	
}
