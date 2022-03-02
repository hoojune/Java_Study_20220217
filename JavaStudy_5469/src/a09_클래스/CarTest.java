package a09_클래스;

public class CarTest {

	/*car클래스정의
	 * 속성(변수)
	 * company
	 * model
	 * oil
	 * 메소드: void go() :호출될때마다 기름을 -1  -> 기름이 1감소하였습니다.
	 * void oiling()  :호출될때마다 기름 +1 -> 기름이 1증가하였습니다.
	 * void showCarInfo() :OOO회사에서 제조한 ooo차량의 정보입니다.현재 기름은ooooL입니다.
	 * 
	 * oil=5
	 * go();\
	 * void oilError()기름이 0보다 적으면 기름이 부족하여 차량의 이동이 불가능합니다
	 * */
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.company ="kIA";
		c1.model ="K5";
		c1.oil =5;
		c1.showCarInfo();
		c1.go();
		c1.go();
		c1.go();
		c1.go();
		c1.go();
		c1.go();
		c1.showCarInfo();
		c1.oiling();
		c1.oiling();
		c1.showCarInfo();
		
		System.out.println();
		System.out.println();
		
		Car c2 = new Car();
		c2.company ="현대";
		c2.model ="아반떼";
		c2.oil =5;
		c2.showCarInfo();
		c2.go();
		c2.showCarInfo();
		c2.oiling();
		c2.oiling();
		c2.showCarInfo();
	}

}
