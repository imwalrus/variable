package iteration;

public class Exercise04 {
	public static void main(String[] args) {
		while (true) {
			int rv1 = (int) (Math.random() * 6) + 1;
			int rv2 = (int) (Math.random() * 6) + 1;
			int sum = rv1 + rv2;
			System.out.println("(" + rv1 + ", " + rv2 + ")");
			if (sum == 5) {
				System.out.println("종료");
				break;
			}
		}
	}
}