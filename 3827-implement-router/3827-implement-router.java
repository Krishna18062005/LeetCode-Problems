class Router {
    Deque<int[]>que;
    HashMap<Integer,List<int[]>>map;
    int size;
    public Router(int memoryLimit) {
        que=new LinkedList<>();
        map=new HashMap<>();
        this.size=memoryLimit;
    }
    
    public boolean addPacket(int source, int destination, int timestamp) {
        
        if(!map.containsKey(destination)){
            map.put(destination,new ArrayList<>());
        }
        List<int[]>list=map.get(destination);
        int left=small(list,timestamp);
        
        if(list.size()!=0){
            // System.out.println(left);
            // for(int []a:list)System.out.println(Arrays.toString(a));
            for(int i=left;i<list.size() && list.get(i)[1]==timestamp;i++){
                // System.out.println(left);
                if(list.get(i)[0]==source)return false;
            }
        }
        map.get(destination).add(new int[]{source,timestamp});
        que.addLast(new int[]{source,destination,timestamp});
        if(que.size()>size){
            forwardPacket();
        }
        
        return true;
        
    }
    
    public int[] forwardPacket() {
        if(que.size()==0)return new int[0];
        int[]arr=que.pollFirst();
        // System.out.println(Arrays.toString(arr));
        map.get(arr[1]).remove(0);
        return arr;
    }
    
    public int getCount(int destination, int startTime, int endTime) {
        if(!map.containsKey(destination)){
            return 0;
        }
        List<int[]>list=map.get(destination);
        int left=small(list,startTime);
        int right=big(list,endTime);
        if(left>right)return 0;
        return right-left+1;
    }
    public int small(List<int[]>list,int start){
        int left=0;
        int right=list.size()-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(list.get(mid)[1]>=start){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public int big(List<int[]>list,int end){
        int left=0;
        int right=list.size()-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(list.get(mid)[1]>end){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return right;
    }
}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */