package github.bubble.learn.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wangshuang on 2015/4/17.
 * Binary Tree Level Order Traversal
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 */
public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<TreeNode> level=new ArrayList<TreeNode>();
        level.add(root);
        while (true){
            if(level.isEmpty() || level.get(0)==null)break;

            List<Integer> valList=new ArrayList<Integer>();
            List<TreeNode> nextLevel=new ArrayList<TreeNode>();
            for (TreeNode node :level){
                valList.add(node.val);
                if(node.left!=null)nextLevel.add(node.left);
                if(node.right!=null)nextLevel.add(node.right);
            }

            result.add(valList);
            level=nextLevel;
        }
        return result;
    }

    public List<List<Integer>> levelOrderByQueue(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        if(root==null)return result;
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> level=new ArrayList<Integer>();
            for (int i=0;i<size;i++){
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                level.add(queue.poll().val);
            }
            result.add(level);
        }
        return result;
    }
}
