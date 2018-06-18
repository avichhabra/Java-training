class Block {
  static {
	  System.out.println("This is static block");
  }
  Block() {
	  System.out.println("This is constructor");
  }
  public static void main(String args[]) {
	  System.out.println("this is main");
	  Block b = new Block();
	  
  }
}