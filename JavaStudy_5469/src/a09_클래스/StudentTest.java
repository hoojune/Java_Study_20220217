package a09_클래스;



public class StudentTest {
/*
 * Student(클래스)
 * 속성
 * schoolName , studentYear , studentGroup , studentNumber , studentName , studentAddress,studentPhone,graduationFlag(booelean)
 * 
 * 기능 (메소드)
 * showStudentInfo()
 * 학교명:부산고등학교
 * 학년:3
 * 반:2
 * 번호:10
 * 이름:성호준
 * 주소:부산 동구
 * 연락처:010 -1234-5678
 * 졸업구분 : true(졸업), false(재학중);
 * 
 * incrementYear()
 * 학년 +1
 * 학년이 3학년을 넘어서면 graduationFalg =true;
 * */
	public static void main(String[] args) {
		student s1 = new student("부산고등학교", 1 , 2 , 10 ,"성호준","부산시 동구","010-1234-5678",false);  //정의된 매개변수를()에서 쓸수있음
//		s1.schoolName ="부산고등학교";
//		s1.studentYear = 1;
//		s1.studentGroup =2;
//		s1.studentNumber = 10;
//		s1.studentName= "성호준";
//		s1.studentAddress ="부산시 동구";
//		s1.studentPhone = "010-1234-5678";
//		s1.graduationFalg =false;
		s1.incrementYear();
		s1.incrementYear();
		s1.incrementYear();
		s1.showStudentInfo();

		student s2 = new student("경남고등학교","성호준");
	}

}
