package github.bubble.learn.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {
    LengthOfLastWord lengthOfLastWord;
    @Before
    public void setUp() throws Exception {
        lengthOfLastWord=new LengthOfLastWord();
    }

    @Test
    public void testLengthOfLastWordOfNull() throws Exception {
        assertEquals(0,lengthOfLastWord.lengthOfLastWord(""));
        assertEquals(0,lengthOfLastWord.lengthOfLastWord(null));

        assertEquals(0,lengthOfLastWord.lengthOfLastWordFaster(""));
        assertEquals(0,lengthOfLastWord.lengthOfLastWordFaster(null));
    }

    @Test
    public void testLengthOfLastWordOfOneWord() throws Exception {
        assertEquals(5,lengthOfLastWord.lengthOfLastWord("Hello"));
        assertEquals(1,lengthOfLastWord.lengthOfLastWord("a  "));

        assertEquals(5,lengthOfLastWord.lengthOfLastWordFaster("Hello"));
        assertEquals(1,lengthOfLastWord.lengthOfLastWordFaster("a  "));
    }

    @Test
    public void testLengthOfLastWordOfTwoWord() throws Exception {
        assertEquals(5,lengthOfLastWord.lengthOfLastWord("Hello World"));

        assertEquals(5,lengthOfLastWord.lengthOfLastWordFaster("Hello World"));
    }
    @Test
    public void testLengthOfLastWord() throws Exception {
        assertEquals(2,lengthOfLastWord.lengthOfLastWord("I can do it"));

        assertEquals(2,lengthOfLastWord.lengthOfLastWordFaster("I can do it"));
    }
}