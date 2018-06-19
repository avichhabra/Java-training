import java.io.*;
class Read {
 public static void main(String[] args) throws Exception{
	 int b;
   FileInputStream f = new FileInputStream("D:/test/File/abc.txt");

   while((b = f.read()) != -1) {
     System.out.println((char) b);
   }   
 }
}