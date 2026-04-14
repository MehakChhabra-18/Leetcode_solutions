class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> minSt=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(!minSt.isEmpty() && minSt.peek()<val)
        {
            minSt.push(minSt.peek());
        }
        else
        {
            minSt.push(val);
        }
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
