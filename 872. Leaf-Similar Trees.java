//https://leetcode.com/problems/leaf-similar-trees/?envType=daily-question&envId=2024-01-09
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

    public void findLeaves(TreeNode root, List<Integer> list) {
        if(root==null) return;

        if(root.left==null && root.right==null) {
            list.add(root.val);
        }
        findLeaves(root.right, list);
        findLeaves(root.left, list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        findLeaves(root1, list1);
        findLeaves(root2, list2);

       return list1.equals(list2);
    }
}
