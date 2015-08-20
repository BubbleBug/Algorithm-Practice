package github.bubble.learn.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompareStringsTest {
    CompareStrings compareStrings;
    @Before
    public void setUp() throws Exception {
        compareStrings=new CompareStrings();
    }

    @Test
    public void testCompareStrings() throws Exception {
        boolean t1 = compareStrings.compareStrings("ABCD","BCDWS");
        assertFalse(t1);

        boolean t2 = compareStrings.compareStrings("ABCD","ACD");
        assertTrue(t2);

        boolean t3 = compareStrings.compareStrings("ABCD","AABC");
        assertFalse(t3);

        boolean t4 = compareStrings.compareStrings("ABSDFABAB","ADB");
        assertTrue(t4);


    }
}