package day12;

import java.util.Scanner;

public class Quiz01MainClass {

	public static void main(String[] args) {
		
		/*
	 	���̵� �����ϴ� ����� ����� �ּ���
	 	set, get �޼ҵ� ����
	 	�׸��� ���̸� ������ �����ϴ� �޼ҵ嵵 ����� �ּ���
	 	�Է� : ���� �Է� : 20
	 	��� : ���̴� : 19 �� �̱���
		*/
		
		Quiz01TestClass t = new Quiz01TestClass();
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		t.setAge(age);
		t.setting();
		System.out.println("���̴� : " + t.getAge() + "�� �̱���.");
		

	}

}
