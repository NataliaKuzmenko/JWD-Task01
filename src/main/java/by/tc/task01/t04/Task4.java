package by.tc.task01.t04;

public class Task4 {

	/*
	 * Составить программу, печатающую значение true, если указанное высказывание
	 * является истинным, и false — в противном случае: среди заданных целых чисел
	 * А, В, С, D есть хотя бы два четных.
	 */

	public boolean method(int A, int B, int C, int D) {
		int count = 0;
		int abc[] = new int[] { A, B, C, D };
		for (int i = 0; i < abc.length; i++) {
			if (abc[i] % 2 == 0) {
				count++;
			}
		}
		return count >= 2;

	}

}
