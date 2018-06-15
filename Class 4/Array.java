import java.util.Scanner;
class Array{
	public static void main(String[] args) {
		int j,k;
		int list[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(j=0;j<10;j++) {
			int n=sc.nextInt();
			list[j]=n;
		}
		for(k=0;k<10;k++) {
			System.out.print( list[k] );
			System.out.println();
		}
 	}
}
