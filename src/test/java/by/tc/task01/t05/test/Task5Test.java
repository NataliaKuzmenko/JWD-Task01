package by.tc.task01.t05.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import by.tc.task01.t05.Task5;

public class Task5Test {

	int x = 8_128;
	int y = 123;

	boolean actual;
	boolean expected = true;
	Task5 obj = new Task5();

	@Test
	public void test1() {

		actual = obj.method(x);

		assertEquals(expected, actual);

	}

	@Test
	public void test2() {

		actual = obj.method(y);

		assertNotEquals(expected, actual);

	}

}
