package day12;

import java.util.Scanner;

public class MainClass04 {

	public static void main(String[] args) {
		int k, e, m;
		//국, 영, 수, 합, 평균
		//각 셋,게터 생성, 연산하는 메소드 생성
		TestClass04 t = new TestClass04();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		k = sc.nextInt();
		t.setKor(k);
		System.out.print("영어 점수 : ");
		e = sc.nextInt();
		t.setEng(e);
		System.out.print("수학 점수 : ");
		m = sc.nextInt();
		t.setMath(m);
		
		t.setSum();
		
		System.out.println();
		System.out.println("국어 점수 : " + t.getKor());
		System.out.println("영어 점수 : " + t.getEng());
		System.out.println("수학 점수 : " + t.getMath());
		System.out.println("총합 : " + t.getSum());
		System.out.println("평균 : " + t.getAvg());

	}

}
