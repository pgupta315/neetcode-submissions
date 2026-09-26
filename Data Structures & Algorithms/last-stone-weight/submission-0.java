class Solution {
    public int lastStoneWeight(int[] stones) {
        // insert all the stones into a max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for  (int stone : stones) {
            maxHeap.offer(stone);
        }

        // while heap size > 1
        while (maxHeap.size() > 1) {
            // pop two stones from the heap 
            // int first = maxHeap.poll();
            // int second = maxHeap.poll();
            int diff = maxHeap.poll() - maxHeap.poll() ;
            // smash them = get the diff

            // insert the diff
            if (diff > 0) {
                maxHeap.offer(diff);
            }
        }

        // return the top 
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
