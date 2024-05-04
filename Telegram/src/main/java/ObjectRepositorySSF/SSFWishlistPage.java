package ObjectRepositorySSF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSFWishlistPage {
	public SSFWishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "product_actions")
	private WebElement actionsfield;
	
	@FindBy(xpath = "//button[@title=\"Apply Action\"]")
	private WebElement applyactionsbutton;
	
	@FindBy(linkText = "Add All to Cart")
	private WebElement addalltocartbutton;
	
	@FindBy(linkText = "Return to previous page")
	private WebElement returnlink;
	
	@FindBy(xpath = "//span[.='Add to Wishlist']")
	private WebElement optimalbedwishlist;

	public WebElement getOptimalbedwishlist() {
		return optimalbedwishlist;
	}

	public WebElement getActionsfield() {
		return actionsfield;
	}

	public WebElement getApplyactionsbutton() {
		return applyactionsbutton;
	}

	public WebElement getAddalltocartbutton() {
		return addalltocartbutton;
	}

	public WebElement getReturnlink() {
		return returnlink;
	}

}
