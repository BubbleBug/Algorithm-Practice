package github.bubble.learn.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LevelOrderTraversalTest {
    LevelOrderTraversal levelOrderTraversal;
    @Before
    public void setUp() throws Exception {
        levelOrderTraversal=new LevelOrderTraversal();
    }

    @Test
    public void testLevelOrderNullTree() throws Exception {
        TreeNode root=null;
        List<List<Integer>> result=levelOrderTraversal.levelOrder(root);
        assertEquals(result.size(),0);
    }
    @Test
    public void testLevelOrderOneLevelTree() throws Exception {
        TreeNode root=new TreeNode(1);
        List<Integer> level=new ArrayList<Integer>();
        level.add(1);
        List<List<Integer>> result=levelOrderTraversal.levelOrder(root);
        assertEquals(result.size(),1);
        assertEquals(level.size(),result.get(0).size());
        assertEquals(level.get(0),result.get(0).get(0));
        List<List<Integer>> result2=levelOrderTraversal.levelOrderByQueue(root);
        assertEquals(result2.size(),1);
        assertEquals(level.size(),result2.get(0).size());
        assertEquals(level.get(0),result2.get(0).get(0));
    }

    @Test
    public void testLevelOrderTwoLevelTree() throws Exception {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        List<Integer> level1=new ArrayList<Integer>();
        level1.add(1);
        List<Integer> level2=new ArrayList<Integer>();
        level2.add(2);
        List<List<Integer>> result=levelOrderTraversal.levelOrder(root);
        assertEquals(result.size(),2);
        assertEquals(level1.size(),result.get(0).size());
        assertEquals(level1.get(0),result.get(0).get(0));
        assertEquals(level2.size(),result.get(1).size());
        assertEquals(level2.get(0),result.get(1).get(0));
        List<List<Integer>> result2=levelOrderTraversal.levelOrderByQueue(root);
        assertEquals(result2.size(),2);
        assertEquals(level1.size(),result2.get(0).size());
        assertEquals(level1.get(0),result2.get(0).get(0));
        assertEquals(level2.size(),result2.get(1).size());
        assertEquals(level2.get(0),result2.get(1).get(0));
    }

    @Test
    public void testLevelOrderTwoLevelTree2() throws Exception {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        List<Integer> level1=new ArrayList<Integer>();
        level1.add(1);
        List<Integer> level2=new ArrayList<Integer>();
        level2.add(2);
        level2.add(3);
        List<List<Integer>> result=levelOrderTraversal.levelOrder(root);
        assertEquals(result.size(),2);
        assertEquals(level1.size(),result.get(0).size());
        assertEquals(level1.get(0),result.get(0).get(0));
        assertEquals(level2.size(),result.get(1).size());
        assertEquals(level2.get(0),result.get(1).get(0));
        assertEquals(level2.get(1),result.get(1).get(1));
        List<List<Integer>> result2=levelOrderTraversal.levelOrderByQueue(root);
        assertEquals(result2.size(),2);
        assertEquals(level1.size(),result2.get(0).size());
        assertEquals(level1.get(0),result2.get(0).get(0));
        assertEquals(level2.size(),result2.get(1).size());
        assertEquals(level2.get(0),result2.get(1).get(0));
        assertEquals(level2.get(1),result2.get(1).get(1));
    }

    @Test
    public void testLevelOrderThreeLevelTree() throws Exception {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        List<Integer> level1=new ArrayList<Integer>();
        level1.add(1);
        List<Integer> level2=new ArrayList<Integer>();
        level2.add(2);
        level2.add(3);
        List<Integer> level3=new ArrayList<Integer>();
        level3.add(4);
        List<List<Integer>> result=levelOrderTraversal.levelOrder(root);
        assertEquals(result.size(),3);
        assertEquals(level1.size(),result.get(0).size());
        assertEquals(level1.get(0),result.get(0).get(0));
        assertEquals(level2.size(),result.get(1).size());
        assertEquals(level2.get(0),result.get(1).get(0));
        assertEquals(level2.get(1),result.get(1).get(1));
        assertEquals(level3.size(),result.get(2).size());
        assertEquals(level3.get(0),result.get(2).get(0));
        List<List<Integer>> result2=levelOrderTraversal.levelOrderByQueue(root);
        assertEquals(result2.size(),3);
        assertEquals(level1.size(),result2.get(0).size());
        assertEquals(level1.get(0),result2.get(0).get(0));
        assertEquals(level2.size(),result2.get(1).size());
        assertEquals(level2.get(0),result2.get(1).get(0));
        assertEquals(level2.get(1),result2.get(1).get(1));
        assertEquals(level3.size(),result2.get(2).size());
        assertEquals(level3.get(0),result2.get(2).get(0));
    }


}