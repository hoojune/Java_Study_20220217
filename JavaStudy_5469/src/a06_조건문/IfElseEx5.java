package a06_조건문;

import java.util.Scanner;

public class IfElseEx5 {

	public static void main(String[] args) {
		/*
		 * 점수를 입력받아서 해당점수가 몇등급인지 출력하는 문제
		 * 
		 * 점수를 입력하세요: 85
		 * 
		 * 학생의 평점은 B학점입니다.
		 * 
		 * 점수는 0~100사이만 입력가능
		 * 그외의 값이 들어왔을때는
		 * 점수는 0~100사이만 입력이 가능합니다.출력
		 * 
		 * 90~100 :A
		 * 80~89 :B
		 * 70~79:C
		 * 60~69:D
		 * 0~59:F*/
		Scanner sc = new Scanner(System.in);
		int i =0;
		String result = null;
		System.out.print("점수를 입력하세요: ");
		i = sc.nextInt();
		if(i > 100 || i < 0 ) {
			System.out.print("점수는 0~100사이만 입력이 가능합니다.");
	   }else {
		   if(i > 89) {
	        result ="A";
	   }else if(i > 79) {
			result = "B";}
		else if(i > 69) {
			result = "c";}
		else if(i > 59) {
			result ="D";}
		else {
		    result = "F";
		     }
		
		
		System.out.println("학생의 평점은" + result + "입니다." );
		
	   }
		}
	}
		
		
	
	

