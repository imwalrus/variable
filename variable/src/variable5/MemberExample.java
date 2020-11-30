package variable5;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		System.out.println("이름 : " + m1.getMName());
		Member m2 = new Member(1, "010-1234-5678", "Lee", "수영");
		System.out.println("이름 : " + m2.getMName());
		Member m3 = new Member(2, "Hong");
		System.out.println("이름 : " + m3.getMName());
	}
}
