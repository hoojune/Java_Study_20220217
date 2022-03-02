package a09_클래스_정보은닉;

public class Encapsulation {  //메소드라는 막으로 데이터보호  -->캡슐화
	private String username; //아이디
	private String password; //비밀번호
	private String provider; //서비스회사  google , kakao ,naver
	public Encapsulation(String password, String provider) {
		super();
		this.password = password;
		this.provider = provider;
	}
	
	public void setUsername(String username) { //setter
		if(provider.equals("kakao")) {
			this.username =username +"@kakako.com";  //무조건입력해야할때 사용
		}else if(provider.equals("google")) {
			this.username =username +"@gmail.com";
		}else if(provider.equals("naver")) {
			this.username =username +"@naver.com";
		}else {
		this.username =username;
	  }
	}
	public String getUsername() { //getter : 이름겹치지않으면 this생략가능 
		return username;
	}
	public void showInfo() {
		System.out.println(username);
		System.out.println(password);
		System.out.println(provider);  //무조건 메소드통해서만 접근,값출력
	}
}
