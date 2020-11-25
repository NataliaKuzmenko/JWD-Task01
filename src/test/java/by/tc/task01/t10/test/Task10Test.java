package by.tc.task01.t10.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;

import org.junit.Test;

import by.tc.task01.t10.Task10;

public class Task10Test {

	double a = 0;
	double b = 60;
	double h = 15;

	double h2 = 30;

	double[][] actual;
	double[][] expected = { { 0.0, 0.0 }, { 15.0, 0.2679491924311227 }, { 30.0, 0.5773502691896257 },
			{ 45.0, 0.9999999999999999 }, { 60.0, 1.7320508075688767 } };
	Task10 obj = new Task10();

	@Test
	public void test1() {

		actual = obj.tableData(a, b, h);

		assertArrayEquals(expected, actual);

	}

	@Test
	public void test2() {

		actual = obj.tableData(a, b, h2);

		assertFalse(Arrays.equals(expected, actual));

	}

}
