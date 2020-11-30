package variable;

public class ReferenceExample {
	public static void main(String[] args) {
		String str1 = "Hello"; // 주소값..
		String str2 = "Hello"; // 주소값..
		String str3 = new String("Hello"); // 주소값..
		if (str1 == str3) {
			System.out.println("동일한 주소값.");
		} else {
			System.out.println("다른 주소값.");
		}
		if (str1.equals(str3)) {
			System.out.println("동일한 주소값.");
		} else {
			System.out.println("다른 주소값.");
		}
	}
}
