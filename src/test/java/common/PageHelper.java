package common;

import pages.*;


public class PageHelper {
    private Helper helper;
    private PageUpdate pageUpdate;
    private PageHome pageHome;
    private PageInstall pageInstall;
    private PageGuide pageGuide;
    private PageInvestment pageInvestment;
    private PageLoginAndRegister pageLoginAndRegister;

    public PageHelper(Helper helper){
        this.helper = helper;
    }
    
    public PageGuide getPageGuide(){
    	if(pageGuide == null){
    		pageGuide = new PageGuide(helper);
    	}
    	return pageGuide;
    }

    public PageUpdate getPageUpdate(){
        if(pageUpdate == null){
            pageUpdate = new PageUpdate(helper);
        }
        return pageUpdate;
    }

    public PageHome getPageHome(){
        if(pageHome == null){
            pageHome = new PageHome(helper);
        }
        return pageHome;
    }
    
    public PageInstall getPageInstall(){
    	if(pageInstall == null){
    		pageInstall = new PageInstall(helper);
    	}
    	return pageInstall;
    }
    
    public PageInvestment getPageInvestment(){
    	if(pageInvestment == null){
    		pageInvestment = new PageInvestment(helper);
    	}
    	return pageInvestment;
    }
    
    public PageLoginAndRegister getPageLoginAndRegister(){
    	if(pageLoginAndRegister == null){
    		pageLoginAndRegister = new PageLoginAndRegister(helper);
    	}
    	return pageLoginAndRegister;
    }
}
