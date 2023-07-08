class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        for(int i:nums){
            map.put(i,Boolean.FALSE);
        }
        
        for(int i : nums){
            int curr =1;
            int next = i+1;
            
            while(map.containsKey(next) && map.get(next) == false){
                curr++;
                map.put(next,Boolean.TRUE);
                next++;
            }
            int prev = i-1;
            while(map.containsKey(prev) && map.get(prev) == false){
                curr++;
                map.put(prev,Boolean.TRUE);
                prev--;
            }
            longest = Math.max(longest,curr);
        }
        return longest;
    }
}