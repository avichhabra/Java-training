class Complex{
 int real;
 int imaginary;
 void setReal(int x) {
	 real = x;
 }
 void setImaginary(int y) {
	 imaginary = y;
 }
 void display() {
	 System.out.println(real+ "+"+ imaginary+ "i");
	 
 }
 public static void main(String[] args) {
	 Complex r = new Complex();
	 r.setReal(5);
	 r.setImaginary(7);
	 r.display();
 }
  
}