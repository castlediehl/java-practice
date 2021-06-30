package exercise5;

public class Calculator {

	public static void add(int a, int b) {

		int answer = Math.addExact(a, b);
		System.out.println(a + " + " + b + " = " + answer);
	}

	public static void subtract(int a, int b) {

		int answer = Math.subtractExact(a, b);
		System.out.println(a + " - " + b + " = " + answer);
	}

	public static void multiply(int a, int b) {

		int answer = Math.multiplyExact(a, b);
		System.out.println(a + " * " + b + " = " + answer);
	}

	public static void divide(int a, int b) {

		int answer = Math.floorDiv(a, b);
		System.out.println(a + " / " + b + " = " + answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 9;
		int b = 2;
		add(a, b);
		subtract(a, b);
		multiply(a, b);
		divide(a, b);

	}

}
