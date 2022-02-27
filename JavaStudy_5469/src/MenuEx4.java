package a07_반복.메뉴;

import java.util.Scanner;

public class MenuEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char select = ' ';  
		boolean fFlag = true ;
		
		
		while(fFlag) {   /*외부 while*/
			boolean sFlag = true;
			System.out.println("[사용자 폴더]");
			System.out.println("1. 바탕화면");
			System.out.println("2. 문서");
			System.out.println("q. 프로그램종료");
			System.out.println("=======================");
			System.out.print("명령 선택: ");
			select =sc.next().charAt(0);
			
			if(select == '1') {
			while(sFlag) { /*안쪽 while*/  /*실행되기전에 다시 true로 변경*/
				System.out.println("[문서 폴더]");
				System.out.println("1. 그림");
				System.out.println("2. 음악");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램종료");
				System.out.println("=======================");
				System.out.print("명령 선택: ");
				select =sc.next().charAt(0);
				
			if(select == '1') {
				System.out.println("그림폴더");
			}else if(select == '2') {
				System.out.println("음악폴더");}
				else if(select == 'b') {
					System.out.println("뒤로가기");
					sFlag = false;
			}else if(select == 'q') {
				System.out.println("프로그램 종료중...");
				fFlag = false;  /*먼저 주고 /더이상 반복하지 않는다.*/
				sFlag = false;
			}else {
				System.out.println("해당 폴더는 존재하지 않습니다.");
			}System.out.println("---------------------------------");
			}
			System.out.println("프로그램이 종료되었습니다.");
			/*바깥쪽 while문까지 나와서 반복종료*/
			}
		}
	}
}

