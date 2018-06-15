import java.util.Scanner;
class Waveform {
  public static void main(String[] args) {
	  int i,j,k,temp;
    System.out.println("Enter 10 elements of array");
		int list[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(j=0;j<list.length;j++) {
			int n=sc.nextInt();
			list[j]=n;
		}
		for(i=0;i<list.length-1;i=i+2) {
       if(list[i] < list[i+1]){
	   temp= list[i+1];
	   list[i+1]=list[i];
	   list[i]=temp;
	 }
	 
  }
  
  for(k=0;k<=list.length-1;k++) {
		 System.out.print(list[k] +" ");
		 
	 }
}
}