package day12;

import java.util.Scanner;

public class MainClass04 {

	public static void main(String[] args) {
		int k, e, m;
		//��, ��, ��, ��, ���
		//�� ��,���� ����, �����ϴ� �޼ҵ� ����
		TestClass04 t = new TestClass04();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		k = sc.nextInt();
		t.setKor(k);
		System.out.print("���� ���� : ");
		e = sc.nextInt();
		t.setEng(e);
		System.out.print("���� ���� : ");
		m = sc.nextInt();
		t.setMath(m);
		
		t.setSum();
		
		System.out.println();
		System.out.println("���� ���� : " + t.getKor());
		System.out.println("���� ���� : " + t.getEng());
		System.out.println("���� ���� : " + t.getMath());
		System.out.println("���� : " + t.getSum());
		System.out.println("��� : " + t.getAvg());

	}

}
