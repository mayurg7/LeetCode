class Solution {
    public void moveZeroes(int[] nums) {
        int insert = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[insert] = nums[i];
                insert++;
            }
        }
        
        while(insert<nums.length){
            nums[insert] = 0;
            insert++;
        }
    }
}