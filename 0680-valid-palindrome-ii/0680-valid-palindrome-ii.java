class Solution {
    public boolean validPalindrome(String s) {
        int count1 = 0;
        int count2 = 0;
        
        int start = 0;
        int end = s.length()-1;
        
        while(start<end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                start++;
                count1++;
            }
        }
        start = 0;
         end = s.length()-1;
        
        
        while(start<end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                end--;
                count2++;
            }
        }
        
        if(count1==0 || count2 == 0){
            return true;
        }
        
        if(count1==1 || count2 == 1){
            return true;
        }
        return false;
    }
}