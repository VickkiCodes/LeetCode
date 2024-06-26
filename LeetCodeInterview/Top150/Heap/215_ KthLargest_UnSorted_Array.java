class Solution {
    //Using PriorityQueue : MinHeap
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> input = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            input.offer(nums[i]*-1);
            /**
             * Imporved Approach:
             *  Storing only 'K heap numbers' only.
             *
                  if (heap.size() > k) {
                      heap.remove();
                   }
             */
        }
        for(int i=0;i<k-1;i++){
            input.poll();
        }
        return (input.poll()*-1);
    }
}