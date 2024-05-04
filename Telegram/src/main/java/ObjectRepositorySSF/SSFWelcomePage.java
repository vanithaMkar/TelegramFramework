package ObjectRepositorySSF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSFWelcomePage {
	public  SSFWelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "et_b_header-account")
	private WebElement myaccountlink;

	public WebElement getMyaccountlink() {
		return myaccountlink;
	}
	

}
