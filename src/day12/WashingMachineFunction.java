package day12;

import java.util.Scanner;

public class WashingMachineFunction {
	Scanner sc = new Scanner(System.in);
	int wHigh, wTemp, runTime, totalTime;
	int startNum = 0, spindry, dry;
	String wPower;
	
	// 1 ��Ź ����
	public void machinstart() {
		totalTime = wHigh + wTemp + runTime + spindry + dry;
		boolean startflag = true;
		while(startflag)
		switch(startNum) {
		case 1:
			if(startNum == 1) {
				System.out.println("�Ϲ� ��Ź �Դϴ�.");
				System.out.println("�� ���� : " + wHigh);
				System.out.println("�� ���� : " + wPower);
				System.out.println("�� �µ� : " + wTemp + "��");
				System.out.println("��Ź �ð� : " + runTime + "��");
				System.out.println("Ż�� �ð� : " + spindry + "��");
				System.out.println("���� �ð� : " + dry + "��");
				System.out.println("�� �ҿ�ð� : " + totalTime + "��");
				System.out.println("��Ź�� �����մϴ�.");
				startflag = false;
			} else if(startNum == 2) {
				System.out.println("�޼� ��Ź �Դϴ�.");
				System.out.println("�� ���� : " + wHigh);
				System.out.println("�� ���� : " + wPower);
				System.out.println("�� �µ� : " + wTemp + "��");
				System.out.println("��Ź �ð� : " + runTime + "��");
				System.out.println("Ż�� �ð� : " + spindry + "��");
				System.out.println("���� �ð� : " + dry + "��");
				System.out.println("�� �ҿ�ð� : " + totalTime + "��");
				System.out.println("��Ź�� �����մϴ�.");	
				startflag = false;
			} else if (startNum == 3) {
				System.out.println("���� ��Ź �Դϴ�.");
				System.out.println("�� ���� : " + wHigh);
				System.out.println("�� ���� : " + wPower);
				System.out.println("�� �µ� : " + wTemp + "��");
				System.out.println("��Ź �ð� : " + runTime + "��");
				System.out.println("Ż�� �ð� : " + spindry + "��");
				System.out.println("���� �ð� : " + dry + "��");
				System.out.println("�� �ҿ�ð� : " + totalTime + "��");
				System.out.println("��Ź�� �����մϴ�.");
				startflag = false;
			}
			break;
		case 2:
			System.out.println("===  Ż��  ===");
			System.out.println("���� Ż�� �ð� :" + spindry);
			System.out.println("Ż���� �����մϴ�.");
			startflag = false;
			break;
		case 3:
			System.out.println("===  ����  ===");
			System.out.println("���� ���� �ð� : " + dry);
			System.out.println("���� �����մϴ�.");
			startflag = false;
			break;
		default:
			System.out.println("��Ź�� �������� �ʾҽ��ϴ�.");
			machincos();
		}
	}
	
	
	
	//2 Ż��
	public void spin() {
		int inSpinTime;
		System.out.print("Ż�� �ð� ���� : ");
		inSpinTime = sc.nextInt();
		spindry = inSpinTime;
		System.out.println("Ż�� �ð� ������ �Ϸ�Ǿ����ϴ�.\n");
//		startNum = 2;
	}
	
	//3 ����
	public void dry() {
		int inDryTime;
		System.out.print("���� �ð� ���� : ");
		inDryTime = sc.nextInt();
		dry = inDryTime;
		System.out.println("���� �ð� ������ �Ϸ�Ǿ����ϴ�.\n");
//		startNum = 3;
	}
	
	//4 �ڽ� ����
	public void machincos() {
		boolean mflag = true;
		int cosSelect;
		
		while(mflag) {
			System.out.println("1. �Ϲ� �ڽ�");
			System.out.println("2. �޼� �ڽ�");
			System.out.println("3. ���� �ڽ�");
			System.out.println(">>> ");
			cosSelect = sc.nextInt();
			switch(cosSelect) {
			case 1:
				wHigh = 5;
				wPower = "��"; 
				wTemp = 30;
				runTime = 30; 
				spindry = 15;
				dry = 30;
				System.out.println("�Ϲ� �ڽ� �Դϴ�.");
				System.out.println("�� ���� : " + wHigh);
				System.out.println("�� ���� : " + wPower);
				System.out.println("�� �µ� : " + wTemp + "��");
				System.out.println("��Ź �ð� : " + runTime + "��");
				System.out.println("Ż�� �ð� : " + spindry + "��");
				System.out.println("���� �ð� : " + dry + "��");
				startNum = 1;
				mflag = false;
				break;
			case 2:
				wHigh = 3;
				wPower = "��"; 
				wTemp = 15;
				runTime = 15; 
				spindry = 15;
				dry = 10;
				System.out.println("�޼� �ڽ� �Դϴ�.");
				System.out.println("�� ���� : " + wHigh);
				System.out.println("�� ���� : " + wPower);
				System.out.println("�� �µ� : " + wTemp + "��");
				System.out.println("��Ź �ð� : " + runTime + "��");
				System.out.println("Ż�� �ð� : " + spindry + "��");
				System.out.println("���� �ð� : " + dry + "��");
				startNum = 2;
				mflag = false;
				break;
			case 3:
				wHigh = 5;
				wPower = "��"; 
				wTemp = 15;
				runTime = 30; 
				spindry = 20;
				dry = 30;
				System.out.println("���� �ڽ� �Դϴ�.");
				System.out.println("�� ���� : " + wHigh);
				System.out.println("�� ���� : " + wPower);
				System.out.println("�� �µ� : " + wTemp + "��");
				System.out.println("��Ź �ð� : " + runTime + "��");
				System.out.println("Ż�� �ð� : " + spindry + "��");
				System.out.println("���� �ð� : " + dry + "��");
				startNum = 3;
				mflag = false;
				break;
			default:
				System.out.println("�ٽ� ������.");
			}
		}
	}
	

}
