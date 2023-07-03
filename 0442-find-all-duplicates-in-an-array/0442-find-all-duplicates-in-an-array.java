class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i])-1;
            
            if(nums[idx]<0){
                arr.add(Math.abs(nums[i]));
            }
            
            nums[idx] = -nums[idx];
        }
        return arr;
    }
}