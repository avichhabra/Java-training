import java.util.Scanner;
class Array{
	public static void main(String[] args) {
		int j,x,i,temp;
		System.out.println("Enter the 10 elements of array");
		int list[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(j=0;j<10;j++) {
			int n=sc.nextInt();
			list[j]=n;
		}
		for(int k=0;k<10;k++){
   for(i=0;i<10-1;i++) {
     if (list[i] > list[i+1]){
	   temp= list[i+1];
	   list[i+1]=list[i];
	   list[i]=temp;
	 }
   }
		for(x=0;x<10;x++) {
			System.out.print( list[x] );
			System.out.println();
		}
 	}
}
}
