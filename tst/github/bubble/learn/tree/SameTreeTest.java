package github.bubble.learn.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameTreeTest {
    SameTree sameTree=new SameTree();
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSameTreeOfNullTree() throws Exception {
        TreeNode root1=null;
        TreeNode root2=null;
        assertTrue(sameTree.sameTree(root1, root2));
    }

    @Test
    public void testNotSameTreeOfOneAndNullTree() throws Exception {
        TreeNode root1=new TreeNode(0);
        TreeNode root2=null;
        assertFalse(sameTree.sameTree(root1, root2));
    }

    @Test
    public void testNotSameTreeOfOneAndOneTree() throws Exception {
        TreeNode root1=new TreeNode(0);
        TreeNode root2=new TreeNode(1);
        assertFalse(sameTree.sameTree(root1,root2));
    }

    @Test
    public void testSameTreeOfOneAndOneTree() throws Exception {
        TreeNode root1=new TreeNode(1);
        TreeNode root2=new TreeNode(1);
        assertTrue(sameTree.sameTree(root1, root2));
    }

    @Test
    public void testNotSameTreeOfTwoAndOneTree() throws Exception {
        TreeNode root1=new TreeNode(1);
        TreeNode root2=new TreeNode(1);
        Tree tree=new Tree(root1);
        tree.insert(2);
        assertFalse(sameTree.sameTree(root1, root2));
    }

    @Test
    public void testSameTreeOfTwoAndTwoTree() throws Exception {
        TreeNode root1=new TreeNode(1);
        TreeNode root2=new TreeNode(1);
        Tree tree1=new Tree(root1);
        tree1.insert(2);
        Tree tree2=new Tree(root2);
        tree2.insert(2);
        assertTrue(sameTree.sameTree(root1,root2));
    }
}