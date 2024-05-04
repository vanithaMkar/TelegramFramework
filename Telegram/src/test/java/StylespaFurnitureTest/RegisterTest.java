package StylespaFurnitureTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.WelcomePage;
import ObjectRepositorySSF.SSFCartPage;
import ObjectRepositorySSF.SSFCheckoutPage;
import ObjectRepositorySSF.SSFHomePage;
import ObjectRepositorySSF.SSFLoginPage;
import ObjectRepositorySSF.SSFMyAccountPage;
import ObjectRepositorySSF.SSFPaymentPage;
import ObjectRepositorySSF.SSFRegisterPage;
import ObjectRepositorySSF.SSFTrackOrderPage;
import ObjectRepositorySSF.SSFWelcomePage;
import ObjectRepositorySSF.SSFWishlistPage;

public class RegisterTest {
	
	@Test

	public void Register()  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stylespafurniture.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		SSFWelcomePage ssfwelcomepage=new SSFWelcomePage(driver);
		ssfwelcomepage.getMyaccountlink().click();
		//SSFLoginPage ssfloginpage=new SSFLoginPage(driver);
		SSFRegisterPage ssfregisterpage=new SSFRegisterPage(driver);
		//SSFMyAccountPage ssfmyaccountpage=new SSFMyAccountPage(driver);
		//SSFTrackOrderPage ssftrackorderpage=new SSFTrackOrderPage(driver);
		SSFHomePage ssfhomepage=new SSFHomePage(driver);
		//SSFWishlistPage ssfwishlistpage=new SSFWishlistPage(driver);
		//SSFCartPage ssfcartpage=new SSFCartPage(driver);
		//SSFCheckoutPage ssfcheckoutpage=new SSFCheckoutPage(driver);
		//SSFPaymentPage ssfpaymentpage=new SSFPaymentPage(driver);
		ssfregisterpage.getRegemail().sendKeys("kittuvaniii@gmail.com");
		ssfregisterpage.getRegpassword().sendKeys("V@ni82799");
		ssfregisterpage.getRegisterbutton().click();
		driver.quit();
		}



       
        
        
        
        
        
}


