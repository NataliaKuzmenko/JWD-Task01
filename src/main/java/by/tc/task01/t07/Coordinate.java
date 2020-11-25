package by.tc.task01.t07;

public class Coordinate {
	/*
	 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
	 * которая из точек находится ближе к началу координат. x y.
	 */

	double x;
	double y;

	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static String isNear(Coordinate obj1, Coordinate obj2) {
		double x1 = obj1.x;
		double y1 = obj1.y;

		double x2 = obj2.x;
		double y2 = obj2.y;

		if ((Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2))) > (Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)))) {
			return "2 точка ближе";
		} else if ((Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2))) < (Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)))) {
			return "1 точка ближе";
		} else {
			return "Точки находятcя на равном расстоянии";
		}

	}

}
