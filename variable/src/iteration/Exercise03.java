package iteration;

public class Exercise03 {
	public static void main(String[] args) {
		int i = 0, j = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				j += i;
			} else {
				continue;
			}
		}
		System.out.println("3의 배수의 합: " + j);
	}
}
