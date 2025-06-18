class Solution {
    public String generateTag(String caption) {
        StringBuilder str=new StringBuilder("#");
        String arr[]=caption.trim().split("\\s+");
        if(arr.length!=0){
        arr[0]=arr[0].toLowerCase();
        str.append(arr[0]);
        }
        else return "#";
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i].toLowerCase();
            arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
            str.append(arr[i]);
        }
        
        return str.length()>100?str.toString().substring(0,100):str.toString();
    }
}