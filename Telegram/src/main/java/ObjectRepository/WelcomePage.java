package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "BOOKS")
	private WebElement bookslink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	@FindBy(linkText = "ELECTRONICS")
	private WebElement electronicslink;
	
	@FindBy(linkText = "COMPUTERS")
	private WebElement computerlink;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getBookslink() {
		return bookslink;
	}

}
