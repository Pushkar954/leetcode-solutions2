class Solution {
    public int calPoints(String[] operations) {
       int tot=0;
       Stack<Integer> st=new Stack<>();

       for(int i=0;i<operations.length;i++){
        String b=operations[i];
            if(b.equals("+")){
                int val1=st.pop();
                int val2=st.pop();
                int newk=val1+val2;
                st.push(val2);
                st.push(val1);
                st.push(newk);
            }else if(b.equals("C")){
                st.pop();
            }else if(b.equals("D")){
                st.push(2*st.peek());
            }else{
                st.push(Integer.parseInt(b));
            }
       } 
       while(st.size()>0){
        tot+=st.pop();
       }
       return tot;
    }
}