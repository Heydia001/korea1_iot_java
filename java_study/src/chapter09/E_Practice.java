package chapter09;
// 추상클래스
// ==모바일 어플리케이션==
abstract class MobileApp{
	abstract void execute(); //추상 메서드(실행에 대한 동작 정의)
	
	// (일반, 구현) 메서드
	void appInfo() {
		System.out.println("This is a mobile app");
	}
}

class GameApp extends MobileApp {
	// 추상 메서드 구현
	void execute() {
		System.out.println("Game app executes");
	}
}

// =사회 네트워킹 어플리케이션==
class SocialApp extends MobileApp {
	String name;
	
	SocialApp(String name){
		this.name = name;
	}
	void execute() {
		System.out.println(name + "Socoal app executes");
	}
	
	@Override
	void appInfo() {
		System.out.println(name + "is popular social app");
	}
}

public class E_Practice {
	public static void main(String[] args) {
		// 인스턴스 생성
		MobileApp myGameapp = new GameApp();
		SocialApp mySocialapp = new SocialApp("FaceBook");
		
		myGameapp.execute();
		myGameapp.appInfo(); // 추상 클래스가 가진 일반 메서드 출력
		
		mySocialapp.execute();
		mySocialapp.appInfo(); // 재정의 된 메서드 출력
		
	}
}
