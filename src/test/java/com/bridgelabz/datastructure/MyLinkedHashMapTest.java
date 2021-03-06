package com.bridgelabz.datastructure;

import org.junit.Test;
import org.junit.Assert;

public class MyLinkedHashMapTest {
	
	@Test
	public void GivenASentence_WhenAddedToList_ShouldReturnParanoidFrequency(){
		String sentence = "Paranoids are not paranoid beacuse they are paranoid but"+
						" bcz they keep putting themselves into "+
						"paranoid avoidable situations";
		MyLinkedHashMap<String,Integer> myLinkedHashMap= new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word: words){
			Integer value = myLinkedHashMap.get(word);
			if(value==null){
				value=1;
			}
			else{
				value = value + 1;
			}
			myLinkedHashMap.add(word,value);
		}	
		int frequency=myLinkedHashMap.get("paranoid");
		System.out.println(myLinkedHashMap);
		Assert.assertEquals(3, frequency);
	}
	@Test
	public void GivenASentence_WhenRemovedFromHashMap_ShouldBeRemovedFromTheMap(){
		String sentence = "Paranoids are not paranoid beacuse they are paranoid but"+
						" bcz they keep putting themselves into "+
						"paranoid avoidable situations";
		MyLinkedHashMap<String,Integer> myLinkedHashMap= new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word: words){
			Integer value = myLinkedHashMap.get(word);
			if(value==null){
				value=1;
			}
			else{
				value = value + 1;
			}
			myLinkedHashMap.add(word,value);
		}	
		INode result=myLinkedHashMap.remove("avoidable");
		Assert.assertEquals("avoidable", result.getKey());
	}
}
