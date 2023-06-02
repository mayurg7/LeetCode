class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int a = 1;
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=a;
            a++;
        }
        List<List<Integer>> result = new ArrayList<>();
        Comb(result,new ArrayList<>(),nums,0,k);
        return result;
    }
    
    private void Comb(List<List<Integer>> ans,List<Integer> temp , int[] nums,int start, int k){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            Comb(ans,temp,nums,i+1,k);
            temp.remove(temp.size()-1);
        }
    }
}