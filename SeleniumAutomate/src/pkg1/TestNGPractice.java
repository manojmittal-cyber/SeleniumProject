package pkg1;

import org.testng.annotations.*;

public class TestNGPractice 
{
	@Test(priority=1)
	public void abc()
	{
		System.out.println("Test2 Method");
	}
	//@Test(priority=0)
	@Test(dependsOnMethods = {"abc","abcde"})
	public void abcd()
	{
		System.out.println("Test1 Method");
	}
	@Test(priority=0)
	public void abcde()
	{
		System.out.println("Test3 Method");
	}
	@BeforeSuite	
	public void abc1()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void abc2()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void abc3()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void abc4()
	{
		System.out.println("Before Method");
	}
	@AfterSuite	
	public void abc5()
	{
		System.out.println("After Suite");
	}
	@AfterTest
	public void abc6()
	{
		System.out.println("After Test");
	}
	@AfterClass
	public void abc7()
	{
		System.out.println("After Class");
	}
	@AfterMethod
	public void abc8()
	{
		System.out.println("After Method");
	}
}