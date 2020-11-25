package by.tc.task01.t09;

public class Task9 {
	/*
	 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса
	 * R.
	 */ 

	public double lengthOfCircle(double r) {
		double C = 2 * Math.PI * r;
		return C;
	}

	public double areaOfCircle(double r) {
		double S = Math.PI * Math.pow(r, 2);
		return S;
	}

}
