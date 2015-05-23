package github.bubble.learn.sort;

import org.junit.Before;

import static org.junit.Assert.*;

public class ShellTest {

    @org.junit.Test
    public void testSort() throws Exception {
        int[] result=new int[]{1,2,4,4,6};
        int[] test=new int[]{4,6,2,4,1};
        Shell.sort(test);
        for (int i=0;i<result.length;i++){
            assertEquals(result[i],test[i]);
        }
    }
}