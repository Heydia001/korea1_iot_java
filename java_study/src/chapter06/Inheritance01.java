package chapter06;

//! 상속
// 한 클래스의 속성과 메서드를 다른 메서드가 물려 받는것을 의미
// -  기존의 클래스를 재사용하여 새로운 클래스를 작성 하는 것 
// - 코드의 재사용성과 중복을 제거 (프로그램의 생산성 향성)

// == 상속 구현 방법 ==
// extend 키워드를 사용하여 구현 (확장하다)

class Parent {} //- 기존 클래스 _ 부모 클래스
class Child extends Parent{} // - 새로운 클래스 (자식 클래스)

// cf) 명칭
// 상속해주는 클래스(Patent) - 조상, 부모, 상위, 기반, 슈퍼 클래스
// 상속 받는 클래스 (child) - 자손, 자식, 하위, 파생, 서브 클래스

// === 동물 클래스 ===
class Animal {
	String name;
}

class Dog extends Animal {
	// 부모 클래스의 속성과 메서드를 모두 상속 받음
	// String name;
	void bark() {
		System.out.println("왈왈");
	}
}


// ==상속 예시==
class Tv{
	boolean power;
	int channel;
	
	void power() {
		power = !power; 
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class SmartTV extends Tv {
	boolean ott; // ott 플랫폼 전원 상태 on/off

	void aa(boolean ott) {
		if (ott) {
			System.out.println("OTT On");
		} else {
			System.out.println("OTT 연결 X");
		}
	}
}

public class Inheritance01 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "방울";
		d1.bark();
		
		SmartTV stv = new SmartTV();
		stv.channelUp();
		stv.channelUp();
		stv.channelUp();
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.aa(true);
	}
}
