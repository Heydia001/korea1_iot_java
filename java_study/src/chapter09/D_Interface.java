package chapter09;
// 인터페이스 멤버 변수의 특성
// : 모든 멤버 변수는 인터페이스 상수로 동작
// : 자동으로 public static final 속성을 가짐
// >> 어디서든 접근 가능 + 인스턴스화 없이 인터페이스 명으로 접근 가능 + 값 변경 불가능

interface Example1 {
	int EXAMPLE_VALUE = 10;
	void printVar1();
	default void method() { // default method > 재정의 가능 
		System.out.println("예시 1");
	}
}
interface Example2 {
	void printVar2();
	default void method() {
		System.out.println("예시 2");
	}
}
// 다중 인터페이스 구현
// : 자바에서는 여러 개의 인터페이스를 동시에 구현이 가능
// >> 둘 이상의 타입으로 동작 가능
// == 다중 인터페이스 구현 방법 ==
// implements 키워드 뒤에 여러가의 인터페이스를 , 로 구분하여 나열
class ExampleClass implements Example1, Example2 {
	public void printVar1() {
		System.out.println(EXAMPLE_VALUE);
	}
	public void printVar2() {
		System.out.println("다중인터페이스 구현");
	}
	@Override
	public void method() {
		System.out.println("중복되는 디폴트 메서드");
	}
	// cf) 다중 인터페이스의 주의 사항
	// : 여러개의 인터페이스에 같은 시그니쳐(선언부)를 가진 디폴트 메서드가 존재할 경우
	// >> 선언이 같고 구현이 다른 메서드가 충돌
}
public class D_Interface {
	public static void main(String[] args) {
		ExampleClass exClass = new ExampleClass();
		exClass.printVar1();
		exClass.printVar2();
		exClass.method();
		
		Example1 exInterface = exClass;
		exInterface.printVar1();
//		exInterface.printVar2();
		exInterface.method();
	}
	//cf) 인터페이스의 다형성
	// : 인터페이스를 구현한 클래스의 객체는 해당 인터페이스 타입이 될 수 있음
	// >> 해당 인터페이스 내의 구조만을 가지며
	// >> 재정의 된 메서드는 유지
}
