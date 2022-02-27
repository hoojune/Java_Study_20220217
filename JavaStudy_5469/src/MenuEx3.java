package a07_반복.메뉴;

import java.util.Scanner;

public class MenuEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char select = ' ';  
		boolean fFlag = true ;
		
		while(fFlag) {   /*외부 while*/
			System.out.println("[사용자 폴더]");
			System.out.println("1. 바탕화면");
			System.out.println("2. 문서");
			System.out.println("q. 프로그램종료");
			System.out.println("=======================");
			System.out.print("명령 선택: ");
			select =sc.next().charAt(0);
			
			if(select == '1') {
			while(true) { /*안쪽 while*/
				System.out.println("[사용자 폴더]");
				System.out.println("1. 롤");
				System.out.println("2. 크롬");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램종료");
				System.out.println("=======================");
				System.out.print("명령 선택: ");
				select =sc.next().charAt(0);
				
			if(select == '1') {
				System.out.println("롤을 실행합니다.");
			}else if(select == '2') {
				System.out.println("크롬 브라우저를 실행합니다.");}
				else if(select == 'b') {
					System.out.println("뒤로가기");
					break;
			}else if(select == 'q') {
				System.out.println("프로그램 종료중...");
				fFlag = false;  /*먼저 주고 /더이상 반복하지 않는다.*/
				break; /*fFlag에 break건다*/
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

