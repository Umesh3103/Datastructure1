package com.bridgelabz.datastructure;

import org.junit.Assert;
import org.junit.Test;


public class MyBinaryTreeTest {

	@Test
	public void Given3Numbers_WhenAddedToBinaryTree_ShouldReturnSize3(){
		
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(3,size);
	}
	@Test
	public void GivenManyNumbers_WhenAddedToBinaryTree_ShouldReturnSizeAccordingly(){
		
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(40);
		myBinaryTree.add(22);
		myBinaryTree.add(11);
		myBinaryTree.add(16);
		myBinaryTree.add(3);
		myBinaryTree.add(95);
		myBinaryTree.add(60);
		myBinaryTree.add(65);
		myBinaryTree.add(67);
		myBinaryTree.add(63);
		
		int size = myBinaryTree.getSize();
		Assert.assertEquals(13,size);
	}
	@Test
	public void GivenANumber_WhenSearchingInBinaryTree_ShouldReturnTrue(){
		
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(40);
		myBinaryTree.add(22);
		myBinaryTree.add(11);
		myBinaryTree.add(16);
		myBinaryTree.add(3);
		myBinaryTree.add(95);
		myBinaryTree.add(60);
		myBinaryTree.add(65);
		myBinaryTree.add(67);
		myBinaryTree.add(63);
		
		boolean result =myBinaryTree.search(63);
		Assert.assertEquals(true,result);
	}
}
