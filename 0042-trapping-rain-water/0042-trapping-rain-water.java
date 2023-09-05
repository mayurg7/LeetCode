class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int totalwater = 0;
        int max = 0;
        
        for(int i=0;i<n;i++){
            max = Math.max(max,height[i]);
            left[i] = max;
        }
        
        max = 0;
         for(int i=n-1;i>=0;i--){
            max = Math.max(max,height[i]);
            right[i] = max;
        }
        for(int i=n-1;i>=0;i--){
            int water = Math.min(left[i],right[i])-height[i];
            totalwater += water;
        }
        return totalwater;
    }
}