
package by.tc.task01.t09.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import by.tc.task01.t09.Task9;

public class Task9Test2 {
	double x = 2.0d;
	double y = 5.0d;

	double actual;
	double expected = 12.566370614359172d;
	Task9 obj = new Task9();

	@Test
	public void test1() {

		actual = obj.areaOfCircle(x);

		assertEquals(expected, actual, 0.000000000000001);

	}

	@Test
	public void test2() {

		actual = obj.areaOfCircle(y);

		assertNotEquals(expected, actual, 0.000000000000001);

	}

}
