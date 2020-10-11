package com.bridgelabz.datastructure;

public class MyQueue {

	private MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}

	public void printQueue() {
		myLinkedList.printMyNodes();
	}

	public INode top() {
		return myLinkedList.head;
	}

	public INode dequeue() {
		return myLinkedList.pop();
	}

	public void size() {
		System.out.println(myLinkedList.size());
	}
}
