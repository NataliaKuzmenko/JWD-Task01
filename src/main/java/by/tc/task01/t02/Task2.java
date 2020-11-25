package by.tc.task01.t02;

import java.util.GregorianCalendar;

public class Task2 {
	/*
	 * Составить программу, которая по заданным году и номеру месяца определяет
	 * количество дней в этом месяце и корректно определялись все високосные года.
	 */ 
	
	int year;
	int month;
	int day;

	public int daysOfMonth(int year, int month) {
		GregorianCalendar date = new GregorianCalendar(year, month, day);
		int amountOfDays = date.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
		return amountOfDays;
	}

	public boolean isLeapYear(int year) {
		GregorianCalendar date = new GregorianCalendar(year, month, day);
		return date.isLeapYear(year);
	}

}
