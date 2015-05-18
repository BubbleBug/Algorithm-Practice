package github.bubble.learn.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {
    MergeSortedArray mergeSortedArray;
    @Before
    public void setUp() throws Exception {
        mergeSortedArray=new MergeSortedArray();
    }

    @Test
    public void testMerge() throws Exception {
        int[] nums1=new int[5];
        int[] nums2=new int[5];
        nums1[0]=2;
        nums1[1]=4;
        nums2[0]=1;
        nums2[1]=3;
        nums2[2]=5;
        mergeSortedArray.merge(nums1,2,nums2,3);
        //mergeSortedArray.merge2(nums1,2,nums2,3);
    }
}