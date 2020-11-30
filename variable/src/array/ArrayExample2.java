package array;

public class ArrayExample2 {
	public static void main(String[] args) {
		double[] dAry;
		dAry = new double[] { 23.2, 55.3, 52.8, 62.8 };

		double sum = 0;
		sum = doublesum(dAry);
		System.out.println("결과값(합) : " + sum);

		double avg = 0;
		avg = doubleavg(dAry);
		System.out.println("결과값(평균) : " + avg);

	}

	// double [] => 23.2, 55.3, 52.8, 62.8 " dAry
	// method : doubleSum(), 매게변수 : double[]
	// 반환해주는 값 : double

	public static double doublesum(double[] dAry) {
		double sum = 0;
		for (double i : dAry) {
			sum += i;
		}
		return sum;
	}

	public static double doubleavg(double[] dAry) {
		double avg = 0;
		for (double i : dAry) {
			avg +=i;
		}
		return avg/dAry.length;
}
}