package ObjectRepositorySSF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSFLoginPage {
	public SSFLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username' and @class='woocommerce-Input woocommerce-Input--text input-text']")
	private WebElement loginemail;
	
	@FindBy(xpath = "//input[@name='password' and @class='woocommerce-Input woocommerce-Input--text input-text']")
	private WebElement loginpassword;
	
	@FindBy(xpath = "//button[.='Log in']")
	private WebElement loginbutton;

	public WebElement getLoginemail() {
		return loginemail;
	}

	public WebElement getLoginpassword() {
		return loginpassword;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

}
