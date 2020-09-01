package lecture2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class MergeTests {
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void mergeTest() {
		int [] a1 = {1, 3, 5};
		int [] a2 = {4, 2, 1};
		int [] merged = {1, 3, 5, 4, 2, 1};
		assertArrayEquals(merged, MergeMethods.merge(a1, a2)); //don't have more than one assert in one test case
	}
	
	@Test
	public void merge3Test() {
		int [] a1 = {1, 3, 5};
		int [] a2 = {4, 2, 1};
		int [] a3 = {9};
		int [] merged = {1, 3, 5, 4, 2, 1, 9};
		assertArrayEquals(merged, MergeMethods.merge3(a1, a2, a3));
		}
	
	
}