package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import java.io.File;
import java.net.URL;


public class BasicTestCase {
    static AppiumDriver driver;
    protected Helper helper = new Helper(driver);
    public PageHelper pageHelper;

    @BeforeMethod
    public void setUp() throws Exception {
        File app = new File(System.getProperty("user.dir"),"app/com.ririjin.licai.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.UDID,"TWUOZPIN99999999");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RedRice");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.2");
        capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10);
        capabilities.setCapability("noReset", "True");
        capabilities.setCapability("appPACKAGE","com.ririjin.licai");
        capabilities.setCapability("appACTIVITY","com.ririjin.licai.ui.activity.SplashActivity");

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        helper = new Helper(driver);
        pageHelper = new PageHelper(helper);

        pageHelper.getPageUpdate().clickCancelButton();
        Assert.assertTrue(pageHelper.getPageHome().getNewerTaskText().isDisplayed());
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.closeApp();
        driver.quit();
    }

    public static AppiumDriver getDriver(){
        return driver;
    }
}
