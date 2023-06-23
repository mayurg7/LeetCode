class Solution {
    public int maxVowels(String s, int k) {
        int res = 0;
        int l = 0;
        int r = 0;
        int window = 0;
        
        for(int i=0;i<k;i++){
                window += isVowel(s.charAt(i));
        }
        res = window;
        
        for(int i=k;i<s.length();i++){
            window -= isVowel(s.charAt(i-k));
            window += isVowel(s.charAt(i));
            res =Math.max(window,res);
        }
        return res;
        
    }
    
    private int isVowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')?1:0;
    }
}