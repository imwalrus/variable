package variable;

public class Exercise04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
		System.out.println("학생 한명이 가질 수 있는 연필은 " + pencilsPerStudent + "개이고 남는 연필 수는 " + pencilsLeft + "개이다.");
	}
}