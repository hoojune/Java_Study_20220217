package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다
		 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다*/
		Scanner sc =new Scanner(System.in);
		int num = 0;
		System.out.print("반복횟수입력: ");
		num = sc.nextInt();
		
		for(int i =0; i < num ;i++) {
			System.out.print(num - i);
		}
		
	}

}
