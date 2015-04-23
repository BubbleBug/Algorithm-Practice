package github.bubble.learn.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {
    RemoveElement removeElement;
    @Before
    public void setUp() throws Exception {
        removeElement=new RemoveElement();
    }

    @Test
    public void testRemoveElementOfNullArray() throws Exception {
        int[] A={};
        assertEquals(0,removeElement.removeElement(A,0));
    }

    @Test
    public void testRemoveElementOfOneElementArray1() throws Exception {
        int[] A={0};
        assertEquals(0,removeElement.removeElement(A,0));
    }

    @Test
    public void testRemoveElementOfOneElementArray2() throws Exception {
        int[] A={0};
        assertEquals(1,removeElement.removeElement(A,1));
    }

    @Test
    public void testRemoveElement() throws Exception {
        int[] A={0,6,9,3,2,7,0,4};
        assertEquals(6,removeElement.removeElement(A,0));
    }
}