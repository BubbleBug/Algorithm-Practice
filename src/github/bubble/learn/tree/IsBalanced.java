package github.bubble.learn.tree;

/**
 * Created by wangshuang on 2015/4/16.
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class IsBalanced {
    boolean result=true;
    public boolean isBalanced(TreeNode root){
        depth(root);
        return result;
    }
    int depth(TreeNode root){
        if(root==null)return 0;
        int leftDepth=depth(root.left);
        int rightDepth=depth(root.right);
        if(Math.abs(leftDepth-rightDepth)>1)
            result=false;
        return Math.max(leftDepth,rightDepth)+1;
    }
}
