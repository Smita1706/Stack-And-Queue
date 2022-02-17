package com.bridgelabz.stackandqueue;

public class MyQueue {
	private final MyLinkedList myLinkedList;
	private final MyStack myStack;
	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
		this.myStack = new MyStack();
	}
	public void enque(INode newNode) {
		myLinkedList.apend(newNode);;
	}
	
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
	public INode peek() {
		return  myLinkedList.head;		
	}
	public INode dequeue() {
		return myLinkedList.pop();
	}
}
