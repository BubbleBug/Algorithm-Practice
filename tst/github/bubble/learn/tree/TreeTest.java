package github.bubble.learn.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {
    Tree tree;
    TreeNode root;

    @Before
    public void setUp() throws Exception {
        root=new TreeNode(2);
    }

    @Test
    public void testInsert() throws Exception {
        tree=new Tree(root);
        tree.insert(1);
        tree.insert(3);
        assertEquals(3,root.right.val);
        assertEquals(1,root.left.val);
    }

    @Test
    public void testFind() throws Exception {
        tree=new Tree(root);
        tree.insert(1);
        tree.insert(3);
        TreeNode result=tree.find(3);
        assertNull(result.left);
        assertNull(result.right);
        assertEquals(3,result.val);
    }
}