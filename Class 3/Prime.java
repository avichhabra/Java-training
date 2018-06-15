import java.util.Scanner;
class Prime{
   public static void main(String[] args){
	  int i,j;
	  Scanner sc;
	 sc =new Scanner(System.in);
	 int n = sc.nextInt();
	  int count =0;
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