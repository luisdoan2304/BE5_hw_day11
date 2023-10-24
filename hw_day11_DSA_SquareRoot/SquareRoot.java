package hw_day11_DSA_SquareRoot;

public class SquareRoot {
	public static double sqrt(int num) {
		double guess = num / 2.0;
		double threshold = 0.01;

		while (Math.abs(num - (guess * guess)) > threshold) {
			guess = (guess + (num / guess)) / 2.0;
		}

		return guess;
	}
}
