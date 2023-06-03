class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result,new ArrayList<>(),  nums, 0 );
        return result;
    }
    
    private void backtrack(List<List<Integer>> ans, List<Integer> temp , int[] nums, int start){
        if(ans.contains((temp))){
            return;
        }
        ans.add(new ArrayList<>(temp));
        for(int i = start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(ans,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}