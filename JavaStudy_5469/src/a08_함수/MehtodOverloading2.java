package a08_함수;

import java.util.Scanner;

/*
 * 계산기
 * 입력
 * 첫번째 수입력
 * 
 * 사칙연산(+.-.*,/)
 * 
 * 두번째 수입력
 * 결과를 출력
 * 
 * 정수와 실수 모두 계산 가능해야한다.*/

public class MehtodOverloading2 {
	public static String calc1(double num1 ,double num2 , String select) {
		String result = null;
		if(select == "+")	{
			result = Double.toString(num1 + num2);
		}else if(select == "-") {
			result = Double.toString(num1 - num2);
		}else if(select == "*") {
			result = Double.toString(num1 * num2);
		}else if(select == "/") {
			result = Double.toString(num1 / num2);
		}else {
			result = "계산 할 수 없는 연산자입니다.";
		}
		return result;
	}
	public static String calc2(int num1 ,int num2 , String select) {
		String result = null;
		if(select == "+")	{
			result = Integer.toString(num1 + num2);
		}else if(select == "-") {
			result = Integer.toString(num1 - num2);
		}else if(select == "*") {
			result = Integer.toString(num1 * num2);
		}else if(select == "/") {
			result = Integer.toString(num1 / num2);
		}else {
			result = "계산 할 수 없는 연산자입니다.";
		}
		return result;
	}
	public static String calc3(int num1 ,double num2 , String select) {
		String result = null;
		if(select == "+")	{
			result = Integer.toString(num1) + Double.toString(num2);
		}else if(select == "-") {
			result = Integer.toString(num1) + Double.toString(num2);
		}else if(select == "*") {
			result = Integer.toString(num1) + Double.toString(num2);
		}else if(select == "/") {
			result = Integer.toString(num1) + Double.toString(num2);
			
		}else {
			result = "계산 할 수 없는 연산자입니다.";
		}
		return result;
	}
	public static String calc4(double num1 ,int num2 , String select) {
		String result = null;
		if(select == "+")	{
			result =Double.toString(num2) + Integer.toString(num2);
		}else if(select == "-") {
			result =Double.toString(num2) + Integer.toString(num2);
		}else if(select == "*") {
			result =Double.toString(num2) + Integer.toString(num2);
		}else if(select == "/") {
			result =Double.toString(num2) + Integer.toString(num2);
		}else {
			result = "계산 할 수 없는 연산자입니다.";
		}
		return result;
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String num1 = null;
	String num2 = null;
	String select = null;
	System.out.println("첫번째 수 입력: ");
	num1 = sc.next();
	System.out.println("연산할 기호를 선택하세요: ");
	select = sc.next();
	System.out.println("두번째 수 입력: ");
	num2 = sc.next();
	
	System.out.println("결과: " + calc1(Double.parseDouble(num1),Double.parseDouble(num2),select));
	System.out.println("결과: " + calc2(Integer.parseInt(num1),Integer.parseInt(num2),select));
	System.out.println("결과: " + calc3(Integer.parseInt(num1),Double.parseDouble(num2),select));
	System.out.println("결과: " + calc4(Double.parseDouble(num1),Integer.parseInt(num2),select));
		
			
		
			
		

		

	
		
	}

}
