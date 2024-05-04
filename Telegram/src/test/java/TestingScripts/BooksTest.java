package TestingScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.BooksPage1;
import ObjectRepository.WelcomePage;
import genericLibrary.BaseClass;

public class BooksTest extends BaseClass {

	@Test(groups = "smoke")
	public  void books_001() {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcomepage=new WelcomePage(driver);
		BooksPage1 bookspage1=new BooksPage1(driver);
		welcomepage.getBookslink().click();
		//bookspage1.getBookstitle();
		
		
	
		
		
		
		if(bookspage1.getBookstitle().getText().equals("Books")) {
			System.out.print("Test case pass");
		}else {
			System.out.print("Test case fail");
			
			
		}
		driver.quit();
		
		
		
		
		
		
		

	}

}
