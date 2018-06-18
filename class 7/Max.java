import java.util.Scanner;
class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number as string");
		String a = sc.nextLine();
		System.out.println("Enter second number as string");
		String b = sc.nextLine();
		
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		
		if (c>d) {
			System.out.println(c+ " is greater");
		}
		else {
			System.out.println(d+ " is greater");
		}
	}
} 