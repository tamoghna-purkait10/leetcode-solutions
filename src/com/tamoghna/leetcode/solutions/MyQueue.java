package com.tamoghna.leetcode.solutions;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<Integer>();
        output = new Stack<Integer>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        peek();
        return output.pop();
    }
    
    public int peek() {
        if(output.empty()){
            while(!input.empty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        return input.empty() && output.empty();
    }
    
    public static void main(String[] args) {
    	
    	MyQueue mq = new MyQueue();
    	mq.push(1);
    	mq.push(2);
    	mq.push(3);
    	System.out.println(mq.peek());
    	System.out.println(mq.pop());
    	System.out.println(mq.pop());
    }
}
