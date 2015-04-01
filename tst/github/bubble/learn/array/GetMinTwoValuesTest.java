package github.bubble.learn.array;

import static org.junit.Assert.*;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import github.bubble.learn.array.GetMinTwoValues;

public class GetMinTwoValuesTest {

	GetMinTwoValues getMinTwoValues;
	@Before
	public void setUp() throws Exception {
		getMinTwoValues=new GetMinTwoValues();
	}

	
	@Test
	public void testNullArray() {
		int[] array = null;
		int[] resultArray= getMinTwoValues.GetMinTwoValuesToCompare(array);
		assertNull(resultArray);
		resultArray=getMinTwoValues.GetMinTwoValuesBySort(array);
		assertNull(resultArray);
	}
	@Test
	public void testSingleValueArray() {
		int[] array = new int[]{5};
		int[] resultArray= getMinTwoValues.GetMinTwoValuesToCompare(array);
		assertEquals(5, resultArray[0]);
		resultArray= getMinTwoValues.GetMinTwoValuesBySort(array);
		assertEquals(5, resultArray[0]);
	}
	
	@Test
	public void testTwoValues() {
		int[] array = new int[] { 9,4 };
		int[] resultArray= getMinTwoValues.GetMinTwoValuesToCompare(array);
		assertEquals(9, resultArray[0]);
		assertEquals(4, resultArray[1]);
		
		resultArray= getMinTwoValues.GetMinTwoValuesBySort(array);
		assertEquals(9, resultArray[0]);
		assertEquals(4, resultArray[1]);
	}
	@Test
	public void testShreeValuesArrayOfTwoMinVauesIsSame() {
		int[] array = new int[] { 9,4,4 };
		int[] resultArray= getMinTwoValues.GetMinTwoValuesToCompare(array);
		assertEquals(4, resultArray[0]);
		assertEquals(4, resultArray[1]);
		
		resultArray= getMinTwoValues.GetMinTwoValuesBySort(array);
		assertEquals(4, resultArray[0]);
		assertEquals(4, resultArray[1]);
	}
	@Test
	public void testShreeValuesArrayOfOneMinVauesIsNotSame() {
		int[] array = new int[] { 4,1,4 };
		int[] resultArray= getMinTwoValues.GetMinTwoValuesToCompare(array);
		assertEquals(1, resultArray[0]);
		assertEquals(4, resultArray[1]);
		
		resultArray= getMinTwoValues.GetMinTwoValuesBySort(array);
		assertEquals(1, resultArray[0]);
		assertEquals(4, resultArray[1]);
	}
	
	@Test
	public void testMoreValues() {
		int[] array = new int[] { 1,3,5,3,9,4 };
		int[] resultArray= getMinTwoValues.GetMinTwoValuesToCompare(array);
		assertEquals(1, resultArray[0]);
		assertEquals(3, resultArray[1]);
		
		resultArray= getMinTwoValues.GetMinTwoValuesBySort(array);
		assertEquals(1, resultArray[0]);
		assertEquals(3, resultArray[1]);
	}
	
	
	
}
