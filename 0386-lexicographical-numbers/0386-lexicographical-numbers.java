class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<10;i++)
        addElement(ans,i,n);
        return ans;
    }
    public static void addElement(List<Integer> ans,int c,int n){
        if(c>n) return;
        ans.add(c);
        for(int i=0;i<=9;i++){
            int num=c*10+i;
            if((num)<=n)
            addElement(ans,num,n);
            if(num>n) return;

        }
    }
}