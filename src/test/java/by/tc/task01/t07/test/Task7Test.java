package by.tc.task01.t07.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import by.tc.task01.t07.Coordinate;

public class Task7Test {
	double x1 = 2;
	double y1 = 3;

	double x2 = 1;
	double y2 = 4;
	Coordinate obj1 = new Coordinate(x1, y1);
	Coordinate obj2 = new Coordinate(x2, y2);

	double x3 = 9;
	double y3 = 8;

	double x4 = 6;
	double y4 = 7;
	Coordinate obj3 = new Coordinate(x3, y3);
	Coordinate obj4 = new Coordinate(x4, y4);

	Object actual;
	Object expected = "1 точка ближе";

	@Test
	public void test1() {

		actual = Coordinate.isNear(obj1, obj2);

		assertEquals(expected, actual);

	}

	@Test
	public void test2() {

		actual = Coordinate.isNear(obj3, obj4);

		assertNotEquals(expected, actual);

	}

}