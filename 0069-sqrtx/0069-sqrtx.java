class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        
        while(left<=right){
            long mid = left + (right-left)/2;
            long square = mid*mid;
            
            if(square == x){
                return (int)mid;
            }else if(square>x){
                right = (int)mid-1; 
            }else{
                left = (int)mid+1;
            }
        }
        return left-1;
    }
}