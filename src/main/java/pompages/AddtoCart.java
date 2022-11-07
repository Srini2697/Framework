package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {

	@FindBy(id="add")
	private WebElement plus;
	
	@FindBy(xpath="//button[@ondblclick=\"addtocart()\"]")
	private WebElement addtocartbtn;

	public AddtoCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlus() {
		return plus;
	}

	public void cartbutton() {
		addtocartbtn.click();
	}
}
