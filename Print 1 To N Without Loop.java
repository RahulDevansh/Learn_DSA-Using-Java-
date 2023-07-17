
public class Main
{  
    public static int reverse(int n1,int N){
      System.out.print(n1+" ");
      if(n1==N){
          return N;
      } else {
          return reverse(n1+1,N);
      }
  }
    public static void main(String[] args) {
        int starter=1;
        int N=10;
        reverse(starter,N);
    }
}
