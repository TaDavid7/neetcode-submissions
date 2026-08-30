class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i: nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length+1];
        for(int key: freq.keySet()){
            int count = freq.get(key);
            if(buckets[count] == null){
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(key);
        }

        int[] result = new int[k];
        int index = 0;
        for(int i = buckets.length-1; i>=1; i--){
            if(buckets[i] == null){
                continue;
            }
            else if(index == k){
                break;
            }
            for(int val: buckets[i]){
                result[index] = val;
                index++;
            }
        }
        return result;
    }
}
