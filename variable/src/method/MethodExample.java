package method;

public class MethodExample {
	public static void main(String[] args) {

		Math m1 = new Math();
		double sum = m1.sum(10.5, 20);
		System.out.println("결과: " + sum);

		Math m2 = new Math();
		double area = m2.getArea(3.14, 5.5);
		System.out.println("넓이: " + area + "mm");

		// 정사각형 넓이 : getRectagle, 매개변수 : 4.2
		Math m3 = new Math();
		double area2 = m2.getRectagle(4.2);
		System.out.println("넓이: " + area2);

		// 직사각형 넓이 : getRectagle, 매개변수 : 4.2, 2.4
		Math m4 = new Math();
		double area3 = m4.getRectagle(4.2, 2.4);
		System.out.println("넓이: " + area3);

		// 배열 { 5, 10, 15, 20}
		int ary[] = { 5, 10, 15, 20 };
		Math m5 = new Math();
		int sum1 = m5.getArySum(ary);
		System.out.println("결과: " + sum1);
		
		// 적정 몸무게 구하기
		Person p1 = new Person("이창호", 10, 165.5, 32.5);
		double d1 = m1.getProperWeight(p1);
		if(p1.weight > d1) {
			System.out.println("체중과다...");
		} else if(p1.weight == d1) {
			System.out.println("적정체중...");
		} else {
			System.out.println("체중미달...");
		}
	}
}
