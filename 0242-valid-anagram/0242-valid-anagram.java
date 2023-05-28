class Solution {
    public boolean isAnagram(String s, String t) {
        //Using HashMap
//         if(s.length()!=t.length()){
//             return false;
//         }
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             char sc =s.charAt(i);
//             char tc =t.charAt(i);
//             map.put(sc,map.getOrDefault(sc,0)+1);
//             map.put(tc,map.getOrDefault(tc,0)-1);
//         }
        
//         for(int i:map.values()){
//             if(i!=0){
//                 return false;
//             }
//         }
//         return true;
        
        //Using Array
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr= new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
            if(arr[t.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
        
    }
}