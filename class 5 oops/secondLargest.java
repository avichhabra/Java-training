import java.util.Scanner;
class SecondLargest{
	public static void main(String[] args) {
		int i,j,max,a,temp;
		a=0;
		System.out.println("Enter 10 elements of array");
		int list[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(j=0;j<10;j++) {
			int n=sc.nextInt();
			list[j]=n;
		}
		 for(int k=0;k<=9;k++){
   for(i=0;i<=8;i++) {
     if (list[i] > list[i+1]){
	   temp= list[i+1];
	   list[i+1]=list[i];
	   list[i]=temp;
	 }
   }			
			} System.out.println("second largest no. is " +list[8]);
	}
}