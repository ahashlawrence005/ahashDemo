package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"URL"})
	@Test
	public void webLoginHomeLoan(String uname)
	{
		//selenium
		System.out.println("webLoginHome");
		System.out.println(uname);
	}
	public void webLoginHomeLoans(String uname)
	{
		//selenium
		System.out.println("webLoginHomes");
		System.out.println(uname);
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public void loginAPICarloan()
	{
		//REST API automation
		System.out.println("APILoginHome");
	}
}
