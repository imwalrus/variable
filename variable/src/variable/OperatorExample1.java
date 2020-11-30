package variable;

public class OperatorExample1 {
	public static void main(String[] args) {
		String str = "Hello";
		str += " World";
		System.out.println(str);

		int num1 = 10;
		num1 += 5; // 15
		num1 -= 3; // 12
		num1 *= 5; // 60
		num1 /= 6; // 10
		System.out.println("num1 : " + num1);

		int num2 = 10;
		num2 = num2 + 1; // 11
		num2++; // (+1) 12
		num2--; // (-1) 11
		num2--; // (-1) 10
		System.out.println("num2 : " + num2);

		int num3 = 10;
		num3 -= 5;
		num3 -= 5;
		if (num3 > 0) {
			System.out.println("num3은 0보다 큽니다.");
		} else if (num3 < 0) {
			System.out.println("num3은 0보다 작습니다.");
		} else {
			System.out.println("num3은 0입니다.");
		}
		int num4 = 30;
		num4 /= 2;
		num4 /= 2;
		if (num4 % 2 == 0) {
			System.out.println("num4는 짝수 입니다.");
		} else {
			System.out.println("num4는 홀수 입니다.");
		}
		boolean result = true;
		String result1 = (num4 % 2) == 0 ? "True" : "False";
		System.out.println(result1); // ? = if를 대체
	}
}