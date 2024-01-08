// https://leetcode.com/problems/range-sum-of-bst/
class Solution {
    int sum = 0 ;
    public void helper(TreeNode root , int low , int high){
        if(root == null) {
            return ;
        }
        if(root.val > low){
            helper(root.left , low , high);
        }
        if(root.val < high){
            helper(root.right , low , high);
        }
        if(root.val >= low && root.val <= high){
            sum += root.val;
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        helper(root , low , high);
        return sum ;
    }
}
