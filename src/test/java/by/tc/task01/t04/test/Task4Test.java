package by.tc.task01.t04.test;

import org.junit.Assert;
import org.junit.Test;

import by.tc.task01.t04.Task4;

public class Task4Test {
	int A = 5;
	int B = 6;
	int C = 7;
	int D = 9;

	int M = 1;
	int N = 2;
	int K = 3;
	int L = 4;

	boolean actual;
	boolean expected = false;
	Task4 obj = new Task4();

	@Test
	public void test1() {

		actual = obj.method(A, B, C, D);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void test2() {

		actual = obj.method(M, N, K, L);

		Assert.assertNotEquals(expected, actual);

	}

}