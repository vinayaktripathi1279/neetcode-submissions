class Pair{
    int distance;
    int index;
    Pair(int distance, int index){
        this.distance=distance;
        this.index =index;
    }
}




class Solution {
    public int[][] kClosest(int[][] points, int k) {



        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.distance != b.distance) {
                return Integer.compare(a.distance,b.distance);
            }

            return Integer.compare(a.index,b.index);
        });
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            int distance=x*x+y*y;
            pq.offer(new Pair(distance,i));

        }
        int ans[][]=new int[k][2];
        for(int i=0;i<k;i++){
             Pair p = pq.poll();
             ans[i]=points[p.index];
        }
        return ans;
    }
}
    

