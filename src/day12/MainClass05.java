package day12;

import java.util.Scanner;

/*
������
- Ŭ���� �̸��� ������ �޼ҵ�
- ��ȯŸ���� ����.
- ���� �ʱ�ȭ�ϴ� �뵵�� ����Ѵ�.
- ��ü ������ ȣ��Ǵ� �޼ҵ��̴�.
- �����ڵ� �޼ҵ� �̱� ������ �����ε��� �����ϴ�
- Ŭ���� ��ü�� �����ڸ��� �ʱ�ȭ�� �ʿ��Ҷ� ���
- �ʱⰪ�� �ʿ��Ҷ� ����
*/
class AAA {//�ϳ��� ���������� ���� public�� �����Ѵ�
	private String version;
	
	public AAA() { //������ - Ŭ���� �̸��� �����ϰ� ������
		System.out.println("������ ����");
		//��ȯŸ�� X
	}
	
	public AAA(String v) { //�޼ҵ� �����ε�
		System.out.println(v + " : v ������");
		version = v;
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		AAA a = new AAA("10"); //��ü�� ���鶧 �ڵ����� �����ڸ� ȣ��
		AAA b = new AAA();
		
		String s = "aaaa";
		String ss = new String("�ȳ��ϼ���"); //�����ڿ��� ���� �����Ͽ� ��ü�� ������
		System.out.println(ss);
		Scanner on = new Scanner(System.in);

	}

}

