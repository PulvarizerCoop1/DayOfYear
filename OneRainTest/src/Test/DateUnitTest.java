
package Test;

import org.junit.Assert;
import org.junit.Test;

import DatePackage.DayOfYear;

public class DateUnitTest {
	int month = 2;
	int dayOfMonth = 13;
	int year = 2018;
	
	// Test to make sure the Day is being set properly
	@Test
	public void createDateAndTestDay() {
		int month = 2;
		int dayOfMonth = 13;
		int year = 2018;
		
		// Test
		DayOfYear day = new DayOfYear(month, dayOfMonth, year);

		Assert.assertTrue(day.getDay() == dayOfMonth);
	}
	
	// Test to make sure the year is being set properly
	@Test
	public void createDateAndTestYear() {
		int month = 2;
		int dayOfMonth = 13;
		int year = 1900;
		
		// Test
		DayOfYear day = new DayOfYear(month, dayOfMonth, year);

		Assert.assertTrue(day.getYear() == year);
	}
	
	// Test to make sure the month is being set properly
	@Test
	public void createDateAndTestMonth() {
		int month = 2;
		int dayOfMonth = 13;
		int year = 2017;
		
		// Test
		DayOfYear day = new DayOfYear(month, dayOfMonth, year);

		Assert.assertTrue(day.getMonth() == month);
	}
	
	// First Test of the dayOfYear method
	@Test
	public void createDateAndTestDayOfYear1() {
		int month = 1;
		int dayOfMonth = 5;
		int year = 2018;
		int temp = 5; // Actual value for day of the year
		
		// Test
		DayOfYear day = new DayOfYear(month, dayOfMonth, year);

		Assert.assertTrue(day.getDayOfYear() == temp);
	}
	
	// Second Test of the dayOfYear method
	@Test
	public void createDateAndTestDayOfYear2() {
		int month = 6;
		int dayOfMonth = 30;
		int year = 2018;
		int temp = 181; // Actual value for day of the year
		
		// Test
		DayOfYear day = new DayOfYear(month, dayOfMonth, year);

		Assert.assertTrue(day.getDayOfYear() == temp);
	}
	
	// Third Test of the dayOfYear method
	@Test
	public void createDateAndTestDayOfYear3() {
		int month = 2;
		int dayOfMonth = 13;
		int year = 2018;
		int temp = 44; // Actual value for day of the year
		
		// Test
		DayOfYear day = new DayOfYear(month, dayOfMonth, year);

		Assert.assertTrue(day.getDayOfYear() == temp);
	}
	
}
