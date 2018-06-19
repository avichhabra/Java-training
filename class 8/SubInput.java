import java.util.Scanner;
class SubInput {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first string");
	String s = sc.next();
	int length = s.length();
	for(int i=0;i<length;i++) {
	  for(int j=1;j<=length;j++) {
		  if(i<=j) {
	    String str = s.substring(i,j);
		System.out.println(str);
		  }
	  }
	}
 }
}