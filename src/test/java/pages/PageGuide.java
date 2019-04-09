package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageGuide {
	private Helper helper;
	
	public PageGuide(Helper helper){
		this.helper = helper;
	}
	
	public WebElement getPageGuide(){
		return helper.findByClassName("android.widget.ImageView", 0);
	}
	
	public WebElement getExperienceNowButton(){
		return helper.findById("com.ririjin.licai:id/boot_tv");
	}
	
	public void clickExperienceNowButton(){
		helper.click(getExperienceNowButton());
	}
	
}
