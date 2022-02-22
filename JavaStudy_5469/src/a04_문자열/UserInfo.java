package a04_문자열;

import java.util.Scanner;
 //단축기 ctrl + shift +0
//scanner +ctrl +space(아무것도 없을때)
public class UserInfo {

	public static void main(String[] args) {
		/*
		 * username(아이디)
		 * password(비밀번호)
		 * year(년도)
		 * month(월)
		 * day(일)
		 * name(이름)
		 * adderss(주소) 부산 동구 범일동*/
		Scanner sc = new Scanner(System.in);
		String username = sc.next(); 
		sc.nextLine();
		String password = sc.nextLine();
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		String name = sc.next();
		String adderss=sc.nextLine();  /*<--Enter를 먹음*/
		
		System.out.println("아이디 : " + username);
		System.out.println("비밀번호: " + password);
		System.out.println("생년월일:" + year + "/" + month + day );
		System.out.println("이름: " + name);
		System.out.println("주소: " +adderss );
		
		

	}

}
