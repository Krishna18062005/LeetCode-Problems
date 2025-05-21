class Solution {
    public String kthDistinct(String[] arr, int k) {
        int c = 0;
        LinkedHashMap<String, Integer> se = new LinkedHashMap<>();
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