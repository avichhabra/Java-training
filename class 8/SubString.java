class SubString {
  public static void main(String[] args) {
     String s = "xyz";
	 int length=3;
	 for(int i=0;i<length;i++) {
	   for(int j=1;j<=length;j++) {
		   if(i<=j) {
	     String a = s.substring(i,j);
		 System.out.println(a);
		   }
	   }
	 }
  }
  }