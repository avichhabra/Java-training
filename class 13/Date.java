import java.util.Scanner;
import java.util.*;
  class Date {
  public static void main(String[] args) throws ClassCastException {
    
	HashMap<Integer,String>  date = new HashMap<Integer,String>();
	date.put(1,"one");
	date.put(2,"two");
	date.put(3,"three");
	date.put(4,"four");
	date.put(5,"five");
	date.put(6,"six");
	date.put(7,"seven");
	date.put(8,"eight");
	date.put(9,"nine");
	date.put(10,"ten");
	date.put(11,"eleven");
	date.put(12,"twelve");
	date.put(13,"thirteen");
	date.put(14,"fourteen");
	date.put(15,"fifteen");
	date.put(16,"sixteen");
	date.put(17,"seventeen");
	date.put(18,"eighteen");
	date.put(19,"nineteen");
	date.put(20,"twenty");
	date.put(21,"twenty one");
	date.put(22,"twenty two");
	date.put(23,"twenty three");
	date.put(24,"twenty four");
	date.put(25,"twenty five");
	date.put(26,"twenty six");
	date.put(27,"twenty seven");
	date.put(28,"twenty eight");
	date.put(29,"twenty nine");
	date.put(30,"thirty");
	date.put(31,"thirty one");
	
	//taking date as key from user 
	System.out.println("Enter the date");
	Scanner sc = new Scanner(System.in);
	int k = sc.nextInt();
    String f = date.get(k);
	
	
	
	
	
	HashMap<Integer,String> month = new HashMap<Integer,String>();
	month.put(01,"january");
	month.put(02,"februry");
	month.put(03,"march");
	month.put(04,"april");
	month.put(05,"may");
	month.put(06,"june");
	month.put(07,"july");
	month.put(8,"august");
	month.put(9,"september");
	month.put(10,"october");
	month.put(11,"november");
	month.put(12,"december");

    // taking month as a key  from the user	
	System.out.println("Enter the month");
	Scanner sc1 = new Scanner(System.in);
	int d = sc1.nextInt();
    String m = month.get(d);
	
	
    HashMap<Integer,String> year = new HashMap<Integer,String>();
	year.put(2000,"two thousand");
	year.put(2001,"two thousand one");
	year.put(2002,"two thousand two");
	year.put(2003,"two thousand three");
	year.put(2004,"two thousand four");
	year.put(2005,"two thousand five");
	year.put(2006,"two thousand six");
	year.put(2007,"two thousand seven");
	year.put(2008,"two thousand eight");
	year.put(2009,"two thousand nine");
	year.put(2010,"two thousand ten");
	year.put(2011,"two thousand eleven");
	year.put(2012,"two thousand twelve");
	year.put(2013,"two thousand thirteen");
	year.put(2014,"two thousand fourteen");
	year.put(2015,"two thousand fifteen");
	
	//taking year as key from user
	System.out.println("Enter the year between 2000 to 2015");
	Scanner sc2 = new Scanner(System.in);
	int z = sc2.nextInt();
    String y = year.get(z);
	
	//printing the whole date in english
	System.out.println(f+" "+m+" ,"+y);
	
}
  }