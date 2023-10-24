package hw_day11_DSA_RomanNumber;

public class RomanToIntegerConverter {

	public int convertRomanToInteger(String romanNumeral) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		int num = 0;
		int index = 0;

		while (romanNumeral.length() > 0 && index < symbols.length) {
			String symbol = symbols[index];
			if (romanNumeral.startsWith(symbol)) {
				num += values[index];
				romanNumeral = romanNumeral.substring(symbol.length());
			} else {
				index++;
			}
		}

		if (romanNumeral.length() > 0 || num > 3999) {
			throw new IllegalArgumentException("Invalid Roman numeral or value out of range.");
		}
		return num;
	}

	
}