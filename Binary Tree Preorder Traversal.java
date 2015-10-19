// Given a binary tree, return the preorder traversal of its nodes' values.

// For example:
// Given binary tree {1,#,2,3},
//    1
//     \
//      2
//     /
//    3

// return [1,2,3].

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// Recursive:

public class Solution_Recursive_1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        if(root!=null)
        {
            result.add(root.val);
            result.addAll(preorderTraversal(root.left));
            result.addAll(preorderTraversal(root.right));
        }
        return result;
    }
}

public class Solution_Recursive_2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        helper(result,root);
        return result;
    }
    
    public void helper(List<Integer> result, TreeNode root)
    {
        if(root==null)
            return;
        result.add(root.val);
        helper(result, root.left);
        helper(result,root.right);
    }
}

// Iterative:

public class Solution_Iterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> sta=new Stack<TreeNode>();
        List<Integer> result=new ArrayList<Integer>();
        if(root!=null)
            sta.push(root);
        TreeNode cur;
        while(!sta.isEmpty())
        {
            cur=sta.pop();
            result.add(cur.val);
            if(cur.right!=null)
                sta.push(cur.right);
            if(cur.left!=null)
                sta.push(cur.left);
        }
        return result;
        
    }
}