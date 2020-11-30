package variable2;

public class StudentExample {
	public static void main(String[] arg) {
		Student s1 = new Student();
		s1.setsName("이재일");
		s1.setsNo(121212);
		s1.seteScore(80);
		s1.setmScore(70);
		
		s1.studentInfo();
		System.out.println("합계점수 : " + s1.totalScore());
	}
}
