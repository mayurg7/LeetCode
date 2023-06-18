class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        int longest = 0;
        
        for(int i: nums){
            map.put(i,Boolean.FALSE);
        }
        
        for(int i : nums){
            int cur = 1;
            int nextnum = i+1;
            
            while(map.containsKey(nextnum) && map.get(nextnum)==false){
                
                cur++;
                map.put(nextnum,Boolean.TRUE);
                nextnum++;
                
            }
            
            int prevsum = i-1;
            
            while(map.containsKey(prevsum) && map.get(prevsum)==false){
                cur++;
                map.put(prevsum,Boolean.TRUE);
                prevsum--;
            }
            
            longest=Math.max(longest,cur);  
        }
        return longest;
    }
    
}