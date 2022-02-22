package a03_연산자;

public class Operation04 {

	public static void main(String[] args) {
		/*논리연산자 -boolean
		 *  and:&& : 곱
		 *   or:|| :합
		 *   not:! :부정
		 *   true(1) ,false(0)
		 *   true&&true =true
		 *   true&&false=false
		 *   true||true =true
		 *   true||false =true
		 *   false||false =false
		 *   (true||false)!=false
		 *   !true||false=false (괄호없으면 해당글자만 적용)
		 *   
*/
		int score = -10;
		
		boolean result;
		//score 가 음수 ! 100초과도!
		result = score <0 || score > 100;
		System.out.println("결과:" + result);
		
		int score2 =50;
		result = score2 <0 || score > 100 ;
		System.out.println("결과:" + result);
		
		char grade  ='a';
		//grade =소문자여도 되고 대문자여도 되는데
		  // a,b,c 소,대문자 제외 모두 false
		result = grade == 'a' ||   grade == 'A'  || grade == 'b'  || grade == 'B'  || grade == 'c'  || grade == 'C' ;
		System.out.println("결과2:" + result);
		
           		
	}

}
