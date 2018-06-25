import java.util.Scanner;
public class Print3 {
 public static <E> void arr(E[] inarr) {
	 for (E element : inarr) {
		 System.out.println(element);
	 }
	 System.out.println();
 }
public static void main(String[] args) {
	Integer[] intarray = {1,2,3,4,5,6,7};
	String[] chararray = {"Avi","piyush","Rahul"};
	Double[] doublearray = {1.3,4.56,5.6,3.8};
	System.out.println("integer array is");
	arr(intarray);
	System.out.println("character array is");
	arr(chararray);
	System.out.println("double type array is");
	arr(doublearray);
} 
}