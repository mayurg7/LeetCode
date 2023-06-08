class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows ==0 ) return result;
        
        result.add(Arrays.asList(1));
        
        for(int i=1;i<numRows;i++){
            List<Integer> resultset = new ArrayList<>();
            resultset.add(1);
            List<Integer> prev = result.get(i-1);
            for(int j=1;j<i;j++){
                resultset.add(prev.get(j-1)+prev.get(j));
            }
            
            resultset.add(1);
            
            result.add(resultset);
        }
        
        return result;
    }
}