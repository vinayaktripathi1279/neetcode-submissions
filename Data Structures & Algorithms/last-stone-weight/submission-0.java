class Solution {
    public int lastStoneWeight(int[] stones) {
        // 1. Initialize a Max-Heap using Collections.reverseOrder()
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // 2. Add all stone weights into the max-heap
        for (int stone : stones) {
            pq.offer(stone);
        }
        
        // 3. Process stones until 0 or 1 stone is left
        while (pq.size() > 1) {
            int first = pq.poll();  // Heaviest stone
            int second = pq.poll(); // Second heaviest stone
            
            // If they are not equal, smash them and push the remainder back
            if (first != second) {
                pq.offer(first - second);
            }
        }
        
        // 4. Return the weight of the last stone, or 0 if no stones are left
        return pq.isEmpty() ? 0 : pq.peek();
    }
}