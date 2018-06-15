import java.util.Scanner;
class Prime{
   public static void main(String[] args){
	  int i,j;
	  System.out.println("Enter a number");
	  Scanner sc;
	 sc =new Scanner(System.in);
	 int n = sc.nextInt();
	  int count =0;
	  System.out.println("Prime numbers are :");
     for(i=2;i<=n;i++) {
		 for (j=1;j<i;j++) {
			 if (i%j==0)
				 count++;
			
		 }
	if(count==1)	 
		 System.out.println(i);	
             count=0;		 
	 }	 
	 
		 
   }	
	
}