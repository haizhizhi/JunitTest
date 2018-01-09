package own.junit.testJunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
public class Test01 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("aaa");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("bbb");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("111");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("222");
	}

	@Test(expected=Exception.class)
	public void test() throws Exception {
//		throw new Exception("error");
	}
	@Test
	public void aa(){}

	
}
