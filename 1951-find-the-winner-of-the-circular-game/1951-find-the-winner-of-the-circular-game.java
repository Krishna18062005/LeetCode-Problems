class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> lst=new ArrayList<>();

        for(int i=1;i<=n;i++) lst.add(i);
       int id=0;
       while(lst.size()>1){
           id=(id+k-1)%lst.size();
           lst.remove(id);
       }
        return lst.get(0);
    }
}