package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
 	@Test
 	public void loginTest() throws IOException 
 	{
 		driver.get(baseURL);
 		logger.info("opening url");
 		LoginPage lp = new LoginPage(driver);
 		
 		lp.setUserName(username);
 		logger.info("entered username");
 		lp.setPassword(password);
 		logger.info("entered username");
 		
 		lp.clickSubmit();
 		logger.info("clicked login");
 		
 		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTesting");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
 	}
 	

}
