import java.io.*;
class Write {
  public static void main(String[] args) throws Exception {
	  int b,c;
	  File f1 = new File("D:/folder/abc.txt");
	  File f2 = new File("D:/folder/xyz.txt");
	  f2.createNewFile();
	  FileInputStream fis = new FileInputStream("D:/folder/abc.txt");
	  BufferedInputStream bis = new BufferedInputStream(fis);
	  
	  FileOutputStream fos = new FileOutputStream("D:/folder/xyz.txt");
	  BufferedOutputStream bos = new BufferedOutputStream(fos);
	  
	  
	  while((b=bis.read()) != -1) {
		  bos.write((char)b);
		  System.out.print((char) b);
	  }
	  
	  bos.flush();
	  
  }
}