import java.util.Scanner;
class Check{
	public static void main(String[] args){
	   int i;
	   int list[] = {2,3,4,5,6,7,8,9};	
	    Scanner sc;
         sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(i=0;i<list.length;i++) {
			 if (list[i]==n) {
				 System.out.println(n+ " is a part of list");
				 break;
			 }
		 }
		 }		 
	}
	