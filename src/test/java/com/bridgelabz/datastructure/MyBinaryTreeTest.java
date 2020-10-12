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
}
