package github.bubble.learn.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDepthTest {
    MinDepth minDepth;
    @Before
    public void setUp() throws Exception {
        minDepth=new MinDepth();
    }

    @Test
    public void testMinDepthNULLTree() throws Exception {
        TreeNode root=null;
        int result=minDepth.minDepth(root);
        assertEquals(0,result);
    }

    @Test
    public void testMinDepthOneNodeTree() throws Exception {
        TreeNode root=new TreeNode(1);
        int result=minDepth.minDepth(root);
        assertEquals(1,result);
    }

    @Test
    public void testMinDepthOneBranchTree() throws Exception {
        TreeNode root=new TreeNode(1);
        Tree tree=new Tree(root);
        tree.insert(2);
        tree.insert(2);
        tree.insert(2);
        int result=minDepth.minDepth(root);
        assertEquals(4,result);
    }

    @Test
    public void testMinDepthTwoBranchTree() throws Exception {
        TreeNode root=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        TreeNode right=new TreeNode(3);
        root.left=left;
        root.right=right;
        int result=minDepth.minDepth(root);
        assertEquals(2,result);
    }
}