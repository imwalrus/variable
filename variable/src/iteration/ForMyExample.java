package iteration;

public class ForMyExample {
	public static void main(String[] args) {
		for (int num = 0; num < 5; num++) {
			System.out.println("Hello World");
		}
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
			System.out.println("sum: " + sum);
		}
	}
}
