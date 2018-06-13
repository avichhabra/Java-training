class Leap{
	public static void main(String[] args) {
		int year=1990;
		if(year%400==0)
		 System.out.println("Year is leap");
	    else if(year%100==0)
		 System.out.println("year is leap");
	    else if(year%4==0)
		 System.out.println("year is leap");
	    else 
		 System.out.println("year is not leap");
		
	}
	
}