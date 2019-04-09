package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageInvestment {
	private Helper helper;
	
	public PageInvestment(Helper helper){
		this.helper = helper;
	}
	
	public WebElement getBorrowProjectTabText(){
		return helper.findByText("借款标");
	}
	
	public WebElement getBorrowProjectTab(){
		return helper.findByClassName("android.support.v7.app.ActionBar$Tab", 0);
	}
	
	public WebElement getBorrowTransferTab(){
		return helper.findByClassName("android.support.v7.app.ActionBar$Tab", 1);
	}
	
	public void clickBorrowProjectTab(){
		helper.click(getBorrowProjectTab());
	}
	
	public void clickTransferProjectTab(){
		helper.click(getBorrowTransferTab());
	}
	
}
