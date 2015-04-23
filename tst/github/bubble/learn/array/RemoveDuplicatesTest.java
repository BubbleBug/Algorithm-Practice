package github.bubble.learn.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {
    RemoveDuplicates removeDuplicates;
    @Before
    public void setUp() throws Exception {
        removeDuplicates=new RemoveDuplicates();
    }

    @Test
    public void testRemoveDuplicatesFromSortedOfNullArray() throws Exception {
        int[] A={};
        assertEquals(0,removeDuplicates.removeDuplicatesFromSorted(A));
    }

    @Test
    public void testRemoveDuplicatesFromSortedOfNoDuplicatesArray() throws Exception {
        int[] A={1,2,5};
        assertEquals(3,removeDuplicates.removeDuplicatesFromSorted(A));
    }

    @Test
    public void testRemoveDuplicatesFromSortedOfOneDuplicates() throws Exception {
        int[] A={1,1,2,3,3,4,4,8};
        assertEquals(5,removeDuplicates.removeDuplicatesFromSorted(A));
    }

    @Test
    public void testRemoveDuplicatesFromSortedOfMoreDuplicates() throws Exception {
        int[] A={1,1,1,2,3,3,4,4,4,8,8};
        assertEquals(5,removeDuplicates.removeDuplicatesFromSorted(A));
    }
}