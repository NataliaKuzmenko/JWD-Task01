package by.tc.task01.t01;

/*Написать программу, позволяющую по последней цифре числа определить последнюю
	цифру его квадрата.*/

public class Task1 {

	public int method(int number) {

		number *= number;
		int result = number % 10;
		return result;
	}

}
