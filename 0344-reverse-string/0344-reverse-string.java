class Solution {
//     public void reverseString(char[] s) {
//         reverse(s, 0, s.length-1);
//     }
    
//     public static void reverse(char[] s, int start, int end){
//         while(start<end){
//             char temp = s[start];
//             s[start] = s[end];
//             s[end] = temp;
//             start++;
//             end--;
//         }
//     }
    public void reverseString(char[] s){
        int start = 0;
        int end = s.length-1;
        
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}