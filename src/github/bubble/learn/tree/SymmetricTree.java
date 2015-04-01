package github.bubble.learn.tree;

/**
 * Created by wangshuang on 2015/3/31.
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root){
        return helper(root,root);
    }

    boolean helper(TreeNode left,TreeNode right){
        if(left==null || right==null) return left==right;
        return (left.val == right.val) && helper(left.left,right.right) && helper(left.right,right.left);

    }
}
