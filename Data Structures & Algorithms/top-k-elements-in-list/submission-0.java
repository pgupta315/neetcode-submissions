class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new ArrayList[nums.length + 1];

        for (int n : nums) {
            count.merge(n, 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (freq[entry.getValue()] == null) {
                freq[entry.getValue()] = new ArrayList<>();
            }
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length-1; i>=0; i--) {
            if (freq[i] != null && !freq[i].isEmpty()) {
                for (int num: freq[i]) {
                    res[index++] = num;
                    if (index == k) {
                        return res;
                    }
                }
            }
        }
        return res;
    }

}
