package github.bubble.learn.array;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2015/5/17.
 */
public class PascalTriangleTest {
    PascalTriangle pascalTriangle;
    @Before
    public void setUp() throws Exception {
        pascalTriangle=new PascalTriangle();

    }
    @Test
    public void testGenerateNullAndOne() throws Exception {
        List<List<Integer>> results=pascalTriangle.generate(0);
        assertEquals(0,results.size());
        List<List<Integer>> results1=pascalTriangle.generate(1);
        assertEquals(1,results1.size());
    }
    @Test
    public void testGenerate() throws Exception {
        List<List<Integer>> results=pascalTriangle.generate(5);
        assertEquals(5,results.size());
        assertEquals(1,results.get(0).size());
        assertEquals(2,results.get(1).size());
        assertEquals(3,results.get(2).size());
        assertEquals(4,results.get(3).size());
        assertEquals(5,results.get(4).size());
    }

}
