package github.bubble.learn.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveCharsTest {
    RemoveChars removeChars;
    @Before
    public void setUp() throws Exception {
        removeChars=new RemoveChars();
    }

    @Test
    public void testRemoveChars() throws Exception {
        String str1= removeChars.removeChars("","");
        String str2= removeChars.removeChars("frtf","g");
        String str3= removeChars.removeChars("frtf","f");
        String str4= removeChars.removeChars("I can do it","cdi");
        assertEquals(0,str1.length());
        assertEquals("frtf",str2);
        assertEquals("rt",str3);
        assertEquals("I an o t",str4);

    }
}