class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String i : tokens){
            if("+-*/".contains(i)){
                int b=st.pop();
                int a=st.pop();
                switch(i){
                    case "+":
                    st.push(a+b);
                    break;
                    case "-":
                    st.push(a-b);
                    break;
                    case "*":
                    st.push(a*b);
                    break;
                    case "/":
                    st.push(a/b);
                    break;
                }

            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        return st.pop();
    }
}