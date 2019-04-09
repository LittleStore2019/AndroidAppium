package testcases.updateDialog;

import org.testng.annotations.Test;
import common.BasicTestCase;
import static org.testng.Assert.assertTrue;

public class UpdateClickCancel extends BasicTestCase {
    @Test
    public void testUpdateClickCancel(){
    	pageHelper.getPageUpdate().clickCancelButton();
        assertTrue(pageHelper.getPageHome().getNewerTaskText().isDisplayed());
    }
}
               