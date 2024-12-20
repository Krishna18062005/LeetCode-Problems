class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(n-1>connections.length) return -1;
        int[] parent=new int[n];
        int c=0;
        for(int i=0;i<n;i++) parent[i]=i;
        for(int[] con:connections){
            parent[findParent(con[1],parent)]=findParent(con[0],parent);
        }
        int co=0;
        for(int i=0;i<n;i++){
            if(parent[i]==i) co++;
        }
        return co-1;
    }
    public static int findParent(int u,int parent[]){
        if(parent[u]==u ) return u;
        return parent[u]=findParent(parent[u],parent);
    }
    // public static boolean union(int u,int v,int parent[]){
    //     int pu=findParent(u,parent);
    //     int pv=findParent(v,parent);
    //     if(pu==pv) return false;
    //     parent[pu]=pv;
    //     return true;
    // }

}