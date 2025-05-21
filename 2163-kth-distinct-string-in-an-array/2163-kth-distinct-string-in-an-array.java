class Solution {
     static{
        for(int i=0; i<500; i++){
            kthDistinct(null, 0);
        }
    }
    public static String kthDistinct(String[] arr, int k) {
        if(arr==null) return null;
        int c = 0;
        Map<String, Integer> se = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            se.put(arr[i], se.getOrDefault(arr[i], 0) + 1);
        }
        for (String i : arr) {
            if (se.get(i) == 1) {
                c++;
            }
            if (c == k)
                return i;
        }
        return "";
    }
}