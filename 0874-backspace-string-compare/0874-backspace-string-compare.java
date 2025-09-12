class Solution {
    public boolean backspaceCompare(String st, String t) {
        Stack<Character> f=new Stack<>();
        Stack<Character> s=new Stack<>();
        for(char i:st.toCharArray()) {
            if(i!='#') f.push(i);
            else if(!f.empty())f.pop();
        }
        for(char i:t.toCharArray()) {
            if(i!='#') s.push(i);
            else if(!s.empty())s.pop();
        }
        while(!s.empty()&&!f.empty()){
            if(s.pop()!=f.pop()) return false;
        }
        if(s.empty()&&!f.empty()) return false;
        if(!s.empty()&&f.empty()) return false;
        return true;

    }
}