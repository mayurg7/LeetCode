class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map =new HashMap<>();
        String[] words = s.split(" ");
        
        if(pattern.length() != words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char sc = pattern.charAt(i);
            if(map.containsKey(sc)){
                if(!map.get(sc).equals(words[i])){
                    return false;
                }
            }else{
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(sc,words[i]);
            }
        }
        return true;
    }
}