package github.bubble.learn.tree;

/**
 * Created by wangshuang on 2015/3/31.
 */
public class Tree {
    TreeNode root;
    Tree(TreeNode node){
        root=node;
    }

    public void insert(int val){
        TreeNode newNode=new TreeNode(val);
        if(root==null){
            root=newNode;
        }else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (val < current.val) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }

                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public TreeNode find(int val){
        TreeNode node=root;
        while(node.val!=val){
            if(node.val>val){
                node=node.left;
            }else{
                node=node.right;
            }
            if(node==null)return null;
        }
        return node;
    }


}
