package github.bubble.learn.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsBalancedTest {
    IsBalanced isBalanced;

    @Before
    public void setUp() throws Exception {
        isBalanced=new IsBalanced();
    }

    @Test
    public void testIsBalancedOfNullTree() throws Exception {
        TreeNode root=null;
        assertTrue(isBalanced.isBalanced(root));
    }

    @Test
    public void testIsBalancedOfOneNodeTree() throws Exception {
        TreeNode root=new TreeNode(1);
        assertTrue(isBalanced.isBalanced(root));
    }

    @Test
    public void testIsBalancedOfTwoNodesTree() throws Exception {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        assertTrue(isBalanced.isBalanced(root));
    }

    @Test
    public void testIsBalancedOfBalancedTree() throws Exception {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        assertTrue(isBalanced.isBalanced(root));
    }

    @Test
    public void testIsBalancedOfNoBalancedTree() throws Exception {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        root.right.right.left=new TreeNode(6);
        assertFalse(isBalanced.isBalanced(root));
    }


}