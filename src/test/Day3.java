package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 extends SeleniumBase {
	public WebDriver driver=null;

	@BeforeSuite
	public void BeforeSuite() throws FileNotFoundException {

		System.out.println("*BeforeSuite\n");
		
		Login(); //SeleniumBase login func

		
		
	}

	@AfterSuite
	public void AfterSuite() {

		System.out.println("*AfterSuite\n");

	}

	@BeforeClass
	public void BeforeClass() {

		System.out.println("//BeforeClass\n");

	}

	@AfterClass
	public void AfterClass() {

		System.out.println("//AfterClass\n");

	}

	@BeforeMethod
	public void BeforeMethod() {

		System.out.println("---BeforeMethod");

	}

	@AfterMethod
	public void AfterMethod() {

		System.out.println("---AfterMethod");

	}

	@Test(enabled = false)
	public void ABC() {

		System.out.println("ABC");

	}

	@Test
	public void WebLogin() {

		System.out.println("WebLogin Selenium Day3");

	}

	@Test(timeOut = 4000)
	public void MobileLogin() {

		System.out.println("MobileLogin Appium Day3");

	}

	@Test
	public void APILogin() {

		System.out.println("APILogin RestApi Day3");

	}

	@Test(dataProvider = "getdata")
	public void CallData(String uname, String pass) {

		System.out.println(uname);
		System.out.println(pass);

	}

	@DataProvider
	public Object[][] getdata() {

		// 1st combination - username password- good credir history row
		// 2nd username password - no credir history
		// 3rd - fraudelent credit history

		Object[][] data = new Object[3][2];

		// 1st set
		data[0][0] = "firstusername";
		data[0][1] = "fistpassword";

		// 2nd set
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";

		// 3rd set
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";

		return data;

	}

}
