package array;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[][] intAry = new int[3][3];
		intAry[0] = new int[] { 11, 12, 13 };
		intAry[1] = new int[] { 21, 22, 23 };
		intAry[2] = new int[] { 31, 32, 33 };

		System.out.println(intAry[1][2]);

		System.out.println(intAry[0].length);

		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry.length; j++) {
				System.out.println("intAry [" + i + "," + j + "] >" + intAry[i][j]);
			}
		}

		// intAry2 배열의 각 합, 평균..
		// intAry2[0] => 합 : ??, 평균 : ??
		// intAry2[1] => 합 : ??, 평균 : ??
		// intAry2[2] => 합 : ??, 평균 : ??

		int intAry2[][] = { //
				{ 11, 12, 13 }, //
				{ 21 }, //
				{ 31, 32 } //
		}; //

		int sum = 0;
		for (int i = 0; i < intAry2.length; i++) {
			for (int j = 0; j < intAry2[i].length; j++) {
				sum += intAry2[i][j];
			}
			System.out.println("intAry [" + i + "] 합 : " + sum);
			System.out.println("intAry [" + i + "] 평균 : " + (sum / intAry2[i].length));
			sum = 0;
		}
	}
}
