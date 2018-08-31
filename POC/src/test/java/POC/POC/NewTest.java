package POC.POC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NewTest {
	private WebDriver driver;	

	  @BeforeMethod
	  public void beforeMethod() {
			System.setProperty("webdriver.chrome.driver","C:/Users/nnjn/eclipse-workspace/chromedriver.exe");
			driver = new ChromeDriver();
	  }
	  
	  @Test
	  public void f() {
			driver.get("https://www.google.com/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Google")); 	
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();	
	  }
}
