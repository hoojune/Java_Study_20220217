package a08_함수;

public class MethodEX1 {
	public static int outputNumber() {
		return 10;
	}
	
	public static void showName() {  //값이 없어 print로 출력불가능
		String name = "성호준";
		System.out.println("이름: " + name);
		}
	public static int outputNumber2(int number) {
		return number;}
		
	public static int outputNumber3(int number) {
			if(number % 2==0) {
				return 0;
			}else {
			return 1;
			}
	}	
	public static void showName2(String name) {
		if(name == null) {
		return;	 //break와 비슷하다(void라 값이 없어서)
		}System.out.println(name); //실행안됨
		}
		

	
	
	public static void main/*main도 메소드다*/(String[] args) {//시작점
		int number = outputNumber(); //메소드 호출
		System.out.println(number);
		showName();
		if(number ==10) {
			return; //break
		}
		showName2(null);
		int number2 = outputNumber2(100);
		System.out.println(number2);
	}

}
