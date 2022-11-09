package practiseJava;

public class dateDifference {
	
	public static double yearDiff = 0;
	public static double monthDiff = 0;
	public static double dayDiff = 0;
	
	public static void calculateDateDifference(double day1, double month1, double year1, double day2, double month2, double year2)
	{
		yearDiff = year1 - year2;
		if(yearDiff<0)
			yearDiff *= -1;
		
		
		monthDiff = month1 - month2;
		if(monthDiff<0)
			monthDiff *= -1;
		
		
		dayDiff = day1 - day2;
		if(dayDiff<0)
			dayDiff *= -1;
		
		System.out.println("Date Differnce : "+yearDiff+ " Years "+monthDiff+" Months "+dayDiff+" Days ");
		
		
	}


}
