package testcases.home;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.BasicTestCase;

public class HomeClickInvestmentTab extends BasicTestCase{
	
	@Test
	public void homeClickInvestmentTab(){
		pageHelper.getPageHome().clickInvestmentButtton();
		Assert.assertTrue(pageHelper.getPageInvestment().getBorrowProjectTabText().isDisplayed());
	}
	
}
