class MinStack {
    int min;
    Stack <Integer> s;
    Stack<Integer> m;
    public MinStack(){
        s=new Stack<>();
        m=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(m.isEmpty()||m.peek()>=val){
            m.push(val);
        }
    }
    
    public void pop() {
        if(s.isEmpty()) return;
        int top=s.pop();
        if(top==m.peek()){
            m.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        
        return m.peek();
    }
}
