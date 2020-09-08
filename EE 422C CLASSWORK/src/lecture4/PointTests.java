package lecture4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PointTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assert(true);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testGetDistanceFromOrigin() {
		Point p = new Point(3, 4);
		assert(p.distanceFromOrigin() == 5.0);
	}
	
	@Test
	public void testGetDistanceFromOrigin2() {
		Point p = new Point(1, 1);
		assertEquals(1.414, p.distanceFromOrigin(), 0.001);
	}


}
