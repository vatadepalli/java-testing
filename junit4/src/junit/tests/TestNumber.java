package junit.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.core.Num;

public class TestNumber {
	private Num n;

	@Before
	public void setUp() throws Exception {
		n = new Num();
		System.out.println("in setUp func");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("in tearDown func");
	}

	@Test
	public void testCheckNumberBoundry() {
		n.storeNumber(101);
		assertEquals(100, n.getNumber());
	}

	@Test
	public void testNegativeNumber() {
		n.storeNumber(-98);
		assertEquals(0, n.getNumber());
	}

}
