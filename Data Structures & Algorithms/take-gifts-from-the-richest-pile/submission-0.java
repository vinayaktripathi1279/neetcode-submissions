class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.offer(gifts[i]);
        }
        int i=0;
        while(i<k){
            int num=pq.peek();
            pq.poll();

            int val=(int)Math.abs(Math.sqrt(num));
            
            pq.offer(val);
            i++;
        }
        if(pq.isEmpty()){
            return 0;
        }
        else{
            long sum=0;

            for(int num:pq){
                sum+=num;
            }
            return sum;
        }
    }
}