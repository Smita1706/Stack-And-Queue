package com.bridgelabz.stackandqueue;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

	@Test
	public void given3NumberWhenAddedToQueue_ShouldHaveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enque(myFirstNode);
		myQueue.enque(mySecondNode);
		myQueue.enque(myThirdNode);
		myQueue.printQueue();
		INode myNode = myQueue.peek();
		Assert.assertEquals(myFirstNode, myNode);
	}
	
	@Test
	public void given3NumberInQueuekWhenPopped_ShouldMatchWithLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enque(myFirstNode);
		myQueue.enque(mySecondNode);
		myQueue.enque(myThirdNode);
		INode pop = myQueue.dequeue();
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, pop);
	}
}
