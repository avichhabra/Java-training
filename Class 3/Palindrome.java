import java.util.Scanner;
class Palindrome{
	public static void main(String[] args){
		 int num2,rev,rem; 
		 rev=0;
		  Scanner sc;
	 sc =new Scanner(System.in);
	 System.out.println("Enter a four digit no.");
	 int num = sc.nextInt();
	 num2=num;
	 
	 while(num2>0){
		rem=num2%10;
        rev=rev*10+rem;
        num2=num2/10;		
		 
	 }
	 //System.out.println("reverse of the no. is " +rev);
	 if(num==rev) {
		 System.out.println(num+ " is a palindrome no.");
	 }
	 else {
		 System.out.println(num+ " is not a palindrome no.");
	 }
	}
}