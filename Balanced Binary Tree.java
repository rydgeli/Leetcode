// Given a binary tree, determine if it is height-balanced.

// For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        int diff=treeDepth(root.left)-treeDepth(root.right);
        if(diff>1||diff<-1)
            return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }
    
    public int treeDepth(TreeNode node){
        int left_depth=0,right_depth=0;
        if(node==null)
            return 0;
            
        left_depth+=treeDepth(node.left);
        right_depth+=treeDepth(node.right);
        
        if(left_depth>=right_depth)
            return left_depth+1;
        else
            return right_depth+1;
    }
}