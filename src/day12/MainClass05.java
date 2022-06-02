package day12;

import java.util.Scanner;

/*
생성자
- 클래스 이름과 동일한 메소드
- 반환타입은 없다.
- 값을 초기화하는 용도로 사용한다.
- 객체 생성시 호출되는 메소드이다.
- 생성자도 메소드 이기 때문에 오버로딩이 가능하다
- 클래스 객체를 만들자마자 초기화가 필요할때 사용
- 초기값이 필요할때 생성
*/
class AAA {//하나의 페이지에는 한의 public만 존재한다
	private String version;
	
	public AAA() { //생성자 - 클래스 이름과 동일하게 만들음
		System.out.println("생성자 실행");
		//반환타입 X
	}
	
	public AAA(String v) { //메소드 오버로딩
		System.out.println(v + " : v 생성자");
		version = v;
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		AAA a = new AAA("10"); //객체를 만들때 자동으로 생성자를 호출
		AAA b = new AAA();
		
		String s = "aaaa";
		String ss = new String("안녕하세요"); //생성자에게 값을 전달하여 객체를 만들음
		System.out.println(ss);
		Scanner on = new Scanner(System.in);

	}

}

