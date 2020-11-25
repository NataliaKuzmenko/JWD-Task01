package by.tc.task01.t01.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import by.tc.task01.t01.Task1;

public class Task1Test {
	
	int a = 16;
	int b = 48;
	
	int expected = 6;
	int actual;
	
	Task1 obj = new Task1();

	@Test
	public void test1() {

		actual = obj.method(a);

		assertEquals(expected, actual);
	}

	@Test
	public void test2() {

		actual = obj.method(b);

		assertNotEquals(expected, actual);
	}

}
