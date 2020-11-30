package variable3;

public class MemberExample {
	public static void main(String[] args) {
		int id  = 1;
		String name = "이재일";
		String pNum = "010-1234-5678";
		String cClass = "스포츠댄스";
		
		Member m1 = new Member();
		System.out.println("회원번호 :" + id);
		System.out.println("이름 :" + name);
		m1.showMemberInfo();

		int id1  = 2;
		String name1 = "윤진섭";
		String pNum1 = "010-5678-1234";
		String cClass1 = "수영";
		
		Member m2 = new Member();
		System.out.println("회원번호 :" + id1);
		System.out.println("이름 :" + name1);
		m2.showMemberInfo();

		Member[] members = { m1, m2 };
		for (Member mem : members) {
			mem.showMemberInfo();
		}

	}
}