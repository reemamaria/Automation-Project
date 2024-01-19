package testpkg;

import org.testng.annotations.Test;

import basepkg.baseurl;
import pagepkg.tirapage;

public class tiratest extends baseurl {
	
	@Test
	public void performtest()
	{
		tirapage pg=new tirapage(driver);
		
		pg.addtocart();
		pg.windowHandle();
		pg.searchitem();
		
		pg.scrollPage();
		
	}

}
