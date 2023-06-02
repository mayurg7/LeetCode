class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        generateComb(result,new ArrayList<>(),candidates,0,target);
        return result;
    }
    
    private void generateComb(List<List<Integer>> list, List<Integer> temp, int[] nums,int start,int target){
        if(target==0){
             list.add(new ArrayList<>(temp));
        }
        if(target<0){
            return;
        }
        
        
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            generateComb(list,temp,nums,i,target-nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}