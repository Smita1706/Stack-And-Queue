package com.bridgelabz.stackandqueue;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

	@Test
	public void given3NumberWhenAddedToStack_ShouldHaveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peak();
		System.out.println(myNode);
		myStack.printStack();
		Assert.assertEquals(myThirdNode, myNode);
	}
	
	@Test
	public void given3NumberInStackWhenPopped_ShouldMatchWithLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode pop = myStack.pop();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, pop);
	}
}
