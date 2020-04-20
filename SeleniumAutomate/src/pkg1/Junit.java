//Junit is used for unit testing where no main method exists

package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Junit 
{
	@Test
	public void tc()
	{
		System.out.println("Test Annotation");
	}

	@Before
	public void BB()
	{
		System.out.println("Before Automation");
	}
	
	@After
	
	public void aft()
	{
		System.out.println("After Automation");
	}
	
	@Ignore
	@Test
	public void dddd()
	{
		System.out.println("Second test case");
	}
}