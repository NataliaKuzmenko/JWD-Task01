package by.tc.task01.t05;

public class Task5 {
	/*
	 * Составить программу, печатающую значение true, если указанное высказывание
	 * является истинным, и false — в противном случае: является ли целое число
	 * совершенным (сумма делителей равна самому числу).
	 */ 
	
	public boolean method(int x) {
		int sumDel = 0;
		for (int i = (x - 1); i >0 ; i--) {
			if (x % i == 0) {
				sumDel += i;
			}
		}
		return x == sumDel;
	}

}
