package a08_함수;

import java.util.Scanner;

public class MethodEx3 {

	public static void printstar(int num) {
		if(num < 1) {
			System.out.println("별의개수는 1개이상을 입력하셔야합니다");
		}else{
			for(int i = 0;i < num; i++) {
			for(int j = 0; j < num - i -1; j++) {
				System.out.print(" ");
			}for(int j =0; j <(i*2)+1;j++) {
				System.out.print("*");
			}System.out.println();
		}
		}
	}
	public static void printstar2(int num) {
		if(num < 1) {
			System.out.println("별의개수는 1개이상을 입력하셔야합니다");
		}else{
		for(int i =0;i < num ; i++) {
			for(int j = 0 ; j < i+1 ;j++) {
				System.out.print("*");
			}System.out.println();
		}}
	}
	public static void printstar3(int num) {
		if(num < 1) {
			System.out.println("별의개수는 1개이상을 입력하셔야합니다");
		}else{
		for(int i =0; i < num ; i++) {
			for(int j = 0; j < num - i -1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i+1;j++) {
				System.out.print("*");
			}System.out.println();
		}}
	}
	public static void printstar4(int num) {
		if(num < 1) {
			System.out.println("별의개수는 1개이상을 입력하셔야합니다");
		}else{
	for(int i =0; i <num; i++) {
		for(int j =0;j < num -1; j++) {
			System.out.print("*");
		}System.out.println();
	}}
	}
	public static void printstar5(int num) {	
		if(num < 1) {
			System.out.println("별의개수는 1개이상을 입력하셔야합니다");
		}else{
		for(int i =0 ; i <num;i++) {
			for(int j =0 ; j <i;j++) {
				System.out.print(" ");
			}for(int j =0;j<num -i;j++) {
				System.out.print("*");
			}System.out.println();
		}}
	}
	public static void main(String[] args) {
		/*
		 * printstar(입력받은 별의 갯수)
		 * 1보다 작은 음수가 들어왔을때는
		 * 별의개수는 1개이상을 입력하셔야합니다 출력
		 * 
		 * 반복횟수 입력: 10
		 * 별찍기 모양 선택(1~5):
		 * 만약에 1~5가 안들어왔을때 계속 정상적인 값이 들어올때까지 계속 입력받기
		 * 정상적인 값이 들어왔을경우 해당 별찍기 실행
		 * */
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int select = 0;
		System.out.print("반복횟수입력: ");
		n = sc.nextInt();
		while(true) {
		System.out.print("별찍기 모양 선택(1~5): ");
		select = sc.nextInt();
		if(select ==1) {
			printstar(n);}
		else if(select ==2) {
			printstar2(n);
			break;
		}else if(select ==3) {
			printstar3(n);
			break;
		}else if(select ==4) {
			printstar4(n);
			break;
		}else if(select ==5) {
			printstar5(n);
			break;
		}else {
			System.out.println("별찍기 모양은 1~5중하나만 선택 하실수 있습니다.");
		}
		}
		}
		
		
	
}

