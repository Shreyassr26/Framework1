package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pom.LoginPage;

public class ValidLogin extends BaseTest {
	
	@Test
	public void testValidLogin() {
		
		String un = Lib.getCellValue(XL_PATH, "ValidLogin", 1, 0);
		String pw = Lib.getCellValue(XL_PATH, "ValidLogin", 1, 1);
		
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
	}

}
