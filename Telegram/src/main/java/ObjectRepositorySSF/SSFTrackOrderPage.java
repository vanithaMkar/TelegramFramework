package ObjectRepositorySSF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSFTrackOrderPage {
	public SSFTrackOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "orderid")
	private WebElement orderidfield;
	
	@FindBy(id = "order_email")
	private WebElement emailidfield;
	
	@FindBy(linkText = "Track")
	private WebElement trackbutton;

	public WebElement getOrderidfield() {
		return orderidfield;
	}

	public WebElement getEmailidfield() {
		return emailidfield;
	}

	public WebElement getTrackbutton() {
		return trackbutton;
	}

}
