package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import pages.Actitime_HomePage;
import pages.Actitime_LoginPage;
import utility.BaseTest;

public class TC1_ActitimeLoginLogout extends BaseTest
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		Actitime_LoginPage loginPage=new Actitime_LoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() throws InterruptedException
	{
		Actitime_HomePage homePage=new Actitime_HomePage(driver);
		homePage.logoutMethod();
	}
}
