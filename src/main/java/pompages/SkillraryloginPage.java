package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryloginPage {
    
	
	@FindBy(xpath="//a[text()=\" GEARS \"] ")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[@target=\"_blank\"])[16]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value=\"go\"]")
	private WebElement searchbtn;
	
	public SkillraryloginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gersbutton() {
		gearsbtn.click();
	}
	public void skillrarydemoapp() {
		demoapp.click();
		
	}
	public void searchtextbox(String coursename) {
		searchtb.sendKeys(coursename);
	}
	public void searchbutton() {
		searchbtn.click();
	}
	
}
