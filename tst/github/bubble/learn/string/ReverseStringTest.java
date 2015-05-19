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

        assertNull(reverseString.reverseStringExchange(null));
        assertEquals("", reverseString.reverseStringExchange(""));
    }

    @Test
    public void testReverseStringEndOfTheSpace() throws Exception {
        assertEquals(" Ok",reverseString.reverseString("Ok "));

        assertEquals("Ok",reverseString.reverseStringExchange("Ok"));
    }

    @Test
    public void testReverseString() throws Exception {
        assertEquals("I like   you",reverseString.reverseString("you   like I"));
        assertEquals("I can do it ",reverseString.reverseString(" it do can I"));

        assertEquals("I like   you",reverseString.reverseStringExchange("you   like I"));
        assertEquals("I can do it ",reverseString.reverseStringExchange(" it do can I"));

        assertEquals("I can do it ",reverseString.reverseStringDoubleStack(" it do can I"));
    }
}