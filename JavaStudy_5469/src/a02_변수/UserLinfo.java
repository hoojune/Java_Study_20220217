package a02_변수;

public class UserLinfo {

	public static void main(String[] args) {
		/*
		 *학번 : 20220218'   ->studentCode(정수)
		 *이름 :성호준       ->name1 , name2 ,name3(문자)
		 *학년 :1            ->studentYear(정수)
		 *성적 :85.5         ->score(실수)
		 *평점 :B            ->grade(문자)
		 *성별 :남성(TRUE) 여성(FALSE)     ->gender(boolean)
		
		 * */
		
		int studentCode=20220218;
		char name1 = '성';
		char name2 = '호';
		char name3 = '준';
		int studentYear=1;
		double score = 85.5;
		char grade='B';
		boolean gender=true;
		
		
		System.out.println("학번 :" + studentCode);
		System.out.print("이름 :");
		System.out.println(""+ name1 + name2 +name3);
		System.out.print("학년 :");
		System.out.println(studentYear);
		System.out.print("성적 :");
		System.out.println(score);
		System.out.print("평점 :");
		System.out.println(grade);
		System.out.print("성별 :");
		System.out.println(gender);


	}

}
