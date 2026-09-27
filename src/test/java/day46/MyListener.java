package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{


	public void onStart(ITestContext context) {
		
		System.out.println("Test execution is started....");         //will execute only once before starting of the all the test.
	}



	public void onTestStart(ITestResult result) {
		System.out.println("test started....");        //will execute before starting of every test method 
	}


	public void onTestSuccess(ITestResult result) {    //will execute when any test method got passed
		System.out.println("test passed..");  
	}


	public void onTestFailure(ITestResult result) {     //will execute when any test method got failed
		System.out.println("test failed....");  
	}


	public void onTestSkipped(ITestResult result) {        //will execute when any test method got skipped
		System.out.println("test skipped...");  
	}

	public void onFinish(ITestContext context) {            //will execute when finish all the tests
		System.out.println("test execution is completed....");  
	}


}
