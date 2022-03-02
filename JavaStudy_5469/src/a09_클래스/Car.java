package a09_클래스;

public class Car {
	String company; int oil; String model;
	
private void oilError() {	
			System.out.println("기름이 0보다 적으면 기름이 부족하여 차량의 이동이 불가능합니다");
	}

public void go() {
	if(oil < 1) {
		oilError(); //메소드안에서 메소드호출 가능
	}else {
	oil --; System.out.println("기름이 1감소하였습니다");
	}
}

public void oiling() {
	oil++; System.out.println("기름이 1증가하였습니다");
}
public void showCarInfo() {
	System.out.println(company + "회사에서 제조한" + model +"차량의 정보입니다.");
	System.out.println("현재기름은" + oil + "L입니다.");
}

}


