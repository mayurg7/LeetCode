class Solution {
    public int arrangeCoins(int n) {
        int row = 0;
        while(n>0){
            row++;
            n = n-row;
        }
        return n==0 ? row : row-1;
    }
}