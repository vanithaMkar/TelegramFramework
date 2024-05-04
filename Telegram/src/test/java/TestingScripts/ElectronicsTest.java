package TestingScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElectronicsTest {
	
	@Test(priority = 0)// The lowest priority is the first priority and it will only execute first..we can give zero or -1
	public void Register(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		//driver.get("ghjk");
		driver.quit();
	}
	
	@Test(priority = 1,groups = {"FT","smoke"})//if we give 2 group names then write them inside curly braces
	public void Login(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.quit();
	}
	@Test(priority = 2)
	public void AddToCart(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Add to cart");
		driver.quit();
	}
	@Test(priority = 3)
	public void Payment(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Payment");
		driver.quit();
	}
	@Test(priority = 4)
	public void ConfirmOrder(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Confirm Order");
		driver.quit();
	}
	

}//If we didn't use priority the order of execution will be in the Alphabetical order..i.e ,It will print the output in Alphabetical order

//The default priority for everything is zero....if we give 0 for the first one and didn't give any priority for the rest of them,then the first one will come as per the first priority(i.e Register will print first) and others will print as per the alphabetical order.

//If we use priority, if any testcase fails it wont skips the other testcases...so to overcome this we should use "dependsonmethods" which will skip the remaining testcases if any testcase fails.