package chapter06;

public class Q33 {

	public static void main(String[] args) {
long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;

	    long currentSecond = totalSeconds % 60;

	    long totalMinutes = totalSeconds / 60;

	    long currentMinute = totalMinutes % 60;

	    long totalHours = totalMinutes / 60;

	    long currentHour = totalHours % 24;
	    
	    
	    double year = ((int) (totalHours / 8765.81277)) + 1970;
		int month = (int)((((totalHours % 8765.81277) / 730.484398) % 12) + 1) % 12;
		double day = (int)(((totalHours % 8765.81277) % 730.484398) / 24);
		
		System.out.println("Current date and time is " + printMonth(month) + " " + (int) printDate(year, month, day) + ", " 
		+ (int) year + " " + currentHour + ":" + currentMinute + ":" + currentSecond);
	    
	}

	public static String printMonth(int month) {
		if (month == 1) {
			return "Jan";
		} else if (month == 2) {
			return "Feb";
		} else if (month == 3) {
			return "Mar";
		} else if (month == 4) {
			return "Apr";
		} else if (month == 5) {
			return "May";
		} else if (month == 6) {
			return "Jun";
		} else if (month == 7) {
			return "Jul";
		} else if (month == 8) {
			return "Aug";
		} else if (month == 9) {
			return "Sep";
		}  else if (month == 10) {
			return "Okt";
		} else if (month == 11) {
			return "Nov";
		}
		return "Dec";
	}

	public static double printDate(double year, int month, double day) {
		boolean leepYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			 day = day % 31;
		} else if (month == 2 && leepYear == true) {
			day = day % 29;
		} else if (month == 2 && leepYear == false) {
			day = day % 28;
		} else {
			day = day % 30;
		}
		
		return day;
	}
}
