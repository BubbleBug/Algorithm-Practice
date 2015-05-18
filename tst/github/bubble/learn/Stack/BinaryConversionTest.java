package github.bubble.learn.Stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryConversionTest {
    BinaryConversion binaryConversion;
    @Before
    public void setUp() throws Exception {
        binaryConversion=new BinaryConversion();
    }

    @Test
    public void testDecimalToBinary() throws Exception {
        assertEquals(0,binaryConversion.decimalToBinary(0));
        assertEquals(1,binaryConversion.decimalToBinary(1));
        assertEquals(10,binaryConversion.decimalToBinary(2));
        assertEquals(110010,binaryConversion.decimalToBinary(50));
    }
}