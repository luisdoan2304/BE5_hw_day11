package hw_day11_DSA_LongestSameString;

public class StringFinder {

	public static String longestCommonPrefix(String[] strings) {
		if (strings == null || strings.length == 0) {
			return "";
		}

		String prefix = strings[0];

		for (int i = 1; i < strings.length; i++) {
			while (strings[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		return prefix;
	}
}
