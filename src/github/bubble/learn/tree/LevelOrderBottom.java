package github.bubble.learn.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wangshuang on 2015/4/20.
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 */
public class LevelOrderBottom {
    //Compare ArrayList and LinkedList
    //In leetcode with ArrayList running time is 307ms,with LinkedList running time is 277ms
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> resultList=new ArrayList<List<Integer>>();
        traverse(resultList,0,root);
        return resultList;
    }
    //recursive
    void traverse(List<List<Integer>> list,int level,TreeNode node){
        if(node==null)return;
        if(list.size()-1<level)list.add(0,new ArrayList<Integer>());
        list.get(list.size()-level-1).add(node.val);
        traverse(list,level+1,node.left);
        traverse(list,level+1,node.right);
    }

    //264ms
    public List<List<Integer>> levelOrderBottomByQueue(TreeNode root) {
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
            result.add(0,level);
        }
        return result;
    }
}
