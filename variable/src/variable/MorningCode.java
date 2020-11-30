package variable;

public class MorningCode {
	public static void main(String[] args) {

		int[] numbers = { 23, 56, 34, 65, 28, 21 };
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				sum += numbers[i];
				avg = sum / 3;
			}
		}
		System.out.println("홀수값의 합 : " + sum);
		System.out.println("홀수값의 평균 : " + avg);

	}
}
