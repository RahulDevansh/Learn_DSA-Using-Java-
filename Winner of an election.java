//https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1?
/*
    Input:
    n = 13
    Votes[] = {john,johnny,jackie,johnny,john,jackie,jamie,jamie,john,johnny,jamie,johnny,john}
    Output: john 4
*/
class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        int max=-1;
        String ans ="";
        for(String cad : map.keySet()){
            if(map.get(cad)>max){
                max=map.get(cad);
                ans=cad;
            }
        }
        String winner[]=new String[2];
        winner[0]=ans;
        winner[1]=""+max;
        return winner;
    }
}

