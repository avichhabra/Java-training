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
	public int compare(Object o1,Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2; 
		if(s1.age==s2.age) {
			return 0;
		}
		else if (s1.age>s2.age) {
			return 1;
		}
		else return-1;
	}
}


class List_Sort {
  public static void main(String[] args) {
	  ArrayList al = new ArrayList();
	  al.add(new Student(19,"avi"));
	  al.add(new Student(110,"vishu"));
	  al.add(new Student(3,"avnish"));
	  
	  //Collections.sort(al,new AgeComp1()); 
	  Iterator i = al.iterator();
	  while(i.hasNext()) {
		 Student a=(Student)i.next();
		  System.out.println(a);
	  }
  }
}