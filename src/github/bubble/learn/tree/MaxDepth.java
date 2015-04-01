package github.bubble.learn.tree;

/**
 * Created by wangshuang on 2015/3/31.
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
}
