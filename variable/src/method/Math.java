package method;

public class Math {

	public int sum(int a, int b) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}

	private double pi = 3.14;

	public double getArea(double pi, double r) {
		return pi * r * r;
	}

	// 정사각형 메소드
	public double getRectagle(double a) {
		return a * a;
	}

	// 직사각형 메소드
	public double getRectagle(double b, double c) {
		return b * c;
	}

	// int 배열의 합 구하는 메소드.
	public int getArySum(int[] ary) {
		int sum = 0;
		for (int num : ary) {
			sum += num;
		}
		return sum;
	}
	// (키 - 100) * 0.9 = 적정 몸무게
	public double getProperWeight(Person p1) {
		double properweight = (p1.height - 100) * 0.9;
		return properweight;
	}
}