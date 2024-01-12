// https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
class GfG {
    // Function to reverse first k elements of a queue.
       public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // Create a stack to temporarily store the first k elements
        Stack<Integer> stack = new Stack<>();

        // Enqueue the first k elements into the stack
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        // Dequeue the elements from the stack and enqueue them back into the queue
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        // Enqueue the remaining elements from the original queue
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }

        return q;
    
    }
}
