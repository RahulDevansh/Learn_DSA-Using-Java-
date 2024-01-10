// https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/
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
    
    List<TreeNode> p = new ArrayList<>();
    Set<Integer> ans = new HashSet<>();
    
    public int amountOfTime(TreeNode root, int start) {
        
        path(root,start);
        int n = p.size();
        
        for(int i=0;i<n;i++){
            
            add(p.get(i),i,i==0?null:p.get(i-1));            
        }
        
        return ans.size();
        
    }
    public void add(TreeNode root,int k,TreeNode blocker){
        
        if(root==null || k<0 || root==blocker) return ;
        
        if(k!=0) ans.add(k);
        
        add(root.left,k+1,blocker);
        add(root.right,k+1,blocker);
        
    }
    
     public boolean path(TreeNode root,int target){
        
        if(root==null) return false;
        
        if(root.val ==target){ 
         p.add(root);
         return true;
        }
        boolean left =  path(root.left,target);
        if(left){
            p.add(root);
            return true;
        }
        boolean right=  path(root.right,target);
        if(right){
            p.add(root);
            return true;
        }
        
        return false;
    }
}
