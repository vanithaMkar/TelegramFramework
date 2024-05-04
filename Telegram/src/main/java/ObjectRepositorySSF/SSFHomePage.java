package ObjectRepositorySSF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSFHomePage {
     public SSFHomePage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     
     @FindBy(xpath = "//input[@placeholder=\"Search here...\"]")
     private WebElement searchbox;
     
     @FindBy(className = "search-button")
     private WebElement searchbutton;
     
     @FindBy(xpath = "//img[@title=\"Track Order\"]")
     private WebElement trackorderlink;
     
     @FindBy(xpath = "//img[@title=\"wishlist\"]")
     private WebElement wishlistlink;
     
     
     @FindBy(xpath = "//span[@class=\"et-svg\"]")
     private WebElement cartlink;
     
     @FindBy(id = "menu-item-9294")
     private WebElement storeslink;
     
     @FindBy(linkText = "Dashboard")
     private WebElement hometext;
     
     @FindBy(linkText = "Bedroom")
     private WebElement bedroommodule;
     
     @FindBy(xpath = "//a[.='Beds']")
     private WebElement bedslink;
     
     @FindBy(xpath = "//a[.='Dining Room']")
     private WebElement diningroommodule;
     
     @FindBy(xpath = "//h2[.='Glass Top']")
     private WebElement Glasstoplink;
     
     @FindBy(xpath = "//a[.='Piru 4 seater dining set']")
     private WebElement pirudiningsetlink;
     
     @FindBy(xpath = "//button[.='Add to cart']")
     private WebElement pirudiningsetaddtocart;
     
     public WebElement getDiningroommodule() {
		return diningroommodule;
	}

	public WebElement getGlasstoplink() {
		return Glasstoplink;
	}

	public WebElement getPirudiningsetlink() {
		return pirudiningsetlink;
	}

	public WebElement getPirudiningsetaddtocart() {
		return pirudiningsetaddtocart;
	}

	public WebElement getBedslink() {
		return bedslink;
	}

	@FindBy(xpath = "//h2[.='Single Bed']")
     private WebElement singlebedslink;
     
     @FindBy(linkText = "Optima Single Bed")
     private WebElement optimasinglebed;
     
     public WebElement getOptimasinglebed() {
		return optimasinglebed;
	}

	@FindBy(xpath = "//button[@data-product_id=\"5863\"]")
     private WebElement addtocart;
	
	@FindBy(id = "wdapziptextbox")
	private WebElement pincodefield;
	
	@FindBy(id = "wdapzipsumit")
	private WebElement pinsearchlink;

	@FindBy(xpath = "//li[@class='cat-item cat-item-120 current-cat cat-parent opened']")
	private WebElement productscroll;
	

	

	public WebElement getProductscroll() {
		return productscroll;
	}

	public WebElement getPincodefield() {
		return pincodefield;
	}

	public WebElement getPinsearchlink() {
		return pinsearchlink;
	}

	public WebElement getBedroommodule() {
		return bedroommodule;
	}

	public WebElement getSinglebedslink() {
		return singlebedslink;
	}

	

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getHometext() {
		return hometext;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getTrackorderlink() {
		return trackorderlink;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}

	public WebElement getCartlink() {
		return cartlink;
	}

	public WebElement getStoreslink() {
		return storeslink;
	}
     
}
