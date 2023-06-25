import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        
        map.put(nums2[nums2.length-1],-1);
        stack.push(nums2[nums2.length-1]);
        
        
        for(int i = nums2.length-2;i>=0;i--){
            
            if(nums2[i]<stack.peek()){
                map.put(nums2[i],stack.peek());
                stack.push(nums2[i]);
                continue;
            }
            
            while( !stack.isEmpty() && nums2[i]>stack.peek()){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                stack.push(nums2[i]);
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],stack.peek());
                stack.push(nums2[i]);
            }
        }
        
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = map.get(nums1[i]);
        }
        
        return nums1;
    }
}