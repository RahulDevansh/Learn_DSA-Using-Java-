//https://practice.geeksforgeeks.org/problems/numbers-containing-1-2-and-32555/1?
public static void findAll()
{
    //Your code here
        for(int i=1;i<=1000000;i++)
    {
        int j=i;
        boolean s=true;
        while(j>0)
        {
            int rem=j%10;
           if(rem!=1&&rem!=2&&rem!=3) 
           {
               s=false;
               break;
           }
           j=j/10;
        }
        if(s)
       mp.put(i,1);
    }   
}
