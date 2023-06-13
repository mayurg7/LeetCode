class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        
        for(String email: emails){
            int split_position = email.indexOf("@");
            String local_name = email.substring(0,split_position);
            String domain_name = email.substring(split_position);
            
            if(local_name.contains("+")){
                int plus = local_name.indexOf("+");
                local_name = local_name.substring(0,plus);
            }
            
            local_name = local_name.replaceAll("\\.","");
            
            String new_name = local_name+domain_name;
            set.add(new_name);
        }
        return set.size();
    }
}