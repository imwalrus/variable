package variable;

public class VariableExample {
	public static void main(String[] args) {
		String resultStr = "결과값은 ";
		int num1, num2, result;
		num1 = 30;
		num2 = 60;
		if (num1 < num2) {
			result = num2 - num1;
		} else {
			result = num1 - num2;
		}
		System.out.println(resultStr + result);
	}
}
