import java.util.Scanner;
class SecondLargest{
	public static void main(String[] args) {
		int j,k,max,a;
		a=0;
		int list[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(j=0;j<10;j++) {
			int n=sc.nextInt();
			list[j]=n;
		}
		 for(int k=0;k<list.length-1;k++){
   for(i=0;i<9;i++) {
     if (list[i] > list[i+1]){
	   temp= list[i+1];
	   list[i+1]=list[i];
	   list[i]=temp;
	 }
   }
      a=list[8];
	  System.out.println("second largest no. is" +a );
   
				
			}
			
		}
