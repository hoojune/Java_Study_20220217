package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 * 학번: 20220001 ->studentCode(정수)
		 * 이름: 김도훈 ->name1, name2, name3 (문자)
		 * 학년: 1 ->studentYeadr(정수)
		 * 성적: 85.5 ->score(실수)
		 * 평점: B ->grade(문자)
		 * 성별: 남성(true), 여성(false) ->gender(boolean)
		 */
		int studentCode=2022001;
		char name1='김', name2='도', name3='훈';
		int studentYear=1;
		double score=85.5;
		char grade='B';
		boolean gender=true;
		
		System.out.print("학번: ");
		System.out.println(studentCode);
		
		System.out.print("이름: ");
		System.out.println(""+name1 + name2 + name3);
	//유니코드 숫자 합->+"" 문자열
		System.out.print("학년: ");
		System.out.println(studentYear);
		
		System.out.print("성적: ");
		System.out.println(score + 5.0);
		
		System.out.print("평점: ");
		System.out.println(grade);
	
		System.out.print("성별: ");
		System.out.println(gender);
		
		

	}

}
