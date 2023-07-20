//https://practice.geeksforgeeks.org/problems/easy-string2212/1?
public class Main
{   
    public static String transform(String S) 
    {
        S=S.toLowerCase();
        String ans="";
        int count=0;
        int index=0;
        if(S.length()==1){
            return 1+S;
        }
        for(int j=0;j<S.length()-1;j+=index+1){
            for(int i=j;i<S.length();i++){
                if(S.charAt(j)==S.charAt(i)){
                    count++;
                    index=count-1;
                    continue;
                }
                if(S.charAt(j)!=S.charAt(i)){
                    break;
                }
            }
            String ss=""+count+S.charAt(j);
            ans+=ss;
            count=0;
        }
        if(S.charAt(S.length()-1)!=S.charAt(S.length()-2)){
            ans+=1+""+S.charAt(S.length()-1);
        }
        return ans ;
    }
    public static void main(String[] args) {
        String S = "aaacca";
        System.out.println(transform(S));
    }
}
