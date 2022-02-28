package a08_함수;

import java.util.Scanner;

public class methodEx4 {

	public static int sum(int i ,int j) {
		return i + j;
	}
	public static void main(String[] args) {
		/*
		 * 두수를 입력받고 두수의 합을 구하는 메서드를 구현하라
		 * sum()
		 * return 두수의 합
		 * 
		 * 리턴된 수를  main메서드에서 출력하라*/
		
		Scanner sc =new Scanner(System.in);
		int i =0;
		int j =0;
		System.out.print("두수를 입력하세요: ");
		i = sc.nextInt();
		j = sc.nextInt();
		
		System.out.print(sum(i,j)); //메서도 호출 , sum자체가 값이다.		

	}

}
