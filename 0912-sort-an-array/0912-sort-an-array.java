class Solution {
    
    // Min Heap
//     public int[] sortArray(int[] nums) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
        
//         for(int i : nums){
//             pq.offer(i);
//         }
//         int i=0;
//         while(!pq.isEmpty()){
//             nums[i] = pq.poll();
//             i++;
//         }
//         return nums;
//     }
    
//     public int[] sortArray(int[] nums){
        

//         mergeSort(nums,0,nums.length);
//         return nums;
//     }
    
//     private void mergeSort(int[] nums, int start, int end){
        
//         if(end-start==1){
//             return;
//         }
//         int mid = end-start/2;
        
//         mergeSort(nums,start,mid);
//         mergeSort(nums,mid,end);
//         merge(nums,start,mid,end);
//     }
    
//     private void merge(int[] nums,int start, int mid, int end){
//         int i = start;
//         int j = mid;
//         int k = 0;
        
//         int[] merged = new int[end-start];
        
//         while(i<mid && j<end){
//             if(nums[i]<nums[j]){
//                 merged[k++] = nums[i++];
//             }else{
//                 merged[k++] = nums[j++];
//             }
//         }
        
//         while(i<mid){
//             merged[k++] = nums[i++];
//         }
//         while(j<end){
//             merged[k++] = nums[j++];
//         }
        
//         for(int idx=0;idx<merged.length;idx++){
//             nums[start+idx] = merged[idx];
//         }
//     }
    public int[] sortArray(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        
        int k =0;
        
        for(int i=min;i<=max;i++){
            while(map.getOrDefault(i,0)>0){
                nums[k] = i;
                k++;
                map.put(i,map.getOrDefault(i,0)-1);
            }
        }
        return nums;
    }
    
}