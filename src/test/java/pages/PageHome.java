package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageHome {
    private Helper helper;

    public PageHome(Helper helper){
        this.helper = helper;
    }

    public WebElement getPageHomeFrameLayout(){
        return helper.findById("content");
    }
    
    public WebElement getNewerTaskText(){
    	return helper.findByText("新手任务");
    }

    public WebElement getHomeButton(){
        return helper.findByDoubleClassName("android.widget.TabWidget","android.widget.LinearLayout",0);
    }

    public WebElement getInvestmentButton(){
        return helper.findByDoubleClassName("android.widget.TabWidget","android.widget.LinearLayout",1);
    }

    public WebElement getAccountButton(){
        return helper.findByDoubleClassName("android.widget.TabWidget","android.widget.LinearLayout",2);
    }
    
    public void clickHomeButton(){
    	helper.click(getHomeButton());
    }
    
    public void clickInvestmentButtton(){
    	helper.click(getInvestmentButton());
    }
    
    public void clickAccountButton(){
    	helper.click(getAccountButton());
    }
    
    
}
