package ObjectRepositorySSF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSFCheckoutPage {
	public SSFCheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Click here to enter your code")
	private WebElement couponlink;
	
	@FindBy(id = "coupon_code")
	private WebElement coupontextfield;

	
	@FindBy(linkText = "Apply coupon")
	private WebElement applycoupon;
	
	@FindBy(xpath = "//input[.='Proceed to Pay']")
	private WebElement placeorder;

	@FindBy(id = "billing_first_name")
	private WebElement firstname;

	@FindBy(id = "billing_last_name")
	private WebElement lastname;

	@FindBy(id = "billing_address_1")
	private WebElement address;

	@FindBy(id = "billing_city")
	private WebElement city;

	@FindBy(id = "billing_state")
	private WebElement state;

	@FindBy(id = "billing_postcode")
	private WebElement pincode;

	@FindBy(id = "billing_phone")
	private WebElement phoneno;

	@FindBy(id = "billing_email")
	private WebElement emailid;

	@FindBy(id = "order_comments")
	private WebElement ordernotes;

	public WebElement getCouponlink() {
		return couponlink;
	}

	public WebElement getCoupontextfield() {
		return coupontextfield;
	}

	public WebElement getApplycoupon() {
		return applycoupon;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getOrdernotes() {
		return ordernotes;
	}






}
