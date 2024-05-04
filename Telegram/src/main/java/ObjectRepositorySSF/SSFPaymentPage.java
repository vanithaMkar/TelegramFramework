package ObjectRepositorySSF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSFPaymentPage {
	public SSFPaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "select-language")
	private WebElement languagechoose;
	
	@FindBy(id = "coupenCode")
	private WebElement codefield;
	
	@FindBy(linkText = "Apply")
	private WebElement apply;
	
	@FindBy(linkText = "Make Payment")
	private WebElement makepay;
	
	@FindBy(linkText = "Cancel")
	private WebElement cancelpay;
	
	@FindBy(name = "differentShippingAddress")
	private WebElement shipaddress;
	
	@FindBy(id = "orderShipName")
	private WebElement nameshipping;
	
	@FindBy(id = "orderShipAddress")
	private WebElement addressshipping;
	
	@FindBy(id = "orderShipZip")
	private WebElement pincodeshipping;
	
	@FindBy(id = "orderShipState")
	private WebElement stateshipping;
	
	@FindBy(id = "orderShipTel")
	private WebElement phnoshipping;
	
	@FindBy(id = "orderShipCity")
	private WebElement cityshipping;
	
	@FindBy(id = "orderShipCountry")
	private WebElement countryshipping;
	
	@FindBy(linkText = "Cancel Transaction")
	private WebElement canceltansaction;
	
	@FindBy(linkText = "Continue Payment")
	private WebElement continuepay;
	
	@FindBy(id = "reasonRadio2")
	private WebElement secondthoughts;

	public WebElement getLanguagechoose() {
		return languagechoose;
	}

	public WebElement getCodefield() {
		return codefield;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getMakepay() {
		return makepay;
	}

	public WebElement getCancelpay() {
		return cancelpay;
	}

	public WebElement getShipaddress() {
		return shipaddress;
	}

	public WebElement getNameshipping() {
		return nameshipping;
	}

	public WebElement getAddressshipping() {
		return addressshipping;
	}

	public WebElement getPincodeshipping() {
		return pincodeshipping;
	}

	public WebElement getStateshipping() {
		return stateshipping;
	}

	public WebElement getPhnoshipping() {
		return phnoshipping;
	}

	public WebElement getCityshipping() {
		return cityshipping;
	}

	public WebElement getCountryshipping() {
		return countryshipping;
	}

	public WebElement getCanceltansaction() {
		return canceltansaction;
	}

	public WebElement getContinuepay() {
		return continuepay;
	}

	public WebElement getSecondthoughts() {
		return secondthoughts;
	}
	
	

}
