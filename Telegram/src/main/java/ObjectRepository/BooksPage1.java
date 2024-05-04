package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage1 {
	public BooksPage1(WebDriver driver) {            //constructor
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement bookstitle;
	public WebElement getBookstitle() {
		return bookstitle;
	}

}
