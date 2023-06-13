class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0 || strs==null){
            return new ArrayList<>();
        }
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        
        for(String i:strs){
            
            String freq = getFreq(i);
            
            if(map.containsKey(freq)){
                map.get(freq).add(i);
            }else{
                List<String> strList = new ArrayList<>();
                strList.add(i);
                map.put(freq,strList);
            }
        }
        return new ArrayList<>(map.values());
    }
    
    
    private String getFreq(String str){
        int[] freq = new int[26];
        
        for(char c: str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder result = new StringBuilder();
        char c = 'a';
        for(int i:freq){
            result.append(c);
            result.append(i);
            c++;
        }
        return result.toString();
    }
}