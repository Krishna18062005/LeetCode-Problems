class RandomizedSet {
    static Set<Integer> a;
    public RandomizedSet() {
        a=new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(a.contains(val)) return false;
        else{
            a.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(a.contains(val)){
            a.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int nu=0;
        int ind=new Random().nextInt(a.size());
        int c=0;
        for(int i:a){
            nu=i;
            c++;
            if(c==ind)
            break;
        }
        return nu;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */