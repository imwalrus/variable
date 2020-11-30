package variable;

public class OperatorExample2 {
	public static void main(String[] args) {
		int num1 = 3;
		if (num1 % 2 == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}

		boolean result = true;
		String result1 = (num1 % 2) == 0 ? "True" : "False";
		System.out.println(result1);
	}
}