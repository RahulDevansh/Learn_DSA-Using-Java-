//https://leetcode.com/problems/daily-temperatures/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> indxStack = new Stack<>();
        int size = temperatures.length;
        int[] answer = new int[size];
        for (int indx = 0; indx < size; indx++) {
            int currTemp = temperatures[indx];
            while (!indxStack.isEmpty() && temperatures[indxStack.peek()] < currTemp) {
                answer[indxStack.peek()] = indx - indxStack.peek();
                indxStack.pop();
            }
            indxStack.push(indx);
        }
        return answer;
    }
}
