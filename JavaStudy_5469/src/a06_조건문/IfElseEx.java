package a06_조건문;

public class IfElseEx {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		x = 10;
		y = 20;
		if(x > y) 
			{System.out.println("x가 y보다 큽니다.");
			System.out.println("test");}  /*조건문에 조건은 하나씩만  두가지이상시 중괄호{}로 묶어야함*/
		else
			System.out.println("x가 y보다 작습니다.");
	}

}
