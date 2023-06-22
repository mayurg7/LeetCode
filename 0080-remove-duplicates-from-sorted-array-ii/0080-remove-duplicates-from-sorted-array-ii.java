class Solution {
    public int removeDuplicates(int[] nums) {
        int mid = 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i] != nums[mid-2]){
                nums[mid] = nums[i];
                mid++;
               
            }
        }
        return mid;
    }
}