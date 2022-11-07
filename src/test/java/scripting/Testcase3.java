package scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.Corejavapage;
import pompages.SkillraryloginPage;
import pompages.WishlistPage;

public class Testcase3 extends BaseClass{

	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryloginPage s1=new SkillraryloginPage(driver);
		s1.searchtextbox(pdata.getdata("coursename"));
		s1.searchbutton();
		
		Corejavapage cp=new Corejavapage(driver);
		cp.java();
		
		WishlistPage wp=new WishlistPage(driver);
		wp.alertclose();
		driverutilies.switchFrame(driver);
		wp.playbutton();
		Thread.sleep(10000);
		wp.pausebutton();
		driverutilies.switchbackframe(driver);
		wp.wishlistbutton();
		
		
	}
}
