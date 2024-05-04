package ObjectRepositorySSF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSFCartPage {
	public SSFCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Enter your promotional code")
	private WebElement promotionalcode;
	
	@FindBy(id = "coupon_code")
	private WebElement couponcodefield;
	
	@FindBy(name = "apply_coupon")
	private WebElement okbutton;
	
	
	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	private WebElement checkoutlink;
	
	@FindBy(linkText = "Change address")
	private WebElement changeaddress;
	
	@FindBy(linkText = "Update")
	private WebElement updatelink;
	
	@FindBy(linkText = "Update cart")
	private WebElement updatecart;
	
	@FindBy(linkText = "Continue Shopping")
	private WebElement continueshopping;

	public WebElement getPromotionalcode() {
		return promotionalcode;
	}

	public WebElement getCouponcodefield() {
		return couponcodefield;
	}

	public WebElement getOkbutton() {
		return okbutton;
	}

	public WebElement getCheckoutlink() {
		return checkoutlink;
	}

	public WebElement getChangeaddress() {
		return changeaddress;
	}

	public WebElement getUpdatelink() {
		return updatelink;
	}

	public WebElement getUpdatecart() {
		return updatecart;
	}

	public WebElement getContinueshopping() {
		return continueshopping;
	}

}
