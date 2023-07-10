class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        String s = strs[0];
        String t = strs[strs.length-1];
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                sb.append(s.charAt(i));
                i++;
                j++;
            }else{
                break;
            }
        }
        return sb.toString();
    }
}