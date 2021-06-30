package exercise4;

public class CountVowels {

	public static void countVowels(String s) {
		// length of string
		int len = s.length();
		s.toLowerCase();

		// loop counter
		int vowels = 0;

		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vowels++;
			}
		}
		System.out.println("The total amount of vowels are: " + vowels);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "hello this is a string";
		countVowels(input);

	}

}
