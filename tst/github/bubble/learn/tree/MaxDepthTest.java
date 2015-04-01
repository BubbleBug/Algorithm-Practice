package github.bubble.learn.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDepthTest {
    MaxDepth depth;
    @Before
    public void setUp() throws Exception {
        depth=new MaxDepth();
    }

    @Test
    public void testMaxDepthNullNode() throws Exception {
        TreeNode root=null;
        int result=depth.maxDepth(root);
        assertEquals(0,result);
    }

    @Test
    public void testMaxDepthOneNode() throws Exception {
        TreeNode root=new TreeNode(0);
        int result=depth.maxDepth(root);
        assertEquals(1,result);
    }

    @Test
    public void testMaxDepthMoreNode() throws Exception {
        TreeNode root=new TreeNode(5);
        Tree tree=new Tree(root);
        tree.insert(4);
        tree.insert(7);
        tree.insert(2);
        tree.insert(8);
        tree.insert(9);
        int result=depth.maxDepth(root);
        assertEquals(4,result);
    }
}