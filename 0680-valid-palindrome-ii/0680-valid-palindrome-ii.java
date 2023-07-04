class Solution {
    public boolean validPalindrome(String s) {
        
        if(s.length()<=1){
            return true;
        }
        int count1 = 0;
        int count2 =0 ;
        int i=0;
        int j = s.length()-1;
        
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                i++;
                count1++;
            }else{
                i++;
                j--;
            }
        }
        
        i = 0;
        j = s.length()-1;
        
        
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                j--;
                count2++;
            }else{
                i++;
                j--;
            }
        }
        
        
        if(count1== 1 || count2 == 1) return true;
        if(count1== 0 || count2 == 0) return true;
        
        return false;
    }
}