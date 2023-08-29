class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String i : strs){
            String freq = getfreq(i);
            if(map.containsKey(freq)){
                map.get(freq).add(i);
            }else{
                List<String> strlist = new ArrayList<>();
                strlist.add(i);
                map.put(freq,strlist);
            }
        }
        return new ArrayList<>(map.values());
    }
    
    private String getfreq(String s){
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        char c = 'a';
        for(int i:arr){
            sb.append(c);
            sb.append(i);
            c++;
        }
        return sb.toString();
    }
}