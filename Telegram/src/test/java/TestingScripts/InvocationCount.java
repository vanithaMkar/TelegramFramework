package TestingScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test (invocationCount = 6,threadPoolSize = 3)//,enabled = false)
	public void Register(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		//driver.get("ghjk");
		driver.quit();
	}
	
	@Test
	public void Login(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.quit();
	}
	@Test
	public void AddToCart(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Add to cart");
		driver.quit();
	}
	@Test
	public void Payment(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Payment");
		driver.quit();
	}
	@Test
	public void ConfirmOrder(){
		WebDriver driver=new ChromeDriver();
		System.out.println("Confirm Order");
		driver.quit();
	}
}

//invocationcount=0 //if we dont want any testcase to run then use 0
//
//invocationcount=0,threadpoolsixe=1 //
//
//invo=2,threadpoolsize=0 //
//
//invo=5,thread=6 //
//
//invo=0,thread=2 //it will run...but it shouldnt run..so it is a defect in testng





