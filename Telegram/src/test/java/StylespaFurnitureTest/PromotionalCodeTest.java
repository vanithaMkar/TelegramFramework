package StylespaFurnitureTest;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRepositorySSF.SSFCartPage;
import ObjectRepositorySSF.SSFCheckoutPage;
import ObjectRepositorySSF.SSFHomePage;
import ObjectRepositorySSF.SSFLoginPage;
import ObjectRepositorySSF.SSFMyAccountPage;
import ObjectRepositorySSF.SSFPaymentPage;
import ObjectRepositorySSF.SSFTrackOrderPage;
import ObjectRepositorySSF.SSFWelcomePage;

public class PromotionalCodeTest {
	@Test
    public void PromotionalCode() {
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
		SSFHomePage ssfhomepage=new SSFHomePage(driver);
		//SSFCartPage ssfcartpage=new SSFCartPage(driver);
	    //SSFCheckoutPage ssfcheckoutpage=new SSFCheckoutPage(driver);
		//SSFPaymentPage ssfpaymentpage=new SSFPaymentPage(driver);
		//SSFMyAccountPage ssfmyaccountpage=new SSFMyAccountPage(driver);
	    //SSFTrackOrderPage ssftrackorderpage=new SSFTrackOrderPage(driver);
	    
	    Actions action=new Actions(driver);
	    action.moveToElement(ssfhomepage.getBedroommodule()).perform();
	    
	    ssfhomepage.getSinglebedslink().click();
	    ssfhomepage.getOptimasinglebed().click();
	    ssfhomepage.getAddtocart().click();
	   
	    ssfhomepage.getPincodefield().sendKeys("600040");
	    ssfhomepage.getPinsearchlink().click();
	    ssfhomepage.getAddtocart().click();
	    //ssfhomepage.getCartlink().click();
	    //ssfhomepage.getCartlink().click();
	    
	    SSFCartPage ssfcartpage=new SSFCartPage(driver);
	    ssfhomepage.getCartlink().click();
	    ssfcartpage.getPromotionalcode().click();
	    ssfcartpage.getCouponcodefield().sendKeys("FESTIVE5");
	    ssfcartpage.getOkbutton().click();
	    
	}
}
