package a07_반복.퀴즈;

public class ContiueEx {

	public static void main(String[] args) {
		/*
		 * continue : 계속하다
		 * */

		for(int i = 0; i < 5 ; i++) {
			
			if(i !=0 && i%2 == 0) {
				continue;
			}
			System.out.println(i);
			/*
			 * continue 는 다음반복으로 넘어가는것*/
		}
	}

}
