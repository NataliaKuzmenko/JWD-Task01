package by.tc.task01.t08;

public class Task8 {
	/* Вычислить значение функции */

	public double method(double x) {
		if (x >= 3) {
			x = -Math.pow(x, 2) + 3 * x + 9;
		} else {
			x = 1 / (Math.pow(x, 3) - 6);
		}
		return x;
	}

}
