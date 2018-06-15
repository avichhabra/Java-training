class Ascending{
 public static void main(String[] args){
   int list[] = {1,1,1,1,0,0,1,0};
   int i,temp=0;
   for(int k=0;k<list.length-1;k++){
   for(i=0;i<list.length-1;i++) {
     if (list[i] > list[i+1]){
	   temp= list[i+1];
	   list[i+1]=list[i];
	   list[i]=temp;
	 }
   }
   
 }
 for(int j=0; j<list.length;j++){
	   System.out.print(list[j]+ " ");
	   
   }
 }
}