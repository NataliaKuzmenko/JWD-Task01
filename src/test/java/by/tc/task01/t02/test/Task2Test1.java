package by.tc.task01.t02.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import by.tc.task01.t02.Task2;

public class Task2Test1 {
	int year1 = 2020;
	int month1 = 2;

	int year2 = 2020;
	int month2 = 3;

	int actual;
	int expected = 29;

	Task2 obj = new Task2();

	@Test
	public void test1() {

		actual = obj.daysOfMonth(year1, month1);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {

		actual = obj.daysOfMonth(year2, month2);
		assertNotEquals(expected, actual);
	}

}
