//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[] = new int[prices.length];
        int m=0;
        boolean result = false;
        for(int i=0;i<prices.length;i++){
            result=false;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    arr[m]=prices[i]-prices[j];
                    m++;
                    result=true;
                    break;
                 }
            }
            if(result==false){
                arr[m]=prices[i];
                m++;
            }
        }
        return arr;
    }
}
