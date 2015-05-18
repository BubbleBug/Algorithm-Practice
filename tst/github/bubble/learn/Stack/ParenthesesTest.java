package github.bubble.learn.Stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParenthesesTest {
    Parentheses parentheses;
    @Before
    public void setUp() throws Exception {
        parentheses=new Parentheses();
    }

    @Test
    public void testIsBalanced() throws Exception {
        assertFalse(parentheses.isBalanced(""));
        assertTrue(parentheses.isBalanced("[()]{}{[()()]()}"));
        assertFalse(parentheses.isBalanced("[(])"));
    }
}