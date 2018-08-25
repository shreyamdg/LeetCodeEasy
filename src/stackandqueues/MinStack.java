package stackandqueues;

import java.util.Stack;

class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // only push the old minimum value when the current 
        // minimum value changes after pushing the new value x
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value, 
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

class MinStackAnotherway {
    class ListNode{
        int data;
        int min;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.min = data;
        }
    }
    
    ListNode head;

    /** initialize your data structure here. */
    public MinStackAnotherway() {
        head = null;
    }
    
    public void push(int x) {
        ListNode newval = new ListNode(x);
        if(head == null){
            head = newval;
        }else{
            newval.min = Math.min(x, head.min);
            newval.next = head;
            head = newval;
        }
    }
    
    public void pop() {
        if(head == null){
            return;
        }
        head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head.min;
    }
}