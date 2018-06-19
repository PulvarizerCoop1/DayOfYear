
package DatePackage;

public class DayOfYear {
	private int month, dayOfMonth, year;
	
	// Constructor
	public DayOfYear (int month, int dayOfMonth, int year) {
		this.month = month;
		this.dayOfMonth = dayOfMonth;
		this.year = year;
	}
	
	// Accessors
	// Returns the day of the year
	public int getDayOfYear() {
		return dayOfYear(month, dayOfMonth, year);
	}
	// Returns the day of the month
	public int getDay() {
		return this.dayOfMonth;
	}
	// Returns the month
	public int getMonth() {
		return this.month;
	}
	// Returns the year
	public int getYear() {
		return this.year;
	}
	
	// This method takes a month, day of the month and year as input and returns the day of the year.
	public static int dayOfYear( int month, int dayOfMonth, int year) {
		if (month == 2 ) {
		dayOfMonth += 31 ;
		} else if (month == 3 ) {
		dayOfMonth += 59 ;
		} else if (month == 4 ) {
		dayOfMonth += 90 ;
		} else if (month == 5 ) {
		dayOfMonth += 31 + 28 + 31 + 30 ;
		} else if (month == 6 ) {
		dayOfMonth += 31 + 28 + 31 + 30 + 31 ;
		} else if (month == 7 ) {
		dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 ;
		} else if (month == 8 ) {
		dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 ;
		} else if (month == 9 ) {
		dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 ;
		} else if (month == 10 ) {
		dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 ;
		} else if (month == 11 ) {
		dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 ;
		} else if (month == 12 ) {
		dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31 ;
		}
		return dayOfMonth;
	}
}