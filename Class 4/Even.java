import java.util.Scanner;
class Even{
 public static void main(String[] args){
	 int i;
	 System.out.println("Enter a number");
	 Scanner sc;
	 sc =new Scanner(System.in);
	 int n = sc.nextInt();
     for(i=0;i<=n;i++){
		 if(i%2==0)
		   System.out.println(i);
	 }
 }
	
}