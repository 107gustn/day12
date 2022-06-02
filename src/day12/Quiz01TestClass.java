package day12;

public class Quiz01TestClass {
	private int age;
	
	public void setting() {
		this.age = this.age - 1; //밖의 변수는 this를 붙여서 구분해준다.
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age; //밖의 변수 age = 나 자신의 age
	}
	
}
