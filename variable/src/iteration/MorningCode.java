package iteration;

public class MorningCode {
	public static void main(String[] args) {
		int sum7 = 0;
		int sum8 = 0;
		for (int i = 0; i <= 50; i++) {
			if (i % 7 == 0) {
				System.out.println(i + sum7);
			} else if (i % 8 == 0) {
				System.out.println(i + sum8);
			}
		}
	}
}
