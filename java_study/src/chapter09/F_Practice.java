package chapter09;
// 인터페이스
// Fruits 인터페이스 정의
// - color
// - describe
// - printType

interface Fruit {
	String color();
	
	default void describe() {
		System.out.println("과일의 색상은 " + color() + "입니다.");
	};
	
	static void printType() {
		System.out.println("과일(Fruit)의 타입입니다");
	}
}
// == 인터페이스 구현 ==

class Apple implements Fruit{
	public String color() {
		return "red";
	}
}

class Orange implements Fruit{
	public String color() {
		return "orange";
	}
}

public class F_Practice {
	public static void main(String[] args) {
		Fruit apple = new Apple();
		Fruit orange = new Orange();
		
		apple.describe(); // 과일의 색상은 red입니다.
		orange.describe(); // 과일의 색상은 orange입니다.

		// 정적메서드 활용
		Fruit.printType();
	}
}
