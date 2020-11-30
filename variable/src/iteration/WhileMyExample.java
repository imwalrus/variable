package iteration;

public class WhileMyExample {
	public static void main(String[] args) {
		int sum = 0, sum1 = 0;
		while (sum <= 10) {
			sum1 += sum;
			sum++;
		}
		System.out.println("1부터 10까지의 합 : " + sum1);

		int sum2 = 0, sum3 = 0;
		while (true) {
			sum3 += sum2;
			if (sum2 == 10) {
				break;
			}
			sum2++;
		}
		System.out.println("1부터 10까지의 합 : " + sum3);

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
