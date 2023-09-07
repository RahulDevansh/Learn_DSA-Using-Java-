//https://practice.geeksforgeeks.org/problems/minimum-multiplications-to-reach-end/1
/*
Input:
arr[] = {2, 5, 7}
start = 3, end = 30
Output:
2
*/
class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
          int maxPossibleValue = 100000;
        boolean[] visited = new boolean[maxPossibleValue];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                if (current == end) {
                    return steps;
                }

                for (int num : arr) {
                    int next = (current * num) % maxPossibleValue;

                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }

            steps++;
        }

        return -1;
    }
}
