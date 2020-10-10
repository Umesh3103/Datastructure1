package com.bridgelabz.datastructure;

import org.junit.Test;

import org.junit.Assert;;

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
}
