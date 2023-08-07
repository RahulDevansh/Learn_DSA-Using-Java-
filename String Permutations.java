//https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string-1587115620/0
class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> ans = new ArrayList<>();
        findPerm(ans,0,S);
        Collections.sort(ans);
        return ans;
    }
	 
	 static void findPerm(ArrayList<String> ans ,int indx, String S)
	 {
	     if(indx == S.length())
	     {
	             ans.add(S);
	             return;
	     }
	     
	     for(int i=indx;i<S.length();i++)
	     {
	       StringBuilder string = new StringBuilder(S);
	       char ch1 = string.charAt(indx);
	       char ch2 = string.charAt(i);
               string.setCharAt(i, ch1);
               string.setCharAt(indx,ch2);
               S = string.toString();
               findPerm(ans,indx+1,S);
               string.setCharAt(i, ch2);
               string.setCharAt(indx,ch1);
               S = string.toString();
	     }
	 }
	   
}
