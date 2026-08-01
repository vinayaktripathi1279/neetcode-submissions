class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        int n=nums.length;
        int i=0;

        while(i<n-k){

            int p=pq.poll();
            i++;
        }
        return pq.peek();
    }
}
