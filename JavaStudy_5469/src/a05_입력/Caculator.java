package a05_입력;

import java.util.Scanner;

public class Caculator {

	public static void main(String[] args) {
		/*
		 * 세수를 입력받는다.
		 * x y z
		 * 
		 * 세수를 입력하세요:10 20 30
		 * 
		 * 세수의 합: 60
		 * 
		 * 세 수를 입력하세요:5 2 1
		 * 
		 * 세수의 곱: 10
		 * 
		 * 세수를 입력하세요:50 2 2
		 * 
		 * 앞의 두수의 곱에 세번째 수로 나눈 나머지: 0
		 * */
		
		Scanner sc = new Scanner(System.in);
		int X = 0;
		int Y = 0;
		int Z = 0;
		int result = 0;
		System.out.print("세 수를 입력 하세요: ");
		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextInt();
		result = X + Y + Z;
		System.out.println("세 수의 합: " + result);
		
		System.out.print("세 수를 입력 하세요: ");
		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextInt();
		result = X * Y * Z;
		System.out.println("세 수의 곱: " + result);

		
		System.out.print("세 수를 입력 하세요: ");
		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextInt();
		result = (X * Y) % Z;
		System.out.println("앞의 두수의 곱에 세번째 수로 나눈 나머지: " + result);
		
		
		

	}

}
