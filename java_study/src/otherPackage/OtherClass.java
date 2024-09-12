package otherPackage;
import chapter07.Example;

public class OtherClass {
	public static void main(String[] args) {
		// 외부 패키지 클래스를 사용한 객체 인스턴스 화
		Example ex = new Example();
		System.err.println(ex.publicVar);
//		System.err.println(ex.prtectedVar); -Error
//		System.err.println(ex.defaultVar); -Error
//		System.err.println(ex.pricateVar); -Error
		
		ex.ex1();
//		ex.ex2(); -Error
//		ex.ex3(); -Error
//		ex.ex4(); -Error
	}
}
