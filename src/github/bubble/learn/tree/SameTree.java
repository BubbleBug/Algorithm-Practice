package github.bubble.learn.tree;

/**
 * Created by wangshuang on 2015/4/1.
 */
public class SameTree {
    public boolean sameTree(TreeNode root1,TreeNode root2){
        if(root1==null || root2==null)return root1==root2;
        return (root1.val==root2.val) && sameTree(root1.left,root2.left) && sameTree(root1.right,root2.right);
    }
}
