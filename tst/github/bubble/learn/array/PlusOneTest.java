package github.bubble.learn.array;

import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class PlusOneTest {
    PlusOne plusOne;
    @Before
    public void setUp() throws Exception {
        plusOne=new PlusOne();

    }

    @Test
    public void testPlusOneOfNullArray() throws Exception {
        int[] result=plusOne.plusOne(new int[]{});
        assertEquals(1,result.length);
        assertEquals(1,result[0]);
    }

    @Test
    public void testPlusOneOfOneElementArray() throws Exception {
        int[] result1=plusOne.plusOne(new int[]{2});
        int[] result2=plusOne.plusOne(new int[]{9});
        assertEquals(1,result1.length);
        assertEquals(3,result1[0]);
        assertEquals(2,result2.length);
        assertEquals(1,result2[0]);
        assertEquals(0,result2[1]);

    }
    @Test
    public void testPlusOneOfTwoElementArray() throws Exception {
        int[] result1=plusOne.plusOne(new int[]{2,3});
        int[] result2=plusOne.plusOne(new int[]{9,9});
        assertEquals(2,result1.length);
        assertEquals(2,result1[0]);
        assertEquals(4,result1[1]);
        assertEquals(3,result2.length);
        assertEquals(1,result2[0]);
        assertEquals(0,result2[1]);
        assertEquals(0,result2[2]);
    }
}