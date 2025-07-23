class Solution {
    public int maximumGain(String s, int x, int y) {
        int p=0;
        char f='a';
        char se='b';
        if(x<y){
            f='b';
            se='a';
            x+=y;
            y=x-y;
            x=x-y;
        }


        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray()){
            if(i==se&&!st.isEmpty()&&st.peek()==f){
                st.pop();
                p+=x;
            }
            else{
                st.push(i);
              //  System.out.print(st);
            }
        }
       
       
        Stack<Character> sta=new Stack<>();
        while(!st.isEmpty()){
            char i=st.pop();
             if(i==se&&!sta.isEmpty()&&sta.peek()==f){
                sta.pop();
                p+=y;

            }  else sta.push(i); 
        }
        
        
        return p;
    }
}