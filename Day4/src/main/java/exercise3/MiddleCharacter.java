package exercise3;

public class MiddleCharacter {

	public static void printMiddleCharacter(String s) {
		// length of string
		int len = s.length();

		// determine if string is odd or even
		if ((len % 2) == 0) {
			int mid = len / 2;
			System.out.println("The middle character is: " + s.charAt(mid - 1) + s.charAt(mid));
		} else {
			int mid = (len / 2);
			System.out.println("The middle character is: " + s.charAt(mid));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "castle";
		printMiddleCharacter(s);
	}

}
