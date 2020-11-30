package array;

public class ArrayExample3 {
	public static void main(String[] args) {

		int num1 = 30, num2 = 20, num3 = 50;
		int temp;

		// 세 변수에 들어 있는 값중에서 가장 큰 값을 temp
		if (num1 > num2) {
			if (num1 > num3) {
				temp = num1;
			} else {
				temp = num3;
			}
		} else {
			if (num2 > num3) {
				temp = num2;
			} else {
				temp = num3;
			}
		}
		System.out.println("큰 수는 " + temp);

		int temp1 = 0;
		int[] intAry = { 34, 25, 57, 39, 55 };
		for (int num : intAry) {
			if (temp1 < num) {
				temp1 = num;
			}
		}
		System.out.println("큰 수는 " + temp1);
	}
}
