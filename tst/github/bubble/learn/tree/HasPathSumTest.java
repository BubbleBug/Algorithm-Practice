package github.bubble.learn.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HasPathSumTest {
    HasPathSum hasPathSum;
    @Before
    public void setUp() throws Exception {
        hasPathSum=new HasPathSum();
    }

    @Test
    public void testHasPathSumNullTree() throws Exception {
        TreeNode root=null;
        boolean result=hasPathSum.hasPathSum(root,10);
        assertFalse(result);
    }

    @Test
    public void testHasPathSumOneNodeTree() throws Exception {
        TreeNode root=new TreeNode(10);
        boolean result=hasPathSum.hasPathSum(root,10);
        assertTrue(result);
    }

    @Test
    public void testHasPathSumOneBranchTreeIsTrue() throws Exception {
        TreeNode root=new TreeNode(10);
        TreeNode left=new TreeNode(11);
        root.left=left;
        boolean result=hasPathSum.hasPathSum(root,21);
        assertTrue(result);
    }
    @Test
    public void testHasPathSumOneBranchTreeIsFalse() throws Exception {
        TreeNode root=new TreeNode(10);
        TreeNode left=new TreeNode(11);
        TreeNode left_right=new TreeNode(5);
        root.left=left;
        root.left.left=left_right;
        boolean result=hasPathSum.hasPathSum(root,21);
        assertFalse(result);
    }

    @Test
    public void testHasPathSumTwoBranchTreeIsTrue() throws Exception {
        TreeNode root=new TreeNode(10);
        TreeNode left=new TreeNode(11);
        TreeNode right=new TreeNode(1);
        root.left=left;
        root.right=right;
        boolean result=hasPathSum.hasPathSum(root,21);
        assertTrue(result);
    }
    @Test
    public void testHasPathSumTwoBranchTreeIsFalse() throws Exception {
        TreeNode root=new TreeNode(10);
        TreeNode left=new TreeNode(7);
        TreeNode right=new TreeNode(1);
        TreeNode right_right=new TreeNode(1);
        root.left=left;
        root.right=right;
        root.right.right=right_right;
        boolean result=hasPathSum.hasPathSum(root,21);
        assertFalse(result);
    }
}