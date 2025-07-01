package coll.index;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree=new TreeSet<>();
		//add the element
		tree.add("Java");
		tree.add("C");
		tree.add("C++");
		tree.add("Python");
		System.out.println(tree);
		//REMOVE THE ELEMENT
		tree.remove("C");
		System.out.println(tree);
		//check the element exist
		System.out.println(tree.contains("c++"));
		//check if the set is empty
		System.out.println(tree.isEmpty());
		//size
		System.out.println(tree.size());
		//add all
		TreeSet<String> tree1=new TreeSet<>();
		tree1.add("DM");
		tree1.add("C");
		tree.addAll(tree1);
		System.out.println(tree);
		//remove all
		tree.removeAll(tree1);
		System.out.println(tree);
		//retain all
		tree.retainAll(tree1);
		System.out.println(tree);
		//contains all
		System.out.println(tree.containsAll(tree1));
		//equals
		System.out.println(tree.equals(tree1));
		//loop
		for(String g:tree) {
			System.out.println(g);
		}
		//to array
		String [] arr=tree.toArray(new String[0]);
		for(String h:arr) {
			System.out.print(h+" ");
		}
		
		
		
		
		
		
		

	}

}
