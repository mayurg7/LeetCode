class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        
        for(int i:pushed){
            stack.push(i);
            while(!stack.isEmpty() && stack.peek() == popped[j] && j<popped.length){
                stack.pop();
                j++;
            }
        }
        return j==popped.length;
    }
}