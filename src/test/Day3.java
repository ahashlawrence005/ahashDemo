package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass 
	public void beforeclass()
	{
	 System.out.println("before executing any method in the class");
	}
	
    @Parameters({"URL","APIKey/usrname"})
	@Test
	public void webLoginCarLoan(String urlname,String key)
	{
		//selenium
		System.out.println("webLoginCar");
		System.out.println(urlname);
		System.out.println(key);
	}
    @Test
	public void webLoginCarLoans(String urlname,String key)
	{
		//selenium
		System.out.println("webLoginCars");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeMethod 
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day3 class");
	}
	@AfterMethod 
	public void afterevery()
	{
		System.out.println("I will execute after every test method in day3 class");
	}
	@Test(groups= {"Smoke"})
	public void mobileLoginCarLoan()
	{
		//Appium
		System.out.println("MobileLoginCar");
	}
	
	@Test(enabled=false)
	public void mobileSignInCarLoan()
	{
		//Appium
		System.out.println("MobileSigninCar");
	}
	
	@BeforeSuite 
	public void bfSuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(dataProvider="getData")
	public void mobileLogOutCarLoan(String username,String password)
	{
		//Appium
		System.out.println("MobileLogOutCar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"webLoginCarLoan","mobileLogOutCarLoan"})
	public void APIloginCarloan()
	{
		//REST API automation
		System.out.println("APILoginCar");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="password";
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		return data;
	}
}
