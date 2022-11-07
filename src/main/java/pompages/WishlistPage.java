package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {

	
	@FindBy(xpath="//a[@class=\"close_cookies\"]")
	private WebElement alertcls;
	
	@FindBy(xpath="//button[@aria-label=\"Play\"]")
	private WebElement playbtn;
	
	@FindBy (xpath="//button[@aria-label=\"Pause\"]")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlistbtn;
	

	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void alertclose() {
		alertcls.click();
	}
	public void playbutton() {
		playbtn.click();
	}
		
	public void pausebutton() {
		pausebtn.click();	
	}
	public void wishlistbutton() {
		wishlistbtn.click();
	}
	
}
