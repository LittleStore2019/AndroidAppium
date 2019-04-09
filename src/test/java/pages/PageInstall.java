package pages;

import org.openqa.selenium.WebElement;
import common.Helper;

public class PageInstall {
	private Helper helper;
	
	public PageInstall(Helper helper){
		this.helper = helper;
	}
	
	public WebElement getInstallCancelButton(){
		return helper.findById("com.miui.packageinstaller:id/cancel_button");
	}
	
	public WebElement getInstallConfirmButton(){
		return helper.findById("com.miui.packageinstaller:id/ok_button");
	}
	
	public WebElement getInstallQuestion(){
		return helper.findById("com.miui.packageinstaller:id/install_confirm_question");
	}
	
	public WebElement getInstallVersion(){
		return helper.findById("com.miui.packageinstaller:id/caller_app_version");
	}
	
	public WebElement getDoneButton(){
		return helper.findById("done_button");
	}
	
	public WebElement getLaunchButton(){
		return helper.findById("com.miui.packageinstaller:id/launch_button");
	}
	
	public void clickLaunchButton(){
		helper.click(getLaunchButton());
	}
	
	public void clickInstallCancelButton(){
		helper.click(getInstallCancelButton());
	}
	
	public void clickInstallConfirmButton(){
		helper.click(getInstallConfirmButton());
	}

	
}
