package pages;


	import java.time.Duration;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import utility.BasePage;

	public class Actitime_HomePage extends BasePage
	{
		public WebDriver driver;
		public JavascriptExecutor js;
		public WebDriverWait wait;
		
		@FindBy(id = "container_tasks")
		private WebElement tasksLink;
		
		@FindBy(id = "logoutLink")
		private WebElement logoutLink;
		
		public Actitime_HomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void logoutMethod() throws InterruptedException
		{
			javascriptHighlightElement(driver, logoutLink);
			javascriptClick(driver, logoutLink);
		}
	}

