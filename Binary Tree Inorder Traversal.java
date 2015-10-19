// Given a binary tree, return the inorder traversal of its nodes' values.

// For example:
// Given binary tree {1,#,2,3},
//    1
//     \
//      2
//     /
//    3
// return [1,3,2].

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Recursive:

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        if(root!=null)
        {
            result.addAll(inorderTraversal(root.left));
            result.add(root.val);
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }
}

//Iterative:

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        Stack<TreeNode> sta=new Stack<TreeNode>();
        
        TreeNode cur=root;
        while(cur!=null || !sta.isEmpty())
        {
            while(cur!=null)
            {
                sta.push(cur);
                cur=cur.left;
            }
            
            cur=sta.pop();
            result.add(cur.val);
            cur=cur.right;
        }
        
        return result;
    }
}