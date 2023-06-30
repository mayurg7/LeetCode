class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int size = 0;
        HashSet<Character> set = new HashSet<>();
        
        while(right<s.length()){
            char c = s.charAt(right);
            if(set.add(c)){
                size = Math.max(size,right-left+1);
                right++;
            }else{
                while(s.charAt(left) != c){
                set.remove(s.charAt(left));
                left++;
            }
            set.remove(c);
            left++;
        }
        }
        return size;
    }
}