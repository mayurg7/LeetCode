class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();
        
        for(String s : tokens){
            if(s.equals("+")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int sum = temp1+temp2;
                stack.push(sum);
            }else if(s.equals("-")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int minus = temp2-temp1;
                stack.push(minus);
            }else if(s.equals("*")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int multi = temp1*temp2;
                stack.push(multi);
            }else if(s.equals("/")){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int div = temp2/temp1;
                stack.push(div);
            }else{
                int val = Integer.parseInt(s);
                stack.push(val);
            }
        }
        if(!stack.isEmpty()){
            return stack.pop();
        }
        return 0;
    }
}