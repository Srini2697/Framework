package scripting;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.SkillraryDemologin;
import pompages.SkillraryloginPage;
import pompages.TestingPage;

public class TestCase2 extends BaseClass{

	@Test
	public void tc2() throws IOException, InterruptedException {
		SkillraryloginPage s1=new SkillraryloginPage(driver);
		s1.gersbutton();
		s1.skillrarydemoapp();
		
		driverutilies.switchtabs(driver);
		
		SkillraryDemologin sd=new SkillraryDemologin(driver);
		driverutilies.dropdown(sd.getCoursedd(), pdata.getdata("dropdownopn"));
		
		TestingPage tp= new TestingPage(driver);
		driverutilies.draganddrop(driver, tp.getSeleniumtraining(),tp.getCart());
		
		
		Point loc =tp.getTwitter().getLocation();
		int x= loc.getX();
		int y= loc.getY();
		driverutilies.scrollbar(driver, x, y);
		
		tp.twitterlog();
	}
}
