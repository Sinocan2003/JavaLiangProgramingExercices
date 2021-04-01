package chapter06;

public class Q24 {

	public static void main(String[] args) {

		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHour = totalHours % 24;

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

		long totalDays = totalHours / 24;

		int year = 1970;

		while (true) {
			if (isLeapYear(year)) {
				if (totalDays < 366)
					break;
				totalDays -= 366;
			} else {
				if (totalDays < 365)
					break;
				totalDays -= 365;
			}
			year++;
		}

		int month = 1;
		while (true) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (totalDays <= 31)
					break;
				totalDays -= 31;
			} else if (month == 2) {
				if (isLeapYear(year)) {
					if (totalDays <= 29)
						break;
					totalDays -= 29;
				} else {
					if (totalDays <= 28)
						break;
					totalDays -= 28;
				}
			} else {
				if (totalDays <= 30)
					break;
				totalDays -= 30;
			}
			month++;
		}

		printDate(year, month, (int) totalDays + 1);

	}

	public static void printDate(int year, int month, int day) {
		System.out.printf("%d%1s%d%1s%d", day, ".", month, ".", year);
	}

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
}
