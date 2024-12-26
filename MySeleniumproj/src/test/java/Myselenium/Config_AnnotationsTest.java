package Myselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class Config_AnnotationsTest {
	
	
	@BeforeSuite
	public void Beforesuite()
	{
		System.out.println("You are in the Before suite ");
	}
	
	
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("You are in the Before Test");
	}
	
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("You are in the Before Class");
	}
	
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("You are in the Before Method");
	}
	
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("You are in the After Method");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("You are in the After Class");
	}
	
	@AfterTest
	public void Aftertest()
	{
		System.out.println("You are in the After Test");
	}
	
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("You are in the After Suite");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("You are in the Test");
	}
	
	
  public void mainTest() {
	  
	  
	  Beforesuite();
	  Beforetest();
	  Beforeclass();
	  Beforemethod();
	  Test1();
	  Aftermethod();
	  Afterclass();
	  Aftertest();
	  Aftersuite();
	   
  }  

}
