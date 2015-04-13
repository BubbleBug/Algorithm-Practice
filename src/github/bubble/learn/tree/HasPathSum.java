package github.bubble.learn.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wangshuang on 2015/4/10.
 */
public class HasPathSum {
    public boolean hasPathSum(TreeNode root,int sum){
        if(root==null)return false;
        if(sum-root.val==0 && root.right==null && root.left==null){
            return true;
        }

        return (hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val));
    }

    private  List<List<Integer>> paths=new ArrayList<List<Integer>>() ;
    public List<List<Integer>> pathSum(TreeNode root,int sum){
        pathSum(root, sum, 0, new LinkedList<Integer>());
        return paths;
    }

    private  void  pathSum(TreeNode root, int sum, int cur, LinkedList<Integer> path){
        if (root != null) {
            path.add(root.val);
            cur += root.val;
            if (root.left == null && root.right == null && sum == cur) {
                paths.add((List<Integer>) path.clone());
            }
            else {
                if (root.left != null) {
                    pathSum(root.left, sum, cur, path);
                    path.remove();
                }
                if (root.right != null) {
                    pathSum(root.right, sum, cur, path);
                    path.remove();
                }
            }
        }
    }
}
