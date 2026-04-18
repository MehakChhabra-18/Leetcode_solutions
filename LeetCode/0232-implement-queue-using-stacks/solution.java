class MyQueue {
    Stack<Integer> a=new Stack<>();
    Stack<Integer> b=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        a.push(x);
    }
    
    public int pop() {
        while(!a.isEmpty())
        {
            b.push(a.pop());
        }
        int val=b.pop();
        while(!b.isEmpty())
        {
            a.push(b.pop());
        }
        return val;
    }
    
    public int peek() {
      while(!a.isEmpty())
        {
            b.push(a.pop());
        }
        int val=b.peek();
        while(!b.isEmpty())
        {
            a.push(b.pop());
        }
        return val;
    }
    
    public boolean empty() {
        if(a.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
