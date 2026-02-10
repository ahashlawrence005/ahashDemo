package test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I Will be executed last");
	}
	
    @Test
	public void Demo() {
		// TODO Auto-generated method stub
     System.out.println("Hello World");
     System.out.println("Hello World2");
     System.out.println("Hello World3");
     //
     System.out.println("Hello World4");
     System.out.println("Hello World5");
     System.out.println("Hello World6");
     System.out.println("Hello World7");
     
     Assert.assertTrue(false);
	}
    
    @AfterSuite
    public void afSuite()
    {
     System.out.println("I am last no 1");
    }
    
    @Test
    public void SecondTest()
    {
    	System.out.println("Bye");
    }
    
    

    

}
