class Pair {
    int value;
    int index;

    Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.value != b.value)
                return Integer.compare(a.value, b.value);
            return Integer.compare(a.index, b.index);
        });

        for (int i = 0; i < nums.length; i++) {
            pq.add(new Pair(nums[i], i));
        }

        while (k-- > 0) {
            Pair p = pq.poll();

            p.value *= multiplier;
            nums[p.index] = p.value;

            pq.add(p);
        }

        return nums;
    }
}