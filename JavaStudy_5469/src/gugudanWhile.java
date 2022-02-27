package a07_반복;

public class gugudanWhile {

	public static void main(String[] args) {
		int dan = 2;
		int num = 0;
		while(num < 9) {
			System.out.println(dan + "X" + (++num) + "=" + (dan * num ));
			
		}
		
		
		
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * ....
		 * 2 x 9 = 18*/
	}

}
