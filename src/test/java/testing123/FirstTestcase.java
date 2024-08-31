package testing123;

import org.junit.Test;

public class FirstTestcase {

	@Test
	void setup()
	{
		System.out.println("opening browser");
		
	}
	@Test
	void login()
	{
		System.out.println("this is login test");
	}
	@Test
	void teardown()
	{
		System.out.println("closing browser");
	}
}
