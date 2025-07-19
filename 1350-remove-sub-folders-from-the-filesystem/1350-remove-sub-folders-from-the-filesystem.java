class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> ans=new ArrayList<>();
        String prev="";
        Arrays.sort(folder);
        prev=folder[0];
        ans.add(prev);
        for(int i=1;i<folder.length;i++){
            if(folder[i].startsWith(prev+"/")){
                continue;
            }
            else{
                prev=folder[i];
                ans.add(prev);
            }
        }
        return ans;

    }
}