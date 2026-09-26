class KthLargest {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int capacity;
    public KthLargest(int k, int[] nums) {
        capacity = k;
        // add to the minHeap
        for (int i : nums) {
            minHeap.offer(i);
        }
        // resize to k
        while (minHeap.size() > k) {
            minHeap.poll();
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        while (minHeap.size() > capacity) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
