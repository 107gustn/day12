package day12;

import java.util.Scanner;

public class WashingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WashingMachineFunction wmf = new WashingMachineFunction();
		int sel;
		boolean flag = true;

		while(flag) {
			System.out.println("=== ���� ȭ�� ===");
			System.out.println("1.��Ź ����");
			System.out.println("2.Ż��");
			System.out.println("3.����");
			System.out.println("4.���� �ð� ����");
			System.out.println("5.��� ����");
			System.out.println("6.�ý��� ����");
			System.out.println(">>> ");
			sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				wmf.machinstart();
				flag = false;
				break;
			case 2:
				wmf.spin();
				break;
			case 3:
				wmf.dry();
				break;
			case 4:
				wmf.machincos();
				break;
			case 5:
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("�ٽ� ������.\n");
			}
		}
	}
}
