package exercise2;

public class ExerciseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "cat";
		String y = "cat";
		System.out.println(x == y); // returns true

		x = new String("cat");
		System.out.println(x == y); // returns false

		StringBuilder sb = new StringBuilder("cat");
		System.out.println(sb);
		sb.append(" is nice"); // modify's immutable string
		System.out.println(sb);
	}

}
