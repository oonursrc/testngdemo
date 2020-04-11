package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public static void Demo() {
		
		System.out.println("helloDay2");

	}
	
	@Test(groups= {"Smoke"})
	public static void Demo2() {
		
		System.out.println("Demo2 Day2");

	}
	
	@Parameters({"URL"})
	@Test
	public static void Demo3(String urlname) {
		
		System.out.println("helloDay3 "+ urlname);

	}
	
	
	@BeforeTest
	public static void Before() {
		
		System.out.println("**BeforeTest");

	}
	
	@AfterTest
	public static void After() {
		
		System.out.println("**AfterTest");

	}

}
