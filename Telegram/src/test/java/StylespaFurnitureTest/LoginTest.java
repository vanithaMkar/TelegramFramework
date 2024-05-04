package StylespaFurnitureTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepositorySSF.SSFHomePage;
import ObjectRepositorySSF.SSFLoginPage;
import ObjectRepositorySSF.SSFWelcomePage;

public class LoginTest {
	@Test
    public void Login() {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stylespafurniture.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		SSFWelcomePage ssfwelcomepage=new SSFWelcomePage(driver);
		ssfwelcomepage.getMyaccountlink().click();
		SSFLoginPage ssfloginpage=new SSFLoginPage(driver);
		ssfloginpage.getLoginemail().sendKeys("tanjiroslayer2266@gmail.com");
		ssfloginpage.getLoginpassword().sendKeys("V@ni82799");
		ssfloginpage.getLoginbutton().click();
		//SSFHomePage ssfhomepage=new SSFHomePage(driver);
		driver.quit();
    	
    }
    

}
