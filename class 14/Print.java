import java.util.*;
import java.io.*;
class Print extends Thread{
	
  static int i=1;
  public synchronized void print(){
    
	for(int j=1;j<=500;j++) {
		System.out.println(this.i++);
	}
  }
  public void run() {
	  print();
  }

  public static void main(String[] args) throws InterruptedException{
	  
	  Print p = new Print();
	  
	  Thread t1 = new Thread(p);
	  Thread t2 = new Thread(p);
	  t1.start();
	  t2.start();
  }
  
}