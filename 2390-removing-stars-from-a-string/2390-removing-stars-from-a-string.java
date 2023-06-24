class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char i : s.toCharArray()){
            if( i== '*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(i);
            }
        }
        
        StringBuilder b = new StringBuilder();
        while(!stack.isEmpty()){
            b.append(stack.pop());
        }
        
        return b.reverse().toString();
    }
}