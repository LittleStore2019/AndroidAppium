package testcases.updateDialog;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.BasicTestCase;

public class UpdateClickConfirm extends BasicTestCase {

	  @Test
	    public void testUpdateClickConfirm(){
	    	pageHelper.getPageUpdate().clickConfirmButton();
	        Assert.assertTrue(pageHelper.getPageHome().getNewerTaskText().isDisplayed());
	        pageHelper.getPageInstall().clickInstallConfirmButton();
	        Assert.assertEquals(pageHelper.getPageInstall().getInstallQuestion().getText(),"安装成功");
	        pageHelper.getPageInstall().clickLaunchButton();
	        Assert.assertTrue(pageHelper.getPageHome().getPageHomeFrameLayout().isDisplayed());
	    }
	
}
