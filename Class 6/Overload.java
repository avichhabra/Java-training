class Overload {
  void print(int x , int y) {
    System.out.println("both are integers");
  }
  void print(int x , float y) {
    System.out.println("one is integer and one is float");
  }
  public static void main(String args[]) {
	  Overload o = new Overload();
	  o.print(3,4.6f);
  }
}