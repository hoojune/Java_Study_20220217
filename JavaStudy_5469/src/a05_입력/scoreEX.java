package a05_입력;

import java.util.Scanner;

public class scoreEX {

	public static void main(String[] args) {
		/*
		 * int score : 입력
		 * score 마이너스 점수이거나 100점을 넘으면 x출력
		 * 90이상A
		 * 80이상 B
		 * 70이상 C
		 * 60이상 D
		 * 그외 F
		 * 성적을 입력해 주세요
		 * 학생의 평점은 B등급입니다.*/

		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = 0;
		grade = score > -1 && score <101 ? 
				
		
		System.out.print("성적을 입력해 주세요.");
		
		score= sc.nextInt();
		
		System.out.print("학생의 평점은 " + grade + "등급입니다.");
		
		
		
		
		
		
	}

}
