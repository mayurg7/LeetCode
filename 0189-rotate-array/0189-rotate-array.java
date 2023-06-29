class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int start = 0;
        int end = nums.length-1;
        reverse(nums,start,end);
        reverse(nums,start,k-1);
        reverse(nums,k,end);
    }
    
    private static void reverse(int[] nums , int start, int end){
        while(start<end){
        int temp  = nums[start];
        nums[start]= nums[end];
        nums[end] = temp;
        start++;
        end--;   
        }
    }
}