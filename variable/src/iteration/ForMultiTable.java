package iteration;

public class ForMultiTable {
	public static void main(String[] args) {
		int num = 2;
		for (int i = 1; i < 10; ++i) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		num++;
		for (int i = 1; i < 10; ++i) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		num++;
		for (int i = 1; i < 10; ++i) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		for (int num1 = 2; num1 < 10; num1++) {
				System.out.println("[" + num1 + "단]");
			for (int j = 1; j < 10; j++) {
				System.out.println(num1 + " * " + j + " = " + (num1 * j));
			}
		}
	}
}
