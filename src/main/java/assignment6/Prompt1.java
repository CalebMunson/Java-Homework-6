package assignment6;

//Prompt 1: Write programs for each of the below for adding, removing, and iteration using an iterator.
//Structures included in this prompt: ArrayList, LinkedList, Vector, Stack, HashSet, LinkedHashSet, TreeSet, HashMap, LinkedHashMap, TreeMap.
//I formatted the output to make it more readable, if this is not a good way to do the prompt, let me know for the future.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Prompt1 {

	public static void main(String[] args) {
		arrayListTest a = new arrayListTest();
		a.print();
		
		linkedListTest b = new linkedListTest();
		b.print();
		
		vectorTest c = new vectorTest();
		c.print();
		
		stackTest d = new stackTest();
		d.print();
		
		hashSetTest e = new hashSetTest();
		e.print();
		
		linkedHashSetTest f = new linkedHashSetTest();
		f.print();
		
		treeSetTest g = new treeSetTest();
		g.print();
		
		hashMapTest h = new hashMapTest();
		h.print();
		
		linkedHashMapTest i = new linkedHashMapTest();
		i.print();
		
		treeMapTest j = new treeMapTest();
		j.print();
	}
}

class arrayListTest {
	void print() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("ArrayList Test:\nAdding values 0 through 14 to the ArrayList.");
		for (int i = 0; i < 15; i++)
			list.add(i);
		
		System.out.println("Removing value \"5\" from the ArrayList");
		list.remove(5);
		
		System.out.println("Printing the list using Iterator:\n--------------------------------");
		Iterator<Integer> iterList = list.iterator();
		while (iterList.hasNext()) {
			System.out.print(iterList.next() + " ");
		}
		System.out.println("\n--------------------------------\nEnding ArrayList Test.\n");
	}
}

class linkedListTest {
	void print() {
		System.out.println("LinkedList Test:\nAdding values 0 through 14 to the LinkedList.");
		LinkedList<Integer>  list2 = new LinkedList<Integer>();
		for (int i = 0; i < 15; i++)
			list2.add(i);
		
		System.out.println("Removing values \"4\" and \"7\" from the LinkedList");
		list2.remove(4);
		list2.remove(6); //This is the index of 7 after removing 4
		
		System.out.println("Printing the list using Iterator:\n--------------------------------");
		Iterator<Integer> iterList2 = list2.iterator();
		while (iterList2.hasNext()) {
			System.out.print(iterList2.next() + " ");
		}
		System.out.println("\n--------------------------------\nEnding LinkedList Test.\n");
	}
}

class vectorTest {
	void print() {
		System.out.println("Vector Test:\nAdding values 0 through 14 to the Vector.");
		Vector<Integer> vec = new Vector<Integer>();
		for (int i = 0; i < 15; i++)
			vec.add(i);
		
		System.out.println("Removing values \"3\" and \"14\" from the Vector");
		vec.remove(3);
		vec.remove(13); //This is the index of 14 after removing 3.
		
		System.out.println("Printing the list using Iterator:\n--------------------------------");
		Iterator<Integer> iterVec = vec.iterator();
		while (iterVec.hasNext()) {
			System.out.print(iterVec.next() + " ");
		}
		System.out.println("\n--------------------------------\nEnding Vector Test.\n");
	}
}

class stackTest {
	void print() {
		System.out.println("Stack Test:\nAdding values 0 through 14 to the Stack.");
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < 15; i++)
			stack.add(i);
		
		System.out.println("Additionally pushing 2 values to the Stack");
		stack.push(23);
		stack.push(42);
		
		System.out.println("Removing values \"8\" and \"12\" from the Stack");
		stack.remove(8);
		stack.remove(11); //This is the index of 12 after removing 8
		
		System.out.println("Additionally popping the last value of the Stack.");
		stack.pop(); //While you can remove from a stack, this is also an important 'removal' feature
		
		System.out.println("Printing the Stack using Iterator:\n--------------------------------");
		Iterator<Integer> iterStack = stack.iterator();
		while (iterStack.hasNext()) {
			System.out.print(iterStack.next() + " ");
		}
		System.out.println("\n--------------------------------\nEnding Stack Test.\n");
	}
}

