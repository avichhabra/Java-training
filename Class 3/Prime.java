import java.util.Scanner;
class Prime{
  public static void main(String[] args) {
	  int i,count=0;
	Scanner var = new Scanner(System.in);
     int num = var.nextInt();
     for(i=1;i<=num-1;i++) {
		 if(num%i==0) {
			 count++;
		 }
	 }
      if(count==1) {
	  System.out.println(num+ " is a prime no.");
	  }	  
	  else {
	  System.out.println(num+ " is not a prime no.");
	  }
  }
}