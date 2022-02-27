package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
//		첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
//		별은 가운데를 기준으로 대칭이어야 한다.
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//		첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		Scanner sc =new Scanner(System.in);
		int n = 0;
		System.out.print("반복 횟수 입력: ");
		n = sc.nextInt(); 
		
		for(int i =0; i< n ; i++) {
			for(int j = 0; j < n - i -1 ; j++) {
				System.out.print(" ");
			} 	
			for(int j = 0 ; j < (i *2)+1 ; j++) {
				System.out.print("*");
			}System.out.println();	
		}
		

	}

}
