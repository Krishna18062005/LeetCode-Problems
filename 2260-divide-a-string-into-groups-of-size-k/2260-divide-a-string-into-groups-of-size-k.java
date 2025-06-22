class Solution {
    public String[] divideString(String s, int k, char fill) {
        // String filler=fill+"";
        // int need=k-1;
        // while(need>=0){
        //     need--;
        //     filler+=fill;
        // }
      
        // int size=s.length()/k;
        // int req=(s.length()%k);
        // req=k-req;
        // if(req>0&&req!=k){ size+=1;
        // s=s+filler.substring(0,req+1);
        // }
        // String[] arr=new String[size];
        // for(int i=0;i<size;i++){
        //     arr[i]=s.substring(i*k,i*k+k);
        // }
        // return arr;

         StringBuilder str = new StringBuilder(s);
        while(str.length()%k!=0){
            str.append(fill);
        }
        String arr[]=new String[str.length()/k];
        for(int i=0;i<str.length()/k;i++){
            arr[i]=str.substring(i*k,(i+1)*k);
        }
        return arr;   
    }
}