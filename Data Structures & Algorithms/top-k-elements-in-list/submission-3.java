class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int n:nums) freq.put(n, freq.getOrDefault(n, 0) + 1);
        List<Integer>[] buckets = new List[nums.length+1];
        for(int i = 0; i<buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }
        for(int key: freq.keySet()){
            buckets[freq.get(key)].add(key);
        }
        int[] result = new int[k];
        int count = 0;
        int i = buckets.length-1;
        while(count<k){
            while(!buckets[i].isEmpty()){
                result[count] = buckets[i].remove(0);
                count++;
            }
            i--;
        }
        return result;

    }
}
