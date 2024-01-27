//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        double counter=0;
        for(int i=1;i<salary.length-1;i++){
            sum+=salary[i];
            counter++;
        }
        sum=sum/counter;
        
        return sum;
    }
}
