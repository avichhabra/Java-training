import java.util.Scanner;
class Vowel {
  public static void main(String[] args) {
	  int a,e,i,o,u;
    Scanner s = new Scanner(System.in);
	String v = s.next();
	StringBuffer var = new StringBuffer(v);
    for(int j=0;j<var.length();j++)
		{
			char ch=v.charAt(j);
			if(ch=='a'|| ch=='e'||ch=='i' ||ch=='o'||ch=='u' ) {
			var.setCharAt(j, ' ');
			}
		}
  	 
	  System.out.println(var);
  }
 
} 