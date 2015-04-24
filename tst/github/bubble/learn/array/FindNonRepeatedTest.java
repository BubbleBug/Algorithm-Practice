package github.bubble.learn.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindNonRepeatedTest {
    FindNonRepeated findNonRepeated;
    @Before
    public void setUp() throws Exception {
        findNonRepeated=new FindNonRepeated();
    }

    @Test
    public void testFirstNonRepeatedOfNull() throws Exception {
        assertNull(findNonRepeated.firstNonRepeated(""));
    }
    @Test
    public void testFirstNonRepeatedOfOneChar() throws Exception {
        Character result=findNonRepeated.firstNonRepeated("a");
        assertEquals("a", result.toString());
    }
    @Test
    public void testFirstNonRepeatedOfNoRepeatChar() throws Exception {
        Character result=findNonRepeated.firstNonRepeated("aa");
        assertNull(result);
    }

    @Test
    public void testFirstNonRepeatedOfHaveRepeatChar() throws Exception {
        Character result=findNonRepeated.firstNonRepeated("aafdfedr");
        assertEquals("e", result.toString());
    }
}