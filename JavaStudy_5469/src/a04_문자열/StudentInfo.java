package a04_문자열;import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class StudentInfo {

	public static void main(String[] args) {
		String name ="성호준" ;
		System.out.println(name);
	/*2022년 02월 22일 year month day academy
	 * 코리아아카데미부산 학생정보*/
		
		int year1 =2022;
		int month1 =02;
		int day1 =22;
		
		String year = "" + (++ year1) ;
		String month ="" + (++ month1) ;
		String day = "" + (++ day1) ;
		
		System.out.println(Integer.parseInt(year) + 1);
		System.out.println(Integer.parseInt(month) + 1);
		System.out.println(Integer.parseInt(day) + 1);
		
		String academy = "코리아아카데미부산 학생정보";
		System.out.println();
		System.out.println(year + "년 " + month + "월 " + day + "일 " + academy + "학생정보");
		System.out.println("학생이름 : " + name );
		
	/*
	 * 문자열 형변환
	 * 문자열(String) -> Integer(int)
	 * Integer.parse/Int("100"); -> 숫자100으로 변환
	 * Double.parsedouble("15.123") -> 실수 15.123으로 변환
	 * Boolean.parseboolean("true")
	 * 
	 * 정수,실수 등을 문자열로 형변환
	 * Integer.toString(100); -> 문자열 100으로 변환
	 * Double.toString(3.14) ->문자열3.14로변환
	 * Boolean.toString(true) ->문자열true로 변환*/
	
	int num = Integer.parseInt("100");
	System.out.println(num + 20);
	double num2 = Double.parseDouble("15.123");
	System.out.println(num2 +20);
	System.out.println(!Boolean.parseBoolean("true"));
	
	String num3 = Integer.toString(100);
	System.out.println(num3 +200);
	
		
	}

}
