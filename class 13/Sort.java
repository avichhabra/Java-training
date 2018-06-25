import java.util.Arrays;
import java.util.Scanner;
public class Sort {
 public static <E> void arr(E[] inarr) {
	Arrays.sort(inarr);
	for(E element : inarr) {
	System.out.println(element);
	}
	System.out.println();
	}
 
public static void main(String[] args) {
	Integer[] intarray = {1,2,3,10,3,23,5,6,7};
	String[] chararray = {"avi","satyam","sajan"};
	Double[] doublearray = {1.3,4.56,5.6,3.8};
	System.out.println("Sorted integer array is");
	arr(intarray);
	System.out.println("Sorted character array is");
	arr(chararray);
	System.out.println("Sorted double type array is");
	arr(doublearray);
} 
}