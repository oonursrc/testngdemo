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

public class SeleniumBase {
	public WebDriver driver = null;

	@Test
	public void Login() throws FileNotFoundException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\z003srtv\\eclipse-workspace\\Intro_TestNG\\src\\test\\datadriven.properties");

		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("*BeforeSuite\n");
		System.out.println("Username is : " + prop.getProperty("username"));
		System.out.println("Password is : " + prop.getProperty("password"));
		System.out.println("URL is : " + prop.getProperty("url"));

		if (prop.getProperty("browser").contains("chrome")) {
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").contains("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new InternetExplorerDriver();
		}

		driver.get(prop.getProperty("url"));

	}
}
