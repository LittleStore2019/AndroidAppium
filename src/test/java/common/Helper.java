package common;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
    private AppiumDriver driver;
    private final int DEFAULT_TIMEOUT = 5;

    public Helper(AppiumDriver driver){
        this.driver = driver;
    }

    public void waitForElement(By by){
        WebDriverWait wait = new WebDriverWait(driver,DEFAULT_TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /*
     *定义常见的定义方式
     */
    public WebElement findById(String id){
        waitForElement(By.id(id));
        return (WebElement) driver.findElements(By.id(id)).get(0);
    }

    public WebElement findById(String id,int index){
        waitForElement(By.id(id));
        return (WebElement) driver.findElements(By.id(id)).get(index);
    }

    public WebElement findByClassName(String className,int index){
        waitForElement(By.className(className));
        return (WebElement) driver.findElements(By.className(className)).get(index);
    }

    public WebElement findByDoubleClassName(String classNam,String className,int index){
        return driver.findElement(By.className(classNam)).findElements(By.className(className)).get(index);
    }

    public WebElement findByXpath(String text){
        waitForElement(By.xpath(text));
        return (WebElement) driver.findElements(By.xpath(text)).get(0);
    }

    public WebElement findByText(String text){
        waitForElement(By.xpath("//*[@text='"+text+"']"));
        return (WebElement) driver.findElements(By.xpath("//*[@text='"+text+"']")).get(0);
    }

    public WebElement findByText(String text,int index){
        waitForElement(By.xpath("//*[@text='"+text+"']"));
        return (WebElement) driver.findElements(By.xpath("//*[@text='"+text+"']")).get(index);
    }

    public void click(WebElement element){
        System.out.println("执行控件点击操作！");
        element.click();
    }

    public void enter(WebElement element, String text){
        System.out.println("执行输入文本操作，输入的文本为"+text);
        element.sendKeys(text);
    }

    public void clear(WebElement element){
        System.out.println("执行输入框清空操作！");
        element.clear();
    }

    public void enterWithPreClear(WebElement element,String text){
        System.out.println("执行输入框清空操作,并输入文本，文本内容为："+text);
        clear(element);
        enter(element,text);
    }

    public String getText(WebElement element){
        System.out.println("执行获取控件操作");
        return element.getText();
    }

//    public void swipeLeftAction(AppiumDriver<WebElement> driver,int during,int num){
//        int width = driver.manage().window().getSize().width;
//        int height = driver.manage().window().getSize().height;
//        for(int i=0;i<num;i++){
//            driver.swipe(width*3/4, height/2, width/4, height/2, during);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

}

