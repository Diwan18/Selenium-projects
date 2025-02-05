package baseClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver;
	
	
	
	@BeforeMethod
	public void precondition () {
		
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.get("http://leaftaps.com/opentaps/");
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void postcondition () {
		driver.quit();
		
		
	}
	

}
