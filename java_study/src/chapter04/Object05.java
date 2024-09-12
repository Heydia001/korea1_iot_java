package chapter04;

class CarClass {
	String color;
	int speed;
	String brand;
	
	// 정적 변수
	// : 해당 클래스로 생성되는 모든 객체가 동일한 값을 가
	// : 데이터 타입 앞에 static 키워드 사용
	
	// 변수 선언과 동시에 공유 될 값을 초기화
	static int tireNumber = 4;
	static int doorNumber = 4;
	
	void accelerate(int increment) {
		
		// increment: 지역변수
		// >> 메서드 내부에서만 유효
		speed += increment;
	}			
}

public class Object05 {
	public static void main(String[] args) {
		
		// carClass 인스턴스화
		CarClass car1 = new CarClass();
		CarClass car2 = new CarClass();
		car1.brand = "kia";
		car1.color = "yellow";
		
		// 객체의 클래스 변수 : 클래스명.속성 (각 인스턴스로도 호출 가능)
		System.out.println(CarClass.tireNumber);

		// 클래스 변수는 클래스명으로 접근을 권장!
//		System.out.println(car1.tireNumber);
//		car1.tireNumber = 5;
//		
//		System.err.println(car2.tireNumber);
		
		
		
	}
}
