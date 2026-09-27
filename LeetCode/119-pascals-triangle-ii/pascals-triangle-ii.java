class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> result = new ArrayList<>();
        int n = rowIndex + 1;
        for (int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for (int j=0;j<=i;j++){
                if (j==0 || j==i){
                    row.add(1);
                }else {
                    int value = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    row.add(value);
                }
            }
            if(i==rowIndex){
               return row;
            }
            result.add(row);
        }
        return new ArrayList<>(0);
    }
}