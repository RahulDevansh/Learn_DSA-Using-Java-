// https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int solve(TreeNode root,int path){
        if(root == null) return 0;
        path ^= (1 << root.val);
        if(root.left == null && root.right == null){
            if((path & (path - 1)) == 0) return 1;
            return 0;
        }
        int leftSeudoPaths = solve(root.left,path);
        int rightSeudoPaths = solve(root.right,path);
        return leftSeudoPaths + rightSeudoPaths;
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        return solve(root,0);
    }
}
