package github.bubble.learn.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSearchTest {
    StringSearch strs;
    @Before
    public void setUp() throws Exception {
        strs=new StringSearch();
    }

    @Test
    public void testStrStr() throws Exception {
        int r0=strs.strStr("","");
        assertEquals(r0,0);

        int r1=strs.strStr("","hujf");
        assertEquals(r1,-1);

        int r2=strs.strStr("kghyjuyv","");
        assertEquals(r2,0);

        int r3=strs.strStr(null,"hyju");
        assertEquals(r3,-1);

        int r4=strs.strStr("kygft",null);
        assertEquals(r4,-1);

        int r5=strs.strStr(null,null);
        assertEquals(r5,-1);

        int r6=strs.strStr("abcdabcdefg","fge");
        assertEquals(r6,-1);

        int r7=strs.strStr("abcdabcdefg","bcd");
        assertEquals(r7,1);

        int r8=strs.strStr("abcnabcuefg","bcd");
        assertEquals(r8,-1);
    }
}