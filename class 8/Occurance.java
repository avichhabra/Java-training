import java.util.Scanner;
class Occurance {
 public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter first string");
   String a = s.nextLine();
   System.out.println("Enter second string");
   String b = s.nextLine();
   boolean t = a.contains(b);
   if(t==true) {
	   System.out.println(b+ " is in string " +a);
   }
   else {
	   System.out.println(b+ " is not in string " +a);
   }
 }
}