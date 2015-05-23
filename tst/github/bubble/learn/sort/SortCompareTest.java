package github.bubble.learn.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortCompareTest {

    @Test
    public void testTimeRandomInput() throws Exception {
        SortCompare.timeRandomInput("Shell", 1000, 1);
    }
}