package a09_클래스;

public class ComputerTest {

	
	public static void main(String[] args) {
		Computer c1 = null; 
		Computer c2 =  null; 
		c1 = new Computer(); //c1에 주소값 들어감(생성 or 생성자호출)
		c2 = new Computer(); //주소가 다름(new)
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.model = "삼성컴퓨터";
		c2.model = "Lg컴퓨터";
		
		System.out.println(c1.model);
		System.out.println(c2.model);
		
		String model = "삼성컴퓨터";
		model = "Lg컴퓨터";
		
		c1.printInfo();  //각각의 모델들의값을 대입
		c2.printInfo();
	}

}
