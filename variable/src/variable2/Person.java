package variable2;

public class Person {
	// 필드
	String name;
	int age;
	double height;
	double weight;
	
	// 생성자 : 필드의 초기값 지정.
	public Person() {
		this.name = "초기이름";
		this.age = 10;
		this.height = 170.0;
		this.weight = 65.0;
	}

	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight=weight;
	}
	
	// 메소드
	public void showInfor() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 키 : " + height + ", 몸무게 : " + weight);
	}

	// 필드에 값을 저장, 불러오는 기능
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		if (age >= 0)
			this.age = age;
		else
			this.age = 0;
	}

	public int getAge() {
		return this.age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return this.height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return this.weight;
	}
}
