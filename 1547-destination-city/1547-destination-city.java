class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>(); 
        for (List<String> path : paths) {
            cities.add(path.get(0)); 
        }
        
        for (List<String> path : paths) {
            String dest = path.get(1); 
            if (!cities.contains(dest)) {
                return dest; 
            }
        }
        return "";
    }
}