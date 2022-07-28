package assignment6;

import java.util.ArrayList;
import java.util.Collections;

//Prompt 2: Write an example for Comparable and Comparator
//This file has 2 classes, students and studentAge which implement comparable and comparator respectively.
//The students class contains objects with name and id, while the studentAge class simply contains a compare method.

import java.util.Comparator;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Prompt2 {

	public static void main(String[] args) {
		studentAge comp = new studentAge();
		
		students a = new students(18, "bob");
		students b = new students(14, "mandy");
		students c = new students(15, "jane");
		students d = new students(15, "jim");
		
		//comp.compare(a, b);
		//comp.compare(b, c);
		//comp.compare(c, d);
		
		List<students> stuList = new ArrayList<students>();
		stuList.add(a);
		stuList.add(b);
		stuList.add(c);
		stuList.add(d);
		
		Collections.sort(stuList, comp);
		for (students student : stuList) {
			System.out.println("Student is: " + student.getName());
		}
		
	}
}

@Getter
@Setter
class students implements Comparable<students> {
	
	private int age;
	private String name;
	
	students(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(students otherStu) {
		if (otherStu.age > this.age) {
			//System.out.println(otherStu.name + " is older than " + name + ".");
			return -1;
		} else if (otherStu.age == this.age) {
			//System.out.println(name + " is as old as " + otherStu.name + ".");
			return 0;
		} else {
			//System.out.println(otherStu.name + " is younger than " + name + ".");
		}
		return 1;
	}
}

class studentAge implements Comparator<students> {
	public int compare(students a, students b) {
		return a.compareTo(b);
	}
}