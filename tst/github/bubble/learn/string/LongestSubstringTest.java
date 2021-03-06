package github.bubble.learn.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {
    LongestSubstring longestSubstring;
    @Before
    public void setUp() throws Exception {
        longestSubstring=new LongestSubstring();
    }

    @Test
    public void testLengthOfLongestSubstringOfNullString() throws Exception {
        assertEquals(0,longestSubstring.lengthOfLongestSubstring(""));
        assertEquals(0,longestSubstring.lengthOfLongestSubstringOfAnotherSolution(""));

    }

    @Test
    public void testLengthOfLongestSubstringOfOneChar() throws Exception {
        assertEquals(1,longestSubstring.lengthOfLongestSubstring("a"));
        assertEquals(1,longestSubstring.lengthOfLongestSubstringOfAnotherSolution("a"));
    }

    @Test
    public void testLengthOfLongestSubstringOfSameChar() throws Exception {
        assertEquals(1,longestSubstring.lengthOfLongestSubstring("aa"));
        assertEquals(1,longestSubstring.lengthOfLongestSubstringOfAnotherSolution("aaa"));
    }

    @Test
    public void testLengthOfLongestSubstringOfSameMoreChar() throws Exception {
        assertEquals(2,longestSubstring.lengthOfLongestSubstring("aaca"));
        assertEquals(2,longestSubstring.lengthOfLongestSubstringOfAnotherSolution("aaca"));
    }

    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        assertEquals(3,longestSubstring.lengthOfLongestSubstring("abcabcabcccdd"));
        assertEquals(3,longestSubstring.lengthOfLongestSubstringOfAnotherSolution("abcabcabcccdd"));
    }
}