package a06_조건문;

import java.util.Scanner;

public class IfElseEx7 {

	public static void main(String[] args) {
		/*
		 * x,y
		 * x축: 10
		 * y축: 5
		 * 3사분면 입니다
		 * 원점입니다*/

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		String result = null;
		
		System.out.print("x축: ");
		x = sc.nextInt();
		System.out.print("y축: ");
		y = sc.nextInt();
		if(x == 0 && y == 0) {
			System.out.println("원점입니다.");
		}else {
			if(x > 0 && y >0) {
				result ="1사분면";}
		    else if(x < 0 && y >0 ) {
		    	result = "2사분면";}
		    else if(x < 0 && y < 0) {
		    	result ="3사분면";}
		    else {
		    	result ="4사분면";}
			
			System.out.println(result + "입니다.");
		}
		
	}

}
