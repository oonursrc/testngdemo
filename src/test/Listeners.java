package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {

	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Start Success _ Listener onTestStart");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success _ Listener onTestSuccess");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
	}
	
}
