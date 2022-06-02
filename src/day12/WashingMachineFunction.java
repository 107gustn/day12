package day12;

import java.util.Scanner;

public class WashingMachineFunction {
	Scanner sc = new Scanner(System.in);
	int wHigh, wTemp, runTime, totalTime;
	int startNum = 0, spindry, dry;
	String wPower;
	
	// 1 세탁 시작
	public void machinstart() {
		totalTime = wHigh + wTemp + runTime + spindry + dry;
		boolean startflag = true;
		while(startflag)
		switch(startNum) {
		case 1:
			if(startNum == 1) {
				System.out.println("일반 세탁 입니다.");
				System.out.println("물 높이 : " + wHigh);
				System.out.println("물 세기 : " + wPower);
				System.out.println("물 온도 : " + wTemp + "도");
				System.out.println("세탁 시간 : " + runTime + "분");
				System.out.println("탈수 시간 : " + spindry + "분");
				System.out.println("건조 시간 : " + dry + "분");
				System.out.println("총 소요시간 : " + totalTime + "분");
				System.out.println("세탁을 시작합니다.");
				startflag = false;
			} else if(startNum == 2) {
				System.out.println("급속 세탁 입니다.");
				System.out.println("물 높이 : " + wHigh);
				System.out.println("물 세기 : " + wPower);
				System.out.println("물 온도 : " + wTemp + "도");
				System.out.println("세탁 시간 : " + runTime + "분");
				System.out.println("탈수 시간 : " + spindry + "분");
				System.out.println("건조 시간 : " + dry + "분");
				System.out.println("총 소요시간 : " + totalTime + "분");
				System.out.println("세탁을 시작합니다.");	
				startflag = false;
			} else if (startNum == 3) {
				System.out.println("섬세 세탁 입니다.");
				System.out.println("물 높이 : " + wHigh);
				System.out.println("물 세기 : " + wPower);
				System.out.println("물 온도 : " + wTemp + "도");
				System.out.println("세탁 시간 : " + runTime + "분");
				System.out.println("탈수 시간 : " + spindry + "분");
				System.out.println("건조 시간 : " + dry + "분");
				System.out.println("총 소요시간 : " + totalTime + "분");
				System.out.println("세탁을 시작합니다.");
				startflag = false;
			}
			break;
		case 2:
			System.out.println("===  탈수  ===");
			System.out.println("남은 탈수 시간 :" + spindry);
			System.out.println("탈수를 시작합니다.");
			startflag = false;
			break;
		case 3:
			System.out.println("===  건조  ===");
			System.out.println("남은 건조 시간 : " + dry);
			System.out.println("건조 시작합니다.");
			startflag = false;
			break;
		default:
			System.out.println("세탁이 설정되지 않았습니다.");
			machincos();
		}
	}
	
	
	
	//2 탈수
	public void spin() {
		int inSpinTime;
		System.out.print("탈수 시간 설정 : ");
		inSpinTime = sc.nextInt();
		spindry = inSpinTime;
		System.out.println("탈수 시간 설정이 완료되었습니다.\n");
//		startNum = 2;
	}
	
	//3 건조
	public void dry() {
		int inDryTime;
		System.out.print("건조 시간 설정 : ");
		inDryTime = sc.nextInt();
		dry = inDryTime;
		System.out.println("건조 시간 설정이 완료되었습니다.\n");
//		startNum = 3;
	}
	
	//4 코스 설정
	public void machincos() {
		boolean mflag = true;
		int cosSelect;
		
		while(mflag) {
			System.out.println("1. 일반 코스");
			System.out.println("2. 급속 코스");
			System.out.println("3. 섬세 코스");
			System.out.println(">>> ");
			cosSelect = sc.nextInt();
			switch(cosSelect) {
			case 1:
				wHigh = 5;
				wPower = "중"; 
				wTemp = 30;
				runTime = 30; 
				spindry = 15;
				dry = 30;
				System.out.println("일반 코스 입니다.");
				System.out.println("물 높이 : " + wHigh);
				System.out.println("물 세기 : " + wPower);
				System.out.println("물 온도 : " + wTemp + "도");
				System.out.println("세탁 시간 : " + runTime + "분");
				System.out.println("탈수 시간 : " + spindry + "분");
				System.out.println("건조 시간 : " + dry + "분");
				startNum = 1;
				mflag = false;
				break;
			case 2:
				wHigh = 3;
				wPower = "중"; 
				wTemp = 15;
				runTime = 15; 
				spindry = 15;
				dry = 10;
				System.out.println("급속 코스 입니다.");
				System.out.println("물 높이 : " + wHigh);
				System.out.println("물 세기 : " + wPower);
				System.out.println("물 온도 : " + wTemp + "도");
				System.out.println("세탁 시간 : " + runTime + "분");
				System.out.println("탈수 시간 : " + spindry + "분");
				System.out.println("건조 시간 : " + dry + "분");
				startNum = 2;
				mflag = false;
				break;
			case 3:
				wHigh = 5;
				wPower = "중"; 
				wTemp = 15;
				runTime = 30; 
				spindry = 20;
				dry = 30;
				System.out.println("섬세 코스 입니다.");
				System.out.println("물 높이 : " + wHigh);
				System.out.println("물 세기 : " + wPower);
				System.out.println("물 온도 : " + wTemp + "도");
				System.out.println("세탁 시간 : " + runTime + "분");
				System.out.println("탈수 시간 : " + spindry + "분");
				System.out.println("건조 시간 : " + dry + "분");
				startNum = 3;
				mflag = false;
				break;
			default:
				System.out.println("다시 고르세요.");
			}
		}
	}
	

}
