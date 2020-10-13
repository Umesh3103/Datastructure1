package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.List;

public class SortedLinkedList<K> {
	public INode head;
	public INode tail;
	
	public SortedLinkedList() {
		this.head =null;
		this.tail = null;
	}

	public void add(INode newNode){
		if(this.head==null){
			newNode.setNext(head);
			this.head=newNode;
		}
		if(this.tail==null){
			this.tail=newNode;
		}
		else if(size()==1){
			if((int)head.getKey()>(int) newNode.getKey()){
				newNode.setNext(head);
				this.head=newNode;
			}
		}
		else{
			INode tempNode=this.head;
			while(tempNode.getNext()!=null && (int)tempNode.getNext().getKey()< (int) newNode.getKey()){
				tempNode=tempNode.getNext();
			}
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);
		}
	}
	public void printMyNodes(){
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while(tempNode.getNext()!=null){
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode=tempNode.getNext();
		}
		myNodes.append("->");
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
	public INode<K> search(K key) {
		INode tempNode=head;
		while(tempNode!=null && tempNode.getNext()!=null){
			if(tempNode.getKey().equals(key)){
				return tempNode;
			}
			tempNode=tempNode.getNext();
		}
		return tempNode;
	}
	
	public INode remove(INode myNode) {
		INode tempNode = search((K) myNode.getKey());
		INode tempNode1=head;
		while(!tempNode1.getNext().getKey().equals(myNode.getKey())){
			tempNode1=tempNode1.getNext();
		}
		tempNode1.setNext(tempNode.getNext());
		return tempNode;
		
	}
	public int size() {
		if(head==null){
			return 0;
		}
		else{
			int count=1;
			INode tempNode=head;
			while(tempNode.getNext()!=null){
				tempNode=tempNode.getNext();
				count++;
			}
			return count;
		}	
		
	}
	public boolean isEmpty(){
		if(head==null){
			return true;
		}
		return false;
	}
	public int index(INode myNode){
		INode tempNode=head;
		int count=1;
		while(tempNode!=null && tempNode.getNext()!=null){
			if(tempNode.getKey().equals(myNode.getKey())){
				return count;
			}
			tempNode=tempNode.getNext();
		}
		return count;
	}
}
