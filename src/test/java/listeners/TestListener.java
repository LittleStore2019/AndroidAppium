package listeners;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import common.BasicTestCase;

public class TestListener implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		File srcFile = BasicTestCase.getDriver().getScreenshotAs(OutputType.FILE);
		String scriptName = arg0.getMethod().getRealClass().getSimpleName()+"."+arg0.getMethod().getMethodName();
		DateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String destDir = "screenshots";
		String fileName = scriptName + dataFormat.format(new Date())+".png";
		try {
			FileUtils.copyFile(srcFile,new File(destDir+"/"+fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
