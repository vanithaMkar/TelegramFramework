package genericLibrary;

import java.lang.reflect.Method;
import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ObjectRepository.WelcomePage;

public class BaseClass {
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
@BeforeSuite
	public void bs() {
		report=new ExtentReports("./Reports1/report.html");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before suite");
		
		
	}


@BeforeTest
public void LaunchBrowser() {
//	driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://demowebshop.tricentis.com/");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("Before test");
}	
	

@BeforeClass
public void bc() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("Before Class");
}

@BeforeMethod
public void login(Method method) {
	String methodName=method.getName();
	test=report.startTest(methodName);
	WelcomePage welcomepage=new WelcomePage(driver);
	
}
@AfterSuite
public void AS() {
	report.flush();
	System.out.println("After Suite");
	
}
@AfterTest
public void At() {
	System.out.println("After test");
	
}

@AfterClass
public void Ac() {
	System.out.println("After Class");
}
@AfterMethod
public void logout() {
	report.endTest(test);
}



}

