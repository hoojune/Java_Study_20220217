package a07_반복;

import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		
		/*
		 * 1.몇단부터 몇단까지 출력할것인지 입력
		 * start index :5
		 * end index : 8*/
		Scanner sc =new Scanner(System.in);
		int startIndex = 0;
		int endIndex = 0 ;
		System.out.print("시작단: ");
		startIndex = sc.nextInt();
		System.out.print("마지막단: ");
		endIndex = sc.nextInt();
		System.out.println(startIndex + "단부터" + endIndex + "단까지 출력");
		
//		for(int i = startIndex ; i < (endIndex + 1) ; i++) {
//			System.out.println(i + "단");
//			for(int j = 0; j < 9;) {
//				System.out.println(i + "X" + (++j) + "=" + (i*j));
//			}
//			System.out.println();
//		}	
		
		int i = startIndex  ;
		while( i < (endIndex + 1)) {
			System.out.println(i + "단");
			
			int j = 0 ;
			
			while(j < 9 ) {
				System.out.println(i + "X" + (++j) + "=" + (i*j));
			}System.out.println(); i++;
		}
		}
		}
		
	


