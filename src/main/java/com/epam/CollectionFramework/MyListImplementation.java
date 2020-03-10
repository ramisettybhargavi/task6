package com.epam.CollectionFramework;

public class MyListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList<String> ml = new MyList<String>();
		//adding elements
		ml.add("Delhi");
		ml.add("Mumbai");
		ml.add("Hyderabad");
		ml.add("India");
		ml.add("Chennai");
		ml.add("Banglore");
		
		//printing list and size
		System.out.println("List is "+ ml);
		System.out.println("Size of the list is " +ml.size());
		
		//removing an element
		ml.remove(4);
		System.out.println("After removing, the list is "+ml);
		System.out.println("Size of the list is " + ml.size());
		
		//fetching the element by index
		System.out.println(ml.getElementByIndex(4));

	}

}
