package a08_함수;

public class FunctionEx {

	public static int calc/*함수이름*/(int x , int y, int z /*변수들*/) {  
		int result = x + y;
		int result2 = result * z;
		return result2;  /*자료형이 int다*/
	}
	/* class안에 만들어둔 함수를 메소드함수라고 한다*/
	/* 자바에서는 하나하나의 파일이 클래스이다.*/
	public static void main(String[] args) {
		
		System.out.println(calc(10,20,30));
		System.out.println(calc(11,20,30));
		System.out.println(calc(12,20,30));
		System.out.println(calc(13,20,30));
		System.out.println(calc(14,20,30));
	}

}
