package test;

import org.testng.annotations.Test;

public class Day4 {

	@Test(groups= {"Smoke"})
	public void WebLogin() {

		System.out.println("WebLogin Selenium Day4_Order1");

	}

	@Test(dependsOnMethods = {"WebLogin"})
	public void MobileLogin() {

		System.out.println("MobileLogin Appium Day4_Order2");

	}

	@Test(dependsOnMethods = {"WebLogin","MobileLogin"})
	public void APILogin() {

		System.out.println("APILogin RestApi Day4_Order3");

	}

}
