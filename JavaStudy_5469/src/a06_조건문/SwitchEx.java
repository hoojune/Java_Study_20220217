package a06_조건문;

public class SwitchEx {

	public static void main(String[] args) {
		int select = 4;
		
		switch(select) {
		case 1 :
			System.out.println("1을 선택하셨습니다.");
		case 2 :                            
			System.out.println("2을 선택하셨습니다.");
		case 3 :
			System.out.println("3을 선택하셨습니다.");
		default :
			System.out.println("해당 case는 없습니다.");
	}
		
		String select2 = "성호준2";
		switch(select2) {
		case "성호준" :
			System.out.println("선택하신 이름은 성호준입니다.");
		case "성호준2" :
			System.out.println("선택하신 이름은 성호준2입니다.");
			break;
			case "성호준3" :
			System.out.println("선택하신 이름은 성호준3입니다.");
		}
		
		int num = 21;
//		if(num == 0) {
//			System.out.println("0입니다");
//		}else {
		switch(num == 0 ? 2 : num%2 ) {
		case 1 :
			System.out.println("홀수입니다.");
			break;
		case 0 :  /*default 도 됨*/
			System.out.println("짝수입니다.");
		default :
			System.out.println("num이 0입니다");
}
	}
	}
		
	

