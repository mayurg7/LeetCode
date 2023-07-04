class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(int i: map.keySet()){
            int freq = map.get(i);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            
            bucket[freq].add(i);
        }
        
        int[] result = new int[k];
        int count = 0;
        
        for(int i=bucket.length-1;i>=0 && count<k ;i--){
            if(bucket[i] != null){
                for(int p : bucket[i]){
                    result[count++] = p;
                }
            }
        }
        return result;
    }
}