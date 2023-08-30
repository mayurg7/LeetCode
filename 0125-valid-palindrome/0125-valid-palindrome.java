class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)) ){
                sb.append(s.charAt(i));
            }
        }
        
        int j = sb.length()-1;
        
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }else{
                j--;
            }
        }
        return true;
    }
}