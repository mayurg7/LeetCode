class MyHashSet {
    
    
    List<Integer> s;
    public MyHashSet() {
        s = new ArrayList<>();
        
    }
    
    public void add(int key) {
        if(s.contains(key)==false){
            s.add(key);
        }
    }
    
    public void remove(int key) {
        if(s.contains(key)==true){
            s.remove(s.indexOf(key));
        }
    }
    
    public boolean contains(int key) {
        if(s.contains(key)){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */