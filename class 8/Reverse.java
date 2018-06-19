import java.util.Scanner;
class Reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enetr the string");
	String s = sc.next();
	char[] arr = s.toCharArray();
	System.out.println("the original string is ");
	for (int i=0; i<arr.length; i++) {
	  System.out.println(arr[i]);
	}
	System.out.println("Reversed string is");
	for(int j=arr.length-1; j>=0; j-- ) {
	  System.out.println(arr[j]);
	}
  }
}