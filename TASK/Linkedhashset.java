package coll.index;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> sub=new LinkedHashSet<>();
		//Add element
		sub.add("Java");
		sub.add("Python");
		sub.add("C");
		sub.add("C++");
		System.out.println(sub);
		//remove element
		sub.remove("Python");
		System.out.println(sub);
		//check if the element exist
		System.out.println(sub.contains("Java"));
		//get the num of elements
		System.out.println(sub.size());
		//check if set is empty
		System.out.println(sub.isEmpty());
		//loop through set
		for(String s:sub) {
			System.out.println(s);
		}
		//addall
		LinkedHashSet<String> sub1=new LinkedHashSet<>();
		sub1.add("Dotnet");
		sub1.add("DM");
		sub1.add("Java");
		
		sub.addAll(sub1);
		System.out.println(sub);
		//remove all
		sub.removeAll(sub1);
		System.out.println(sub);
		//retain all-keep only commen element
		sub.retainAll(sub1);
		System.out.println(sub);
		//contains all--check if the set  all element from the given collection
		System.out.println(sub.containsAll(sub1));
		//equal--- return true if both set set contain same element (oder does not matter)
		System.out.println(sub.equals(sub1));
		//toarray
		String[] arr=sub.toArray(new String[0]);
		for(String h:arr) {
			System.out.print(h+" ");
		}
		//clear
		sub.clear();
		System.out.println(sub);
		
		
		
		
		
		
		
		

	}

}
