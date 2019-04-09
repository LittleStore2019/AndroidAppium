package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageUpdate {
    private Helper helper;

    public PageUpdate(Helper helper){
        this.helper = helper;
    }

    public WebElement getFrameLayout(){
        return helper.findByClassName("android.widget.FrameLayout",0);
    }

    public WebElement getCancelButton(){
        return helper.findById("tv_cancel_button");
    }

    public WebElement getConfirmButton(){
        return helper.findById("tv_confirm_button");
    }

    public WebElement getDialogContent(){
        return helper.findById("tv_dialog_content");
    }

    public void clickCancelButton(){ 
    	helper.click(getCancelButton());
    }

    public void clickConfirmButton(){
    	helper.click(getConfirmButton());
    }

    public String getDialogContentText(){
        return helper.getText(getDialogContent());
    }
}
