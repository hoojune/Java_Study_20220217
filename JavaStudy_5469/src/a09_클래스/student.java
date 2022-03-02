package a09_클래스;

public class student { //속성,변수,레퍼런스,필드
	String schoolName,studentName,studentAddress,studentPhone;
	int studentYear,studentGroup,studentNumber;
	boolean graduationFalg;

	public student() {//자체가 주소 {
		System.out.println("기본 생성자 호출");
	} // 기본생성자
	
	public student(String schoolName,String studentName) { //오버로딩
		this.schoolName = schoolName;
		this.studentName = studentName;
	}
	
	
public student(String schoolName, int studentYear,int studentGroup,int studentNumber,
			String studentName, String studentAddress, String studentPhone,
			  boolean graduationFalg) { //전체필드생성자
		this(); //자기자신의 기본생성자 호출
		this.schoolName = schoolName;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentPhone = studentPhone;
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.graduationFalg = graduationFalg;  //this. : 자기자신의(해당) 주소
	} //alt + shift + s





//	public student(String schoolName,int studentYear,int studentGroup,int studentNumber,
//			String studentName, String studentAddress, String studentPhone,boolean graduationFalg) 
//	{//전체 필드 생성자 해당필드에 전달해야함
//		this.schoolName =schoolName ;}

	
	
	
	public void showStudentInfo() {
		System.out.println("학교명: " + schoolName);
		System.out.println("학년: " + studentYear);
		System.out.println("반: " + studentGroup);
		System.out.println("번호: " + studentNumber);
		System.out.println("이름: " + studentName);
		System.out.println("주소: " + studentAddress);
		System.out.println("연락처: " + studentPhone);
		System.out.println("졸업구분: " + (graduationFalg == true ? "졸업" : "재학중"));
	}
	public void incrementYear() {
		 if(studentYear > 2 && graduationFalg == false) { //재학상태에서 학년이 올라가면 졸업
			 graduationFalg = true;
			 
		 }else {
			 graduationFalg = false;
			 studentYear++;
		 }
		}
	}
