//https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1
class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
    ArrayList<Integer> wrapList = new ArrayList<>();
    if (root == null) return wrapList;
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    boolean flag = true;
    while (!queue.isEmpty()) {
        int levelNum = queue.size();
        ArrayList<Integer> subList = new ArrayList<>(levelNum);
        for (int i = 0; i < levelNum; i++) {
            Node currentNode = queue.poll();

            if (flag) {
                subList.add(currentNode.data);
            } else {
                subList.add(0, currentNode.data);
            }
            if (currentNode.right != null) queue.offer(currentNode.right);
            if (currentNode.left != null) queue.offer(currentNode.left);
        }
        wrapList.addAll(subList);
        flag = !flag;
    }
    return wrapList;
    }
}
