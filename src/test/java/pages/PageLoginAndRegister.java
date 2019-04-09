package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageLoginAndRegister {
	private Helper helper;
	
	public PageLoginAndRegister(Helper helper){
		this.helper = helper;
	}
	
	public WebElement getReturnButton(){
		return helper.findByClassName("android.widget.ImageButton", 0);
	}
	
	public void clickReturnHomeButton(){
		helper.click(getReturnButton());
	}
	
	public WebElement getLoginAndRegisterText(){
		return helper.findByText("登录/注册1");
	}
	
	public String getLoginInputText(){
		return helper.findById("com.ririjin.licai:id/et_login_phone").getText();
	}
	
	public WebElement getLoginInput(){
		return helper.findById("com.ririjin.licai:id/et_login_phone");
	}
	
	public void clearAndEnterCellphone(String text){
		helper.clear(getLoginInput());
		helper.enter(getLoginInput(), text);
	}
	
	public WebElement getCaptchaButton(){
		return helper.findById("com.ririjin.licai:id/send_message");
	}
	
	public void clickCaptchaButton(){
		helper.click(getCaptchaButton());
	}
	
	public WebElement getCheckBox(){
		return helper.findById("com.ririjin.licai:id/cb_login_isagree");
	}
	
}
