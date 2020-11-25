package by.tc.task01.t03.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import by.tc.task01.t03.Task3;

public class Task3Test {

	Double squareAreaBig = 16.0d;
	Double squareAreaBig2 = 25.0d;

	Double actual;
	Double expected = 8.0d;
	Task3 obj = new Task3();

	@Test
	public void test1() {

		actual = obj.getSquareArea(squareAreaBig);

		assertEquals(expected, actual);

	}

	@Test
	public void test2() {

		actual = obj.getSquareArea(squareAreaBig2);

		assertNotEquals(expected, actual);

	}

}
