package by.tc.task01.t02.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import by.tc.task01.t02.Task2;

public class Task2Test2 {
	int a = 2019;
	int b = 2020;
	boolean actual;
	boolean expected = false;
	Task2 obj = new Task2();

	@Test
	public void test1() {

		actual = obj.isLeapYear(a);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {

		actual = obj.isLeapYear(b);
		assertNotEquals(expected, actual);
	}

}
