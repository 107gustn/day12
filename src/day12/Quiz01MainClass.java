package day12;

import java.util.Scanner;

public class Quiz01MainClass {

	public static void main(String[] args) {
		
		/*
	 	나이도 저장하는 기능을 만들어 주세요
	 	set, get 메소드 생성
	 	그리고 나이를 만으로 연산하는 메소드도 만들어 주세요
	 	입력 : 나이 입력 : 20
	 	출력 : 나이는 : 19 세 이군요
		*/
		
		Quiz01TestClass t = new Quiz01TestClass();
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		t.setAge(age);
		t.setting();
		System.out.println("나이는 : " + t.getAge() + "세 이군요.");
		

	}

}
