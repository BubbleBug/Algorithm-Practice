package github.bubble.learn.array;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PascalTriangleIITest {
    PascalTriangleII pascalTriangleII;
    @Before
    public void setUp() throws Exception {
        pascalTriangleII=new PascalTriangleII();
    }

    @Test
    public void testGetRowNullAndOne() throws Exception {
        List<Integer> row=pascalTriangleII.getRow(-1);
        assertNull(row);
        List<Integer> row0=pascalTriangleII.getRow(0);
        assertEquals(1, row0.size());
        assertEquals(1,row0.get(0).intValue());
        List<Integer> row1=pascalTriangleII.getRow(1);
        assertEquals(2,row1.size());
        assertEquals(1,row1.get(0).intValue());
        assertEquals(1,row1.get(1).intValue());
    }

    @Test
    public void testGetRow3() throws Exception {
        List<Integer> row1=pascalTriangleII.getRow(3);
        assertEquals(4,row1.size());
        assertEquals(1,row1.get(0).intValue());
        assertEquals(3,row1.get(1).intValue());
        assertEquals(3,row1.get(2).intValue());
        assertEquals(1,row1.get(3).intValue());
    }
}