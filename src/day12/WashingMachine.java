package day12;

import java.util.Scanner;

public class WashingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WashingMachineFunction wmf = new WashingMachineFunction();
		int sel;
		boolean flag = true;

		while(flag) {
			System.out.println("=== 메인 화면 ===");
			System.out.println("1.세탁 시작");
			System.out.println("2.탈수");
			System.out.println("3.건조");
			System.out.println("4.예약 시간 설정");
			System.out.println("5.기능 설정");
			System.out.println("6.시스템 종료");
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
				System.out.println("다시 고르세요.\n");
			}
		}
	}
}
