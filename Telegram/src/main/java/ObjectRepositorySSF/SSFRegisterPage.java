package ObjectRepositorySSF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSFRegisterPage {
	public SSFRegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "reg_email")
	private WebElement regemail;
	
	@FindBy(id = "reg_password")
	private WebElement regpassword;
	
	@FindBy(name = "register")
	private WebElement registerbutton;

	public WebElement getRegemail() {
		return regemail;
	}

	public WebElement getRegpassword() {
		return regpassword;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	

}
