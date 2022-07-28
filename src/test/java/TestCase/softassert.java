package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {

	
		@Test
		public	void	method1()
		{
			SoftAssert	s	=	new	SoftAssert();
			System.out.println("Method	2	started");
			Assert.assertEquals(false,	false);
			System.out.println("Method	2");
			Assert.assertEquals(false,	true);
			Assert.assertEquals(400,	201);
			System.out.println("Method	2	ended");
			s.assertAll();


	}

}
