package github.bubble.learn.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SymmetricTreeTest {
    SymmetricTree symmetric;
    @Before
    public void setUp() throws Exception {
        symmetric=new SymmetricTree();
    }

    @Test
    public void testIsSymmetricNullNode() throws Exception {
        TreeNode root=null;
        assertTrue(symmetric.isSymmetric(root));
    }
    @Test
    public void testIsSymmetricOneNode() throws Exception {
        TreeNode root=new TreeNode(0);
        assertTrue(symmetric.isSymmetric(root));
    }

    @Test
    public void testIsSymmetricThreeNodes() throws Exception {
        TreeNode root=new TreeNode(2);
        TreeNode left=new TreeNode(2);
        TreeNode right=new TreeNode(2);
        root.left=left;
        root.right=right;
        assertTrue(symmetric.isSymmetric(root));
    }

    @Test
    public void testIsSymmetricMoerNodes() throws Exception {
        TreeNode root=new TreeNode(1);
        TreeNode left_1=new TreeNode(2);
        TreeNode right_1=new TreeNode(2);
        TreeNode left_l2=new TreeNode(3);
        TreeNode right_l2=new TreeNode(4);
        TreeNode left_r2=new TreeNode(4);
        TreeNode right_r2=new TreeNode(3);
        root.left=left_1;
        root.right=right_1;
        root.left.left=left_l2;
        root.left.right=right_l2;
        root.right.left=left_r2;
        root.right.right=right_r2;
        assertTrue(symmetric.isSymmetric(root));
    }

    @Test
    public void testIsNotSymmetricMoerNodes() throws Exception {
        TreeNode root=new TreeNode(1);
        Tree tree=new Tree(root);
        tree.insert(2);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(4);
        tree.insert(3);
        assertFalse(symmetric.isSymmetric(root));
    }
}