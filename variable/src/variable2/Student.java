package variable2;

public class Student {
	// 필드
	private String sName; // 이름
	private int sNo; // 학번
	private int eScore; // 영어점수
	private int mScore; // 수학점수

	//생성자
	
	
	// 메소드
	public void studentInfo() {
		System.out.println("이름 : " + sName + ", 학번 : " + sNo + " 입니다.");
	}

	public int totalScore() {
		return eScore + mScore;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public void seteScore(int eScore) {
		this.eScore = eScore;
	}

	public void setmScore(int mScore) {
		this.mScore = mScore;
	}
}