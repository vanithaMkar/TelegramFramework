package ObjectRepositorySSF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSFMyAccountPage {
	public SSFMyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "My Orders")
	private WebElement myorderslink;
	
	@FindBy(linkText = "Edit Address")
	private WebElement editaddresslink;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutlink;

	public WebElement getMyorderslink() {
		return myorderslink;
	}

	public WebElement getEditaddresslink() {
		return editaddresslink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
	
	

}
