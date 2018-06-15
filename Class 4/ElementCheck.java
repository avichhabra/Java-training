import java.util.Scanner;
class ElementCheck{
	public static void main(String[] args) {
		int j,x,i,temp;
		System.out.println("Enter the 10 elements of array");
		int list[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(j=0;j<10;j++) {
			int n=sc.nextInt();
			list[j]=n;
		}
		System.out.println("Enter the number you want to search in array");
		int num = sc.nextInt();
		for(i=0;i<=9;i++) {
	      if(num==list[i]) {
		    System.out.println(i+ " is a part of array");
			break;
		  }	
		 
		  } 
	}
}