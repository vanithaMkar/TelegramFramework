package TestingScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {

	@Test
		
		public void register_test001(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		driver.quit();
		

	}
	@Test
	public void register_test002(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yahoo.com");
		
		driver.quit();
	

}
}