class hashSetTest {
	void print() {
		HashSet<Integer> hash = new HashSet<Integer>();
		System.out.println("HashSet Test:\nAdding values 0 through 14 to the HashSet.");
		for (int i = 0; i < 15; i++)
			hash.add(i);
		
		System.out.println("Removing values \"7\" and \"12\" from the HashSet");
		hash.remove(7);
		hash.remove(11);
		
		System.out.println("Printing the set using Iterator:\n--------------------------------");
		Iterator<Integer> iterList = hash.iterator();
		while (iterList.hasNext()) {
			System.out.print(iterList.next() + " ");
		}
		System.out.println("\n--------------------------------\nEnding HashSet Test.\n");
	}
}

class linkedHashSetTest {
	void print() {
		LinkedHashSet<Integer> hash = new LinkedHashSet<Integer>();
		System.out.println("LinkedHashSet Test:\nAdding values 0 through 14 to the LinkedHashSet.");
		for (int i = 0; i < 15; i++)
			hash.add(i);
		
		System.out.println("Removing values \"1\" and \"14\" from the LinkedHashSet");
		hash.remove(1);
		hash.remove(13);
		
		System.out.println("Printing the set using Iterator:\n--------------------------------");
		Iterator<Integer> iterList = hash.iterator();
		while (iterList.hasNext()) {
			System.out.print(iterList.next() + " ");
		}
		System.out.println("\n--------------------------------\nEnding LinkedHashSet Test.\n");
	}
}

class treeSetTest {
	void print() {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		System.out.println("TreeSet Test:\nAdding values 0 through 14 to the TreeSet.");
		for (int i = 0; i < 15; i++)
			tree.add(i);
		
		System.out.println("Removing values \"1\" and \"14\" from the TreeSet");
		tree.remove(1);
		tree.remove(13);
		
		System.out.println("Printing the set using Iterator:\n--------------------------------");
		Iterator<Integer> iterList = tree.iterator();
		while (iterList.hasNext()) {
			System.out.print(iterList.next() + " ");
		}
		System.out.println("\n--------------------------------\nEnding TreeSet Test.\n");
	}
}

class hashMapTest {
	void print() {
		HashMap<Integer, Character> hash = new HashMap<Integer, Character>();
		System.out.println("HashMap Test:\nAdding values a through z with keys 0 through 26 to the HashMap.");
		for (int i = 1; i <= 26; i++) {
			char temp = (char) (i + 96);
			hash.put(i, temp);
		}
		
		System.out.println("Removing keys \"1\" and \"26\" from the HashMap");
		hash.remove(1);
		hash.remove(26);
		
		System.out.println("Printing the HashMap:\n--------------------------------");
		System.out.println(hash);
		System.out.println("\n--------------------------------\nEnding HashMap Test.\n");
	}
}

class linkedHashMapTest {
	void print() {
		LinkedHashMap<Integer, Character> hash = new LinkedHashMap<Integer, Character>();
		System.out.println("LinkedHashMap Test:\nAdding values a through z with keys 0 through 26 to the LinkedHashMap.");
		for (int i = 1; i <= 26; i++) {
			char temp = (char) (i + 96);
			hash.put(i, temp);
		}
		
		System.out.println("Removing keys \"1\" and \"26\" from the LinkedHashMap");
		hash.remove(1);
		hash.remove(26);
		
		System.out.println("Printing the LinkedHashMap:\n--------------------------------");
		System.out.println(hash);
		System.out.println("\n--------------------------------\nEnding LinkedHashMap Test.\n");
	}
}

class treeMapTest {
	void print() {
		TreeMap<Integer, Character> hash = new TreeMap<Integer, Character>();
		System.out.println("TreeMap Test:\nAdding values a through z with keys 0 through 26 to the TreeMap.");
		for (int i = 1; i <= 26; i++) {
			char temp = (char) (i + 96);
			hash.put(i, temp);
		}
		
		System.out.println("Removing keys \"1\" and \"26\" from the TreeMap");
		hash.remove(1);
		hash.remove(26);
		
		System.out.println("Printing the TreeMap:\n--------------------------------");
		System.out.println(hash);
		System.out.println("\n--------------------------------\nEnding TreeMap Test.\n");
	}
}