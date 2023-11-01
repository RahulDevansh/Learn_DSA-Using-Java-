//https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int i;
        HashMap<Integer,Integer> map=new HashMap();
        for(i=0;i<N;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int val=map.get(arr[i]);
                val++;
                map.put(arr[i],val);
            }else{
                map.put(arr[i],1);
            }
        }
        
        for(i=1;i<=N;i++)
        {
            if(map.containsKey(i))
            {
                arr[i-1]=map.get(i);
                
            }else{
                arr[i-1]=0;
            }
        }


    }
}
