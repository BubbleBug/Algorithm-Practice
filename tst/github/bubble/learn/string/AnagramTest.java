package github.bubble.learn.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram anagram;

    @Before
    public void setUp() throws Exception {
        anagram=new Anagram();
    }

    @Test
    public void testAnagram() throws Exception {
        boolean result=anagram.anagram("ab","ab");
        assertTrue(result);
        boolean result1=anagram.anagram("abcd","dcab");
        assertTrue(result1);
        boolean result2=anagram.anagram("django","naogdj");
        assertTrue(result2);
        boolean result3=anagram.anagram("abcd","aabd");
        assertFalse(result3);
        boolean result4=anagram.anagram("geawsdd","dgwasde");
        assertTrue(result4);
    }
}