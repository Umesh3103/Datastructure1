package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
	@Test
	public void Given3Numbers_WhenAddedToQueue_ShouldBeAddedInAddingOrder(){
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		myQueue.printQueue();
		INode top = myQueue.top();
		Assert.assertEquals(myFirstNode, top);
	}
}
