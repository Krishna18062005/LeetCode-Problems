public class Solution {
    public boolean isValid(String str) {
        Stack<Character> sym=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='{'){
                sym.push('}');
            }
           else if(ch=='('){
                sym.push(')');
            }
            else if(ch=='['){
                sym.push(']');
            }
            else if(sym.isEmpty()){
                return false;
            }
            else if(!sym.isEmpty()&&sym.peek()==ch){
                sym.pop();
            }
            else{
                return false; 
            }
            
        }
        return sym.isEmpty();

    }
}