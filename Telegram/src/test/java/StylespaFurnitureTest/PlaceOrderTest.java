package StylespaFurnitureTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectRepositorySSF.SSFCartPage;
import ObjectRepositorySSF.SSFCheckoutPage;
import ObjectRepositorySSF.SSFHomePage;
import ObjectRepositorySSF.SSFLoginPage;
import ObjectRepositorySSF.SSFMyAccountPage;
import ObjectRepositorySSF.SSFPaymentPage;
import ObjectRepositorySSF.SSFTrackOrderPage;
import ObjectRepositorySSF.SSFWelcomePage;

public class PlaceOrderTest {
	@Test
    public void Login() throws AWTException {
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
		SSFCartPage ssfcartpage=new SSFCartPage(driver);
	    SSFCheckoutPage ssfcheckoutpage=new SSFCheckoutPage(driver);
		SSFPaymentPage ssfpaymentpage=new SSFPaymentPage(driver);
		SSFMyAccountPage ssfmyaccountpage=new SSFMyAccountPage(driver);
	    SSFTrackOrderPage ssftrackorderpage=new SSFTrackOrderPage(driver);
	    
	    Actions action=new Actions(driver);
	    action.moveToElement(ssfhomepage.getBedroommodule()).perform();
	    
	    ssfhomepage.getSinglebedslink().click();
	    ssfhomepage.getOptimasinglebed().click();
	    ssfhomepage.getAddtocart().click();
	   
	    ssfhomepage.getPincodefield().sendKeys("600040");
	    ssfhomepage.getPinsearchlink().click();
	    ssfhomepage.getAddtocart().click();
	    ssfhomepage.getCartlink().click();
	    ssfcartpage.getCheckoutlink().click();
	    ssfcheckoutpage.getFirstname().click();
	    Robot robo=new Robot();
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_A);
	    robo.keyRelease(KeyEvent.VK_CONTROL); 
	    robo.keyPress(KeyEvent.VK_BACK_SPACE);
	    robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	    ssfcheckoutpage.getFirstname().sendKeys("vani");
	    ssfcheckoutpage.getLastname().click();
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_A);
	    robo.keyRelease(KeyEvent.VK_CONTROL); 
	    robo.keyPress(KeyEvent.VK_BACK_SPACE);
	    robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	    ssfcheckoutpage.getLastname().sendKeys("M");
	    ssfcheckoutpage.getAddress().click();
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_A);
	    robo.keyRelease(KeyEvent.VK_CONTROL); 
	    robo.keyPress(KeyEvent.VK_BACK_SPACE);
	    robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	    ssfcheckoutpage.getAddress().sendKeys("Anna nagar west");
	    ssfcheckoutpage.getCity().click();
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_A);
	    robo.keyRelease(KeyEvent.VK_CONTROL); 
	    robo.keyPress(KeyEvent.VK_BACK_SPACE);
	    robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	    ssfcheckoutpage.getCity().sendKeys("chennai");
	    
	    Select select=new Select(ssfcheckoutpage.getState());
	    select.selectByVisibleText("Tamil Nadu");
	    ssfcheckoutpage.getPincode().click();
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_A);
	    robo.keyRelease(KeyEvent.VK_CONTROL); 
	    robo.keyPress(KeyEvent.VK_BACK_SPACE);
	    robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	    ssfcheckoutpage.getPincode().sendKeys("600040");
	    ssfcheckoutpage.getPhoneno().click();
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_A);
	    robo.keyRelease(KeyEvent.VK_CONTROL); 
	    robo.keyPress(KeyEvent.VK_BACK_SPACE);
	    robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	    ssfcheckoutpage.getPhoneno().sendKeys("7904533243");
	    ssfcheckoutpage.getEmailid().click();
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_A);
	    robo.keyRelease(KeyEvent.VK_CONTROL); 
	    robo.keyPress(KeyEvent.VK_BACK_SPACE);
	    robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	    ssfcheckoutpage.getEmailid().sendKeys("tanjiroslayer2266@gmail.com");
	    ssfcheckoutpage.getPlaceorder().click();
	    ssfpaymentpage.getMakepay().click();
	    driver.quit();
	}
	    
		
		
		
		

}
