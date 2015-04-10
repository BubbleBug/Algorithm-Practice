package github.bubble.learn.tree;

/**
 * Created by wangshuang on 2015/4/10.
 */
public class MinDepth {
    public int minDepth(TreeNode root){
        if(root == null)return 0;
        if(root.left==null) return minDepth(root.right)+1;
        else if(root.right==null) return minDepth(root.left)+1;
        return Math.min(minDepth(root.left)+1,minDepth(root.right)+1);
    }
}
