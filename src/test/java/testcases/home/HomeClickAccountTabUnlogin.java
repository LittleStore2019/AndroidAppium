package testcases.home;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.BasicTestCase;

public class HomeClickAccountTabUnlogin extends BasicTestCase {

	@Test
	public void homeClickAccountTabUnLogin(){
		pageHelper.getPageHome().clickAccountButton();
		Assert.assertTrue(pageHelper.getPageLoginAndRegister().getLoginAndRegisterText().isDisplayed());
	}
	
}
