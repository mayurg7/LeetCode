class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String i : strs){
            String freq = getFreq(i);
            
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
    
    private static String getFreq(String s){
        StringBuilder sb = new StringBuilder();
        
        int[] freq = new int[26];
        
        for(char i : s.toCharArray()){
            freq[i-'a']++;
        }
        
        char c = 'a';
        
        for(int i : freq){
            sb.append(c);
            sb.append(i);
            c++;
        }
        return sb.toString();
    }
}