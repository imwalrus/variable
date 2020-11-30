package array;

public class MorningCode {
	public static void main(String[] argd) {
		int[][] intAry = new int[5][5];

		int num = 0;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry.length; j++) {
				num = intAry[i][j];
				num++;
				System.out.println("intAry[" + i + "][" + j + "]");
			}
		}
		String[] strAry = { "Hello", "World" };
		for(String str : strAry) {
			System.out.println(str);
		}
	}
}