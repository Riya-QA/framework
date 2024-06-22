package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.AutoConstant;
import utility.BasePage;
import utility.ExcelLibrary;
import utility.Screenshot;

public class Actitime_LoginPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	public JavascriptExecutor js;
	public WebDriverWait wait;
	
	@FindBy(id = "username")
	private WebElement usernameTextfield; 
	
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	@FindBy(id = "toPasswordRecoveryPageLink")
	private WebElement forgotpasswordLink;
	
	@FindBy(xpath = "//*[text()='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public Actitime_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException, InterruptedException 
	{
		javascriptHighlightElement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getStringTypeCellData(login_sheet, 1, 0));
		Screenshot.takeElementScreenshot(usernameTextfield, "username");
		
		javascriptHighlightElement(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getStringTypeCellData(login_sheet, 1, 1));
		Screenshot.takeElementScreenshot(passwordTextfield, "password");
		
		javascriptClick(driver, keepmeloggedinCheckbox);
		
		javascriptClick(driver, loginButton);
	}
}
