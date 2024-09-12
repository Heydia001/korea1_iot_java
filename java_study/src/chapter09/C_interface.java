package chapter09;

interface Flyable {
	int MAX_SPEED = 100;
	void fly();
	
	default void land() {
		System.out.println("Landing");
	}
	
	// 정적 메서드 재정의 불가능
	static int getWingCount() {
		return 2;
	}
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("새는 최대 속력이"  + MAX_SPEED + "입니다.");
	}
	@Override
	public void land() {
		System.out.println("landing");
	}
}

public class C_interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.fly();
		bird.land();
		System.out.println(Flyable.getWingCount());
	}
}
