class Biggest3{
	public static void main(String[] args) {
		int a,b,c;
		a=50;
		b=20;
		c=70;
		if((a>b)&&(a>c)) {
			System.out.println(a+ "is biggest");
		}
		else if ((b>a)&&(b>c)) {
			System.out.println(b+ "is biggest");
		}
		else {
			System.out.println(c+ "is biggest");
		}
	}
}