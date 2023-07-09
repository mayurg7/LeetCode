class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String i : tokens){
            if(i.equals("+")){
                int temp = stack.pop();
                int temp2 = stack.pop();
                int sum  = temp + temp2;
                stack.push(sum);
            }else if(i.equals("-")){
                int temp = stack.pop();
                int temp2 = stack.pop();
                int sum  = temp2 - temp;
                stack.push(sum);
            }else if(i.equals("*")){
                int temp = stack.pop();
                int temp2 = stack.pop();
                int sum  = temp * temp2;
                stack.push(sum);
            }else if(i.equals("/")){
                int temp = stack.pop();
                int temp2 = stack.pop();
                int sum  = temp2 / temp;
                stack.push(sum);
            }else{
                int val = Integer.parseInt(i);
                stack.push(val);
            }
        }
        return stack.peek();
    }
}