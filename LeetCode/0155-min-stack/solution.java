class MinStack {
    class Node
    {
        int val;
        int min;
        Node next;
        Node(int val,int min)
        {
            this.val=val;
            this.min=min;
        }
    }

    private Node top;
    public MinStack() {
        top=null;
    }
    
    public void push(int value) {
        if(top==null)
        {
            top=new Node(value,value);
        }
        else
        {
            Node newNode=new Node(value,Math.min(value,top.min));
            newNode.next=top;
            top=newNode;
        }
        
    }
    
    public void pop() {
        if(top==null) return;
        top=top.next;
        
    }
    
    public int top() {
        if(top==null) return -1;
        return top.val;
    }
    
    public int getMin() {
        if(top==null) return -1;
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
