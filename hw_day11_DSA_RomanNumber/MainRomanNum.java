package hw_day11_DSA_RomanNumber;
import java.util.Scanner;
public class MainRomanNum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        RomanToIntegerConverter converter = new RomanToIntegerConverter();
        int result = converter.convertRomanToInteger(romanNumeral);

        System.out.println("The integer value of " + romanNumeral + " is " + result);

        

	}

}
