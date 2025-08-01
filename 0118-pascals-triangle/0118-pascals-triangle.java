class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> ral = new ArrayList<>();

        for(int i =0; i< numRows; i++){
            List<Integer> nal = new ArrayList<>();
            for(int j =0; j<= i; j++){
                if(j==0 || j == i){
                    nal.add(1);
                }else{
                    nal.add(ral.get(j-1) + ral.get(j));
                }
            }
            al.add(nal);
            ral=nal;
        }
        return al;
    }
}