class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        if(operations.length == 0){
            return 0;
        }

        for(String i : operations){
            if(i.equals("C")){
                stack.pop();
            }else if(i.equals("D")){
                int sum = 2*stack.peek();
                stack.push(sum);
            }else if(i.equals("+")){
                int prev = stack.pop();
                int prev1 = stack.pop();
                int temp = prev+prev1;
                stack.push(prev1);
                stack.push(prev);
                stack.push(temp);
            }else{
                int val = Integer.parseInt(i);
                stack.push(val);
            }
        }
        int ans = 0;
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans;
    } 
}