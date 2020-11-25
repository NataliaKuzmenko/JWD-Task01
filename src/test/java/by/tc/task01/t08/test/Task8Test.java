package by.tc.task01.t08.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import by.tc.task01.t08.Task8;

public class Task8Test {
	double x = 1;
	double y = 2;

	double actual;
	double expected = -0.2;
	Task8 obj = new Task8();

	@Test
	public void test1() {

		actual = obj.method(x);

		assertEquals(expected, actual, 0.000001);

	}

	@Test
	public void test2() {

		actual = obj.method(y);

		assertNotEquals(expected, actual, 0.000001);

	}

}