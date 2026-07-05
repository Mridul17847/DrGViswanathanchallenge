class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> help = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size() > 1){
            help.push(st.pop());
        }
        int front = st.pop();
        while(help.size()>0){
            st.push(help.pop());
        }
        return front;
    }
    
    public int peek() {
        while(st.size() > 1){
            help.push(st.pop());
        }
        int front = st.peek();
        while(help.size()>0){
            st.push(help.pop());
        }
        return front;
    }
    
    public boolean empty() {
        return (st.size() == 0);
    }
}
