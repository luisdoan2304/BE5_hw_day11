package hw_day11_DSA_LongestSameString;

public class MainLongestSameString {

	public static void main(String[] args) {
		
		 String[] strings = {"flower", "flow", "flight"};
	        String result = StringFinder.longestCommonPrefix(strings);
	        System.out.println("The longest common prefix is: " + result);

	}

}
