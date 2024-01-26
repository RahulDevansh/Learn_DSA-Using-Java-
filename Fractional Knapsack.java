//https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // sorting the Item' s array based on the value/weight ratios...
        Arrays.sort(arr, new Comparator<Item>() {
            @Override 
            public int compare(Item obj1, Item obj2) {
                double ratio1 = obj1.value/(double)obj1.weight;
                double ratio2 = obj2.value/(double)obj2.weight;
                if(ratio1 == ratio2) return 0;
                if(ratio1 > ratio2) return -1;
                else return 1;
            }
        });
        
        // after sorting, all we need to do is add the most valuable item to the max variable...          
        double max = 0;
        for(Item obj : arr) {
            if(obj.weight < W) {
                max += obj.value;
                W -= obj.weight;
            }else{
                max += obj.value*(W/(double)obj.weight);
                break;
            }
        }
        return max;
    }
}
