package TestingScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMehodsTest {
	
	
	@Test 
	public void Register(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		driver.get("ghjk");//Here the URL is wrong so "DependsOnmethods" will skip the remaining TestCases to save the time
		driver.quit();
	}
	
	@Test(dependsOnMethods = "Register")
	public void Login(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.quit();
	}
	@Test(dependsOnMethods = "Login")
	public void AddToCart(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Add to cart");
		driver.quit();
	}
	@Test(dependsOnMethods = "AddToCart")
	public void Payment(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Payment");
		driver.quit();
	}
	@Test(dependsOnMethods = "Payment")
	public void ConfirmOrder(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Confirm Order");
		driver.quit();
	}

}
