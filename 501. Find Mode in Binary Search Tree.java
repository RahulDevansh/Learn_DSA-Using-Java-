//https://leetcode.com/problems/find-mode-in-binary-search-tree/description/
///**
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
    HashMap<Integer, Integer> map=new HashMap<>();
    int max=0;
    public int[] findMode(TreeNode root) {
        findModeH(root);
        List<Integer> arr=new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key)==max){
                arr.add(key);
            }
        }
        int ans[] = new int[arr.size()];
        for(int i=0; i<ans.length; i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
    public void findModeH(TreeNode root) {
        if(root==null){
            return;
        }
        if(map.containsKey(root.val)){
            map.put(root.val,map.get(root.val)+1);
        }else{
            map.put(root.val,1);
        }
        max=Math.max(max,map.get(root.val));
        findModeH(root.left);
        findModeH(root.right);
    }    
}
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
    HashMap<Integer, Integer> map=new HashMap<>();
    int max=0;
    public int[] findMode(TreeNode root) {
        findModeH(root);
        List<Integer> arr=new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key)==max){
                arr.add(key);
            }
        }
        int ans[] = new int[arr.size()];
        for(int i=0; i<ans.length; i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
    public void findModeH(TreeNode root) {
        if(root==null){
            return;
        }
        if(map.containsKey(root.val)){
            map.put(root.val,map.get(root.val)+1);
        }else{
            map.put(root.val,1);
        }
        max=Math.max(max,map.get(root.val));
        findModeH(root.left);
        findModeH(root.right);
    }    
}
