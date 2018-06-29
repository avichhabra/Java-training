import java.util.*;
import java.io.*;
class Student {
	int age;
	String name;
	Student(int age,String name) {
		this.age = age;
		this.name = name;
	}
}
class ageComp implements Comparator{
	public int compare(Student s1,Student s2) {
		
		if(s1.age==s2.age) {
			return 0;
		}
		else if (s1.age>s2.age) {
			return 1;
		}
		else return -1;
	}
}


class List_Sort {
  public static void main(String[] args) {
	  ArrayList al = new ArrayList();
	  al.add(new Student(5,"avi"));
	  al.add(new Student(1,"vishu"));
	  al.add(new Student(3,"avnish"));
	  
	  Iterator i = al.iterator();
	  while(i.hasNext()) {
		 Student a=(Student)i.next();
		  System.out.println(a);
	  }
  }
}