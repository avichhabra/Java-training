
import java.util.Scanner;
class Armstrong{
 public static void main(String[] args){
   int rem,sum,num2;
   sum=0;
   Scanner sc;
	 sc =new Scanner(System.in);
	 System.out.println("Enter a four digit no.");
	 int num = sc.nextInt();
	 num2=num;
   while(num>0) {
     rem=num%10;
	 sum=sum+(rem*rem*rem*rem);
	 num=num/10;
   }
   
   if(num2==sum) {
	   System.out.println(num2+" is armstrong");
   }
	else 
	{
		System.out.println(num2+" is not armstrong");
	}
 }
}