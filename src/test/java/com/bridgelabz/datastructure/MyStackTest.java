package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.Test;;

public class MyStackTest {
	@Test
	public void Given3Numbers_WhenAddedToStack_ShouldBeLastAddedNode(){
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		INode peak = myStack.peek();
		Assert.assertEquals(myThirdNode, peak);
	}
}
