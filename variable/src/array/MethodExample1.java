package array;

public class MethodExample1 {
	public static void main(String[] args) {
		showInfo("45");
		int result = showDouble(45);
		System.out.println("반환값 : " + result);
		System.out.println("반환 : " + showDouble(33.2));
		System.out.println(divide(15, 5) );
	}

	public static void showInfo(String name) {
		System.out.println("안녕하세요. " + name + "입니다.");
	}

	public static int showDouble(int num) {
		return num * 2;
	}

	public static double showDouble(double num) {
		return num * 2;
	}

	// 정수형 변수 2개를 받아서 두 수의 합을 반환해주는 메소드(sum)
	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	// 정수형 변수 3개를 받아의 세 수의 곱을 반화해주는 메소드(multi)
	public static int multi(int a, int b, int c) {
		int result = 0;
		result = a * b * c;
		return result;
	}

	// double 2개를 받아서 큰 수 / 작은 수 나누는 메소드 (divide)
	public static double divide(double a, double b) {
		double result = 0;
		if (a > b) {
			result = a / b;
		} else if (b > a) {
			result = b / a;
		}
		return result;
	}
}