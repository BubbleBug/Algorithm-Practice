package github.bubble.learn.array;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.bubble.learn.array.MobileArrayList;

public class MobileArrayListTest {

	MobileArrayList mobileArray;

	@Before
	public void setUp() throws Exception {
		mobileArray = new MobileArrayList();
	}

	@Test
	public void testMobileArrayList1_1() {
		int[] array = new int[] { 1 };
		int[] array_result = mobileArray.MobileArrayList(array, 0);
		assertEquals(1, array_result[0]);

		array_result = mobileArray.OptimizeMobileArray(array, 0);
		assertEquals(1, array_result[0]);

	}

	@Test
	public void testMobileArrayList1_2() {
		int[] array = new int[] { 1 };
		int[] array_result = mobileArray.MobileArrayList(array, 1);
		assertEquals(1, array_result[0]);

		array_result = mobileArray.OptimizeMobileArray(array, 1);
		assertEquals(1, array_result[0]);
	}

	@Test
	public void testMobileArrayList2_1() {
		int[] array = new int[] { 1, 2 };
		int[] array_result = mobileArray.MobileArrayList(array, 1);
		assertEquals(2, array_result[0]);
		assertEquals(1, array_result[1]);

		array_result = mobileArray.OptimizeMobileArray(array, 1);
		assertEquals(2, array_result[0]);
		assertEquals(1, array_result[1]);
	}

	@Test
	public void testMobileArrayList2_2() {
		int[] array = new int[] { 1, 2 };
		int[] array_result = mobileArray.MobileArrayList(array, 2);
		assertEquals(1, array_result[0]);
		assertEquals(2, array_result[1]);

		array_result = mobileArray.OptimizeMobileArray(array, 2);
		assertEquals(1, array_result[0]);
		assertEquals(2, array_result[1]);
	}

	@Test
	public void testMobileArrayList2_3() {
		int[] array = new int[] { 1, 2 };
		int[] array_result = mobileArray.MobileArrayList(array, -1);
		assertEquals(2, array_result[0]);
		assertEquals(1, array_result[1]);
		
		array_result = mobileArray.OptimizeMobileArray(array, -1);
		assertEquals(2, array_result[0]);
		assertEquals(1, array_result[1]);
	}

	@Test
	public void testMobileArrayList3_1() {
		int[] array = new int[] { 1, 2, 3 };
		int[] array_result = mobileArray.MobileArrayList(array, 1);
		assertEquals(3, array_result[0]);
		assertEquals(1, array_result[1]);
		assertEquals(2, array_result[2]);
		
		array_result = mobileArray.OptimizeMobileArray(array, 1);
		assertEquals(3, array_result[0]);
		assertEquals(1, array_result[1]);
		assertEquals(2, array_result[2]);
	}

	@Test
	public void testMobileArrayList3_2() {
		int[] array = new int[] { 1, 2, 3 };
		int[] array_result = mobileArray.MobileArrayList(array, 2);
		assertEquals(2, array_result[0]);
		assertEquals(3, array_result[1]);
		assertEquals(1, array_result[2]);
		
		array_result = mobileArray.OptimizeMobileArray(array, 2);
		assertEquals(2, array_result[0]);
		assertEquals(3, array_result[1]);
		assertEquals(1, array_result[2]);
	}

	@Test
	public void testMobileArrayList3_3() {
		int[] array = new int[] { 1, 2, 3 };
		int[] array_result = mobileArray.MobileArrayList(array, -2);
		assertEquals(3, array_result[0]);
		assertEquals(1, array_result[1]);
		assertEquals(2, array_result[2]);
		
		array_result = mobileArray.OptimizeMobileArray(array, -2);
		assertEquals(3, array_result[0]);
		assertEquals(1, array_result[1]);
		assertEquals(2, array_result[2]);
	}

	@Test
	public void testMobileArrayList3_4() {
		int[] array = new int[] { 1, 2, 3 };
		int[] array_result = mobileArray.MobileArrayList(array, 8);
		assertEquals(2, array_result[0]);
		assertEquals(3, array_result[1]);
		assertEquals(1, array_result[2]);
		
		array_result = mobileArray.OptimizeMobileArray(array, 8);
		assertEquals(2, array_result[0]);
		assertEquals(3, array_result[1]);
		assertEquals(1, array_result[2]);
	}

	@Test
	public void testMobileArrayList4_1() {
		int[] array = new int[] { 1, 2, 3, 4 };
		int[] array_result = mobileArray.MobileArrayList(array, 5);
		assertEquals(4, array_result[0]);
		assertEquals(1, array_result[1]);
		assertEquals(2, array_result[2]);
		assertEquals(3, array_result[3]);
		
		array_result = mobileArray.OptimizeMobileArray(array, 5);
		assertEquals(4, array_result[0]);
		assertEquals(1, array_result[1]);
		assertEquals(2, array_result[2]);
		assertEquals(3, array_result[3]);
	}

	@Test
	public void testMobileArrayList5_1() {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int[] array_result = mobileArray.MobileArrayList(array, 2);
		assertEquals(4, array_result[0]);
		assertEquals(5, array_result[1]);
		assertEquals(1, array_result[2]);
		assertEquals(2, array_result[3]);
		assertEquals(3, array_result[4]);
		
		array_result = mobileArray.OptimizeMobileArray(array, 2);
		assertEquals(4, array_result[0]);
		assertEquals(5, array_result[1]);
		assertEquals(1, array_result[2]);
		assertEquals(2, array_result[3]);
		assertEquals(3, array_result[4]);
	}

	@Test
	public void testMobileArrayList5_2() {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int[] array_result = mobileArray.MobileArrayList(array, -3);
		assertEquals(4, array_result[0]);
		assertEquals(5, array_result[1]);
		assertEquals(1, array_result[2]);
		assertEquals(2, array_result[3]);
		assertEquals(3, array_result[4]);
		
		array_result = mobileArray.OptimizeMobileArray(array, -3);
		assertEquals(4, array_result[0]);
		assertEquals(5, array_result[1]);
		assertEquals(1, array_result[2]);
		assertEquals(2, array_result[3]);
		assertEquals(3, array_result[4]);
	}

	@Test
	public void testMobileArrayList5_3() {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int[] array_result = mobileArray.MobileArrayList(array, 19);
		assertEquals(2, array_result[0]);
		assertEquals(3, array_result[1]);
		assertEquals(4, array_result[2]);
		assertEquals(5, array_result[3]);
		assertEquals(1, array_result[4]);
		
		array_result = mobileArray.OptimizeMobileArray(array, 19);
		assertEquals(2, array_result[0]);
		assertEquals(3, array_result[1]);
		assertEquals(4, array_result[2]);
		assertEquals(5, array_result[3]);
		assertEquals(1, array_result[4]);
	}

	@Test
	public void testMobileArrayList6_1() {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] array_result = mobileArray.MobileArrayList(array, 4);
		assertEquals(3, array_result[0]);
		assertEquals(4, array_result[1]);
		assertEquals(5, array_result[2]);
		assertEquals(6, array_result[3]);
		assertEquals(1, array_result[4]);
		assertEquals(2, array_result[5]);
		
		array_result = mobileArray.OptimizeMobileArray(array, 4);
		assertEquals(3, array_result[0]);
		assertEquals(4, array_result[1]);
		assertEquals(5, array_result[2]);
		assertEquals(6, array_result[3]);
		assertEquals(1, array_result[4]);
		assertEquals(2, array_result[5]);
	}

	@Test
	public void testMobileArrayList6_2() {
		int[] array = new int[] { 4, 5, 6, 1, 2, 3 };
		int[] array_result = mobileArray.MobileArrayList(array, 3);
		for (int i = 0; i < array_result.length; i++)
			assertEquals(i + 1, array_result[i]);
		
		array_result = mobileArray.OptimizeMobileArray(array, 3);
		for (int i = 0; i < array_result.length; i++)
			assertEquals(i + 1, array_result[i]);
	}

	@Test
	public void testMobileArrayList6_3() {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] array_result = mobileArray.MobileArrayList(array, -4);
		assertEquals(5, array_result[0]);
		assertEquals(6, array_result[1]);
		assertEquals(1, array_result[2]);
		assertEquals(2, array_result[3]);
		assertEquals(3, array_result[4]);
		assertEquals(4, array_result[5]);
		
		array_result = mobileArray.OptimizeMobileArray(array, -4);
		assertEquals(5, array_result[0]);
		assertEquals(6, array_result[1]);
		assertEquals(1, array_result[2]);
		assertEquals(2, array_result[3]);
		assertEquals(3, array_result[4]);
		assertEquals(4, array_result[5]);
	}

	@Test
	public void testMobileArrayList6_4() {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] array_result = mobileArray.MobileArrayList(array, 8);
		assertEquals(5, array_result[0]);
		assertEquals(6, array_result[1]);
		assertEquals(1, array_result[2]);
		assertEquals(2, array_result[3]);
		assertEquals(3, array_result[4]);
		assertEquals(4, array_result[5]);
		
		array_result = mobileArray.OptimizeMobileArray(array, 8);
		assertEquals(5, array_result[0]);
		assertEquals(6, array_result[1]);
		assertEquals(1, array_result[2]);
		assertEquals(2, array_result[3]);
		assertEquals(3, array_result[4]);
		assertEquals(4, array_result[5]);
	}

}
