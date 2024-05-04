package StylespaFurnitureTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRepositorySSF.SSFHomePage;
import ObjectRepositorySSF.SSFLoginPage;
import ObjectRepositorySSF.SSFWelcomePage;

public class AddToCartTest {
	@Test
	public void AddToCart() {
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
	 Actions action=new Actions(driver);
	 action.moveToElement(ssfhomepage.getBedroommodule()).perform();
	 ssfhomepage.getSinglebedslink().click();
	 ssfhomepage.getOptimasinglebed().click();
	 ssfhomepage.getAddtocart().click();
	 ssfhomepage.getPincodefield().sendKeys("600040");
	 ssfhomepage.getPinsearchlink().click();
	 ssfhomepage.getAddtocart().click();
	 driver.quit();

}
}
