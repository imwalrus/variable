package variable2;

public class VariableExample {
	public static void main(String[] argd) {
		int num = 10;
		String str = "Hello";
		double dbl = 3.4;

		String name = "Lee";
		int age = 10;
		double height = 178.8;

		String name1 = "Hwang";
		int age1 = 15;
		double height1 = 188.8;

		Person p1 = new Person("Choi", 20, 175.5, 72.3);
		System.out.println("p1의 이름 : " + p1.getName());
		System.out.println("p1의 나이 : " + p1.getAge());
		System.out.println("p1의 키 : " + p1.getHeight());
		System.out.println("p1의 몸무게 : " + p1.getWeight());
		System.out.println("==============");
		p1.setName("Lee");
		p1.setAge(16);
		p1.setHeight(183.9);
		p1.setWeight(74.2);	
		System.out.println("p1의 이름 : " + p1.getName());
		System.out.println("p1의 나이 : " + p1.getAge());
		System.out.println("p1의 키 : " + p1.getHeight());
		System.out.println("p1의 몸무게 : " + p1.getWeight());
//		p1.showInfor();

		Person p2 = new Person();
		p2.setName("Park");
		p2.setAge(15);
		p2.setHeight(168.9);
		p2.setWeight(54.2);
//		p2.showInfor();

		Person p3 = new Person();
		p3.setName("Kim");
		p3.setAge(16);
		p3.setHeight(178.9);
		p3.setWeight(64.2);
//		p2.showInfor();

		Person[] persons = { p1, p2, p3 };
		for (Person per : persons) {
//			System.out.println(per.name);
//			System.out.println(per.age);
//			System.out.println(per.height);
//			System.out.println();
			per.showInfor();
		}

//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.height);

	}
}