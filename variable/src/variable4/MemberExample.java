package variable4;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setmNo(1);
		m1.setmPnum("010-1234-5678");
		m1.setmName("이재일");
		m1.setmClass("수영");
		
		System.out.println(m1.getmNo());
		System.out.println(m1.getmPnum());
		System.out.println(m1.getmName());
		System.out.println(m1.getmClass());
		
		System.out.println(m1);
	}
}
