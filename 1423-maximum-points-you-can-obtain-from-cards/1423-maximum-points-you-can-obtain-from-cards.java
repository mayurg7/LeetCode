class Solution {

     public int maxScore(int[] cardPoints, int k) {
        int result=0;

        int n=cardPoints.length;
        
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int leftIndex = k-1;
        if(leftIndex == n-1) return sum;

        int rightIndex = n-1;
        int rightSum = 0; 
        int leftSum = 0; 

        while(k-->0 && leftIndex < rightIndex){
            rightSum += cardPoints[rightIndex--];
            leftSum += cardPoints[leftIndex--];
            if(rightSum > leftSum){
                sum-=leftSum;
                sum+=rightSum; 
                leftSum=0;
                rightSum=0;
            }
        }
        return sum;
    }
}