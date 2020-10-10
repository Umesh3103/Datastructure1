package com.bridgelabz.datastructure;

import org.junit.Test;

import org.junit.Assert;

public class MyLinkedListTest {
	
	@Test
	public void Given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToTop(){
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		boolean result = myLinkedList.head.equals(myThirdNode)&&
						 myLinkedList.head.getNext().equals(mySecondNode)&&
						 myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}	
	@Test
	public void Given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToLast(){
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		boolean result = myLinkedList.head.equals(myFirstNode)&&
						 myLinkedList.head.getNext().equals(mySecondNode)&&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}	
	@Test
	public void GivenANumber_WhenInsertingInBetween_ShouldPass(){
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode,mySecondNode);
		boolean result = myLinkedList.head.equals(myFirstNode)&&
						 myLinkedList.head.getNext().equals(mySecondNode)&&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}	
	@Test
	public void Given3Number_WhenDeletingANode_ShouldBeFirstNode(){
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode result=myLinkedList.pop();
		Assert.assertEquals(myFirstNode,result);
	}	
	@Test
	public void Given3Number_WhenDeletingANode_ShouldBeLastNode(){
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode result=myLinkedList.popLast();
		Assert.assertEquals(myThirdNode,result);
	}	
	@Test
	public void Given3Number_WhenSearchingANodeLinkedList_ShouldBeFound(){
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode result=myLinkedList.search(mySecondNode.getKey());
		Assert.assertEquals(mySecondNode,result);
	}	
	@Test
	public void GivenANumber_WhenInsertingInBetween_ShouldPassTest(){
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myFourthNode);
		myLinkedList.insert(mySecondNode,myThirdNode);
		boolean result = myLinkedList.head.equals(myFirstNode)&&
						 myLinkedList.head.getNext().equals(mySecondNode)&&
						 myLinkedList.head.getNext().getNext().equals(myThirdNode)&&
						 myLinkedList.tail.equals(myFourthNode);
		Assert.assertTrue(result);
	}	
}
