package by.tc.task01.t06;

public class Task6 {
	/*
	 * Идет n-я секунда суток, определить, сколько полных часов, полных минут и
	 * секунд прошло к этому моменту.
	 */
	
	public String getTime(int x) {
		int sec = x % 60;
		int min = x / 60 % 60;
		int hours = x / 60 / 60;
		return hours + " hours " + min + " min " + sec + " s";
	}

}
