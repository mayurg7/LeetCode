class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int left = 0;
        int right = 0;
        int max = 0;
        
        while(right<s.length()){
            Character sc = s.charAt(right);
            if(set.add(sc)){
                max = Math.max(right-left+1,max);
                right++;
            }else{
                while(s.charAt(left) != sc){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(sc);
                left++;
            }
        }
        return max;
    }
}