package github.bubble.learn.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LevelOrderBottomTest {
    LevelOrderBottom levelOrderBottom;
    @Before
    public void setUp() throws Exception {
        levelOrderBottom=new LevelOrderBottom();
    }

    @Test
    public void testLevelOrderBottomOfNullTree() throws Exception {
        TreeNode root=null;
        List<List<Integer>> result= levelOrderBottom.levelOrderBottom(root);
        List<List<Integer>> result2= levelOrderBottom.levelOrderBottomByQueue(root);
        assertTrue(result.size() == 0);
        assertTrue(result2.size() == 0);
    }

    @Test
    public void testLevelOrderBottomOfOneLevelTree() throws Exception {
        TreeNode root=new TreeNode(1);
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        List<List<Integer>> result= levelOrderBottom.levelOrderBottom(root);
        List<List<Integer>> result2= levelOrderBottom.levelOrderBottomByQueue(root);
        assertTrue(result.size()==1);
        assertEquals(result.get(0), list);
        assertTrue(result2.size()==1);
        assertEquals(result2.get(0), list);
    }
    @Test
    public void testLevelOrderBottomOfTwoLevelTree() throws Exception {
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        List<Integer> list1=new ArrayList<Integer>();
        list1.add(1);
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(2);
        List<List<Integer>> result= levelOrderBottom.levelOrderBottom(root);
        assertTrue(result.size()==2);
        assertEquals(result.get(0), list2);
        assertEquals(result.get(1), list1);
        List<List<Integer>> result2= levelOrderBottom.levelOrderBottomByQueue(root);
        assertTrue(result2.size()==2);
        assertEquals(result2.get(0), list2);
        assertEquals(result2.get(1), list1);
    }

    @Test
    public void testLevelOrderBottomOfThreeLevelTree() throws Exception {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(4);
        List<Integer> list1=new ArrayList<Integer>();
        list1.add(1);
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(3);
        list2.add(2);
        List<Integer> list3=new ArrayList<Integer>();
        list3.add(4);
        List<List<Integer>> result= levelOrderBottom.levelOrderBottom(root);
        assertTrue(result.size()==3);
        assertEquals(result.get(0), list3);
        assertEquals(result.get(1), list2);
        assertEquals(result.get(2), list1);
        List<List<Integer>> result2= levelOrderBottom.levelOrderBottomByQueue(root);
        assertTrue(result2.size()==3);
        assertEquals(result2.get(0), list3);
        assertEquals(result2.get(1), list2);
        assertEquals(result2.get(2), list1);
    }
}