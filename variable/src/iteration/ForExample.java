package iteration;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += 10;
			System.out.println("i: " + i);
			System.out.println("sum: " + sum);
		}
	}
}
