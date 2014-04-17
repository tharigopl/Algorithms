package com.rozar.random.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
	
	public interface hello{
		int number = 2;
	}

	public static void main(String[] args) {
		
		hello ref = new hello(){
			
		};
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Deepak");
		list.add("Rosario");
		list.add("Pancras");
		
		List<String> unmodifiableList = Collections.unmodifiableList(list);
		
		list.add("Tharigopla");
		
		//unmodifiableList.add("Tharigopla");
		
		for(String str : unmodifiableList){
			System.out.println(str);
		}
		
		System.out.println(UnmodifiableList.str);
		
	}
	
	static List<String> str = new ArrayList<String>(){
		@Override
		public void add(int index, String element) {
			// TODO Auto-generated method stub
			str.add("Rosario");
		}
	};
	

}
