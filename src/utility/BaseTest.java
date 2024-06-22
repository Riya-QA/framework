package utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
	public Properties properties;
	
	@BeforeClass
	public void setup() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		FileInputStream fis=new FileInputStream(properties_path);
		properties=new Properties();
		properties.load(fis);
		driver.get(properties.getProperty("url"));
		//driver.get(url);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}