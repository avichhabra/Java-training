import java.util.Scanner;
class Reverse1 {
  public static void main(String... x){
  Scanner sc = new Scanner(System.in);
  String s = sc.next();
  StringBuffer ip= new StringBuffer(s);
  StringBuffer sbr = ip.reverse();  
  System.out.println(sbr);
  }
}