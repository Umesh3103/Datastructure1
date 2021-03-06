package com.bridgelabz.datastructure;

import org.junit.Test;
import org.junit.Assert;


public class SortedLinkedListTest {
	@Test
	public void GivenNumber_WhenRemove_ShouldBeRemovedSortedList(){
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		SortedLinkedList sortedLinkedList= new SortedLinkedList();
		sortedLinkedList.add(myFirstNode);
		sortedLinkedList.add(mySecondNode);
		sortedLinkedList.add(myThirdNode);
		sortedLinkedList.add(myFourthNode);
		sortedLinkedList.printMyNodes();
		INode result=sortedLinkedList.remove(myThirdNode);
		Assert.assertEquals(myThirdNode,result);
	}
}
