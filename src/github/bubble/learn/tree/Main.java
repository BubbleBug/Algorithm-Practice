package github.bubble.learn.tree;

/**
 * Created by wangshuang on 2015/4/16.
 */
public class Main {
    public static void main(String args[]) {
        /**
         * The binary tree is:
         *        2
         *      /   \
         *     3      4
         *    / \    / \
         *   5   6  7   8
         *
         * print out :
         * Anti-Clockwise
         * 2 3 5 6 7 8 4
         *
         * Clockwise
         * 2 4 8 7 6 5 3
         */
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(3);
        root.left.left=new TreeNode(5);
        root.left.right=new TreeNode(6);
        //root.left.left.left=new TreeNode(9);
        root.right=new TreeNode(4);
        root.right.right=new TreeNode(8);
        root.right.left=new TreeNode(7);
        //root.right.right.right=new TreeNode(10);

        BoundaryTraversal boundaryTraversal=new BoundaryTraversal();
        //Anti-Clockwise
        System.out.println("Print boundary nodes of the binary tree Anti-Clockwise starting from the root");
        boundaryTraversal.printBoundaryNodes(root,false);
        //Clockwise
        System.out.println("\nPrint boundary nodes of the binary tree Clockwise starting from the root");
        boundaryTraversal.printBoundaryNodes(root,true);
    }
}
