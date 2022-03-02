package a09_클래스;

public class Computer {
	String model; //주소만다르고 변수명을 계속 쓸수있다.(틀)  -->변수들의 속성
	
public Computer() { //생성자의 리턴값은 무조건 주소값
	System.out.println("컴퓨터를 객체에 생성합니다."); //생성자
}

	public void printInfo() {  //메소드
		System.out.println("컴퓨터모델: " + model);  //각각의 주소에 들어있는 다른 model을 쓴다
		
	}
	
}
