package day12;

public class Quiz01TestClass {
	private int age;
	
	public void setting() {
		this.age = this.age - 1; //���� ������ this�� �ٿ��� �������ش�.
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age; //���� ���� age = �� �ڽ��� age
	}
	
}
