package scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.AddtoCart;
import pompages.SkillraryDemologin;
import pompages.SkillraryloginPage;

public class Testcase1 extends BaseClass  {

	
	@Test
	public void tc1() {
		SkillraryloginPage s1=new SkillraryloginPage(driver);
		s1.gersbutton();
		s1.skillrarydemoapp();
		
		driverutilies.switchtabs(driver);
		
		SkillraryDemologin sd=new SkillraryDemologin(driver);
		driverutilies.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		AddtoCart ad= new AddtoCart(driver);
		driverutilies.doubleclick(driver, ad.getPlus());
		ad.cartbutton();
		driverutilies.alterpopup(driver);
	}
}
