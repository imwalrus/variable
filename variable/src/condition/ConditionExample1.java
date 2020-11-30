package condition;

public class ConditionExample1 {
	public static void main(String[] args) {
		int score = 75;
		String grade = "";

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			grade = "F";
		}
		System.out.println(score + "점은 " + grade + "입니다.");
	}
}
