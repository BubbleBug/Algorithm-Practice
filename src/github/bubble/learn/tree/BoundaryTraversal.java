package github.bubble.learn.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wangshuang on 2015/4/16.
 * Given a binary tree, print boundary nodes of the binary tree Anti-Clockwise starting from the root.
 *
 */
public class BoundaryTraversal {
    boolean isClockwise;

    Queue<Integer> nodes = new LinkedList<Integer>();
    public void printBoundaryNodes(TreeNode root,boolean isClockwise){
        nodes.clear();
        this.isClockwise=isClockwise;
        if(root==null){
            System.out.print("This tree is NULL!");
            return;
        }
        if(isClockwise) {
            getRightBoundaryNodes(root);
            getOtherNodes(root);
            getLeftBoundaryNodes(root.left);

        }else {
            getLeftBoundaryNodes(root);
            getOtherNodes(root);
            getRightBoundaryNodes(root.right);
        }

        for(Object j: nodes.toArray())
            System.out.print(j + " ");

    }

    //print all left boundary nodes, except a leaf node.
    private void getLeftBoundaryNodes(TreeNode root) {
        if (root == null) return;
        if (root.left != null ) {
            if (isClockwise) {
                getLeftBoundaryNodes(root.left);
                nodes.add(root.val);
            } else {
                nodes.add(root.val);
                getLeftBoundaryNodes(root.left);
            }
        }
    }
    //print all right boundary nodes, except a leaf node.
    private void getRightBoundaryNodes(TreeNode root) {
        if (root == null) return;
        if (root.right != null ) {
            if (isClockwise) {
                nodes.add(root.val);
                getRightBoundaryNodes(root.right);
            } else {
                getRightBoundaryNodes(root.right);
                nodes.add(root.val);
            }

        }

    }

    private void getOtherNodes(TreeNode root){
        if(root!=null){
            if(isClockwise)
            {
                getOtherNodes(root.right);
                if(root.left==null && root.right==null)
                    nodes.add(root.val);
                getOtherNodes(root.left);
            }else {
                getOtherNodes(root.left);
                if(root.left==null && root.right==null)
                    nodes.add(root.val);
                getOtherNodes(root.right);
            }

        }
    }


}

