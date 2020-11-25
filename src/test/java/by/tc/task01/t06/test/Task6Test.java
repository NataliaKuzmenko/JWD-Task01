package by.tc.task01.t06.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import by.tc.task01.t06.Task6;

public class Task6Test {
	int x = 8_128;
	int y = 3_489;

	String actual;
	String expected = "2 hours 15 min 28 s";
	Task6 obj = new Task6();

	@Test
	public void test1() {

		actual = obj.getTime(x);

		assertEquals(expected, actual);

	}

	@Test
	public void test2() {

		actual = obj.getTime(y);

		assertNotEquals(expected, actual);

	}

}