class Solution {
    public List<Integer> findPeaks(int[] m) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i+1<m.length;i++){
            if(m[i-1]<m[i]&&m[i]>m[i+1])
            list.add(i);
        }
        return list;
        
    }
}