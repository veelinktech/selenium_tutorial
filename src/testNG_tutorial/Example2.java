package testNG_tutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example2 
{
    @BeforeSuite
	public void m1()
	{
		System.out.println("BeforeSuite");
	}
	
    @Test
	public void m2()
	{
		System.out.println("Testcase1");
	}
	
    @BeforeClass
	public void m3()
	{
		System.out.println("BeforeClass");
	}
	
    @AfterMethod
	public void m4()
	{
		System.out.println("AfterMethod");
	}
	
    @BeforeTest
	public void m5()
	{
		System.out.println("BeforeTest");
	}
	
    @AfterTest
	public void m6()
	{
		System.out.println("AfterTest");
	}
	
    @AfterSuite
	public void m7()
	{
		System.out.println("AfterSuite");
	}
	
    @AfterClass
	public void m8()
	{
		System.out.println("AfterClass");
	}
	
    @BeforeMethod
	public void m9()
	{
		System.out.println("BeforeMethod");
	}
	
    @Test
	public void m10()
	{
		System.out.println("Testcases2");
	}
	
	
}
