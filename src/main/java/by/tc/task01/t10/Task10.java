package by.tc.task01.t10;

import java.util.Arrays;

public class Task10 {
	/*
	 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
	 * шагом h. Результат представить в виде таблицы, первый столбец которой –
	 * значения аргумента, второй - соответствующие значения функции.
	 */

	// a - начало отрезка
	// b - конец отрезка
	// h - шаг
	public double[][] tableData(double a, double b, double h) {
		double[][] table = new double[(int) ((b - a) / h + 1)][];

		int j = 0;
		for (double i = a; i <= b; i += h) {

			double f = Math.tan(Math.toRadians(i));
			table[j] = new double[] { i, f };
			j++;
		}
		return table;
	}

	public void printTableData(double[][] table) {

		for (int index = 0; index < table.length; index++) {
			System.out.println(Arrays.toString(table[index]));
		}
	}
}
