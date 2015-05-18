package github.bubble.learn.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString reverseString;
    @Before
    public void setUp() throws Exception {
        reverseString=new ReverseString();
    }

    @Test
    public void testReverseStringOfNullWord() throws Exception {
        assertNull(reverseString.reverseString(null));
        assertEquals("", reverseString.reverseString(""));
    }

    @Test
    public void testReverseStringEndOfTheSpace() throws Exception {
        assertEquals(" Ok",reverseString.reverseString("Ok "));
    }

    @Test
    public void testReverseString() throws Exception {
        assertEquals("I like   you",reverseString.reverseString("you   like I"));
        assertEquals("I can do it ",reverseString.reverseString(" it do can I"));
    }
}