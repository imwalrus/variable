package variable;

public class ArrayExample1 {
	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				sum += numbers[i];
			}
		}
		System.out.println("홀수 총 값 : " + sum);
	}
}

