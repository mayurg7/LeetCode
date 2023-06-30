class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int max_length = 0;
        int  max_count = 0;
        
        int[] arr = new int[26];
        
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
            max_count = Math.max(max_count,arr[s.charAt(i)-'A']);
            
            
            while(i-start-max_count+1>k){
                arr[s.charAt(start)- 'A']--;
                start++;
            }
            
            max_length = Math.max(max_length,i-start+1);
        }
        return max_length;
    }
}