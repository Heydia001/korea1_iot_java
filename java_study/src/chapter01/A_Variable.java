package chapter01;

public class A_Variable {

	public static void main(String[] args) {
		// 변수에 대한 개념 : Variable
		// : 데이터를 저장할 수 있는 메모리 '공간'
		
		// 1. 변수 선언: 메모리 공간 생성

		// - 변수 선언 방법
		// : 데이터타입 변수명;
		
		// - 변수 초기화 방법 (그릇에 데이터 넣기)
		// : 변수명 = 데이터 값;
		
		// - 변수선언과 동시에 초기화
		// : 데이터타입 변수명 = 데이터 값;
		
		// 2. 변수 명명 규칙
		// : 문자, 숫자, 기호를 사용
		// - 대,소문자 구분, 길이 제한 X (Name !== name)
		// - 숫자로 시작 X
		// - 기호는 _(언더스코어)와 $(달러)만 가능
		// - LowerCamelCase를 사용
		// - 자바의 예약어 키워드는 변수명으로 사용할 수 없다.
		
		// +) 전체 대문자 사용 X (상수와의 구분을 위해)

		int num = 10;
		char chr1 = '가';
		boolean bool1 = true;
		
		//상수 (Constant)
		// : 프로그램 실행 동안 그 값이 변경되지 않는 상수
		// >> 선언과 동시에 반드시! 초기화가 이루어 져야한다.
		
		// UPPER_SNAKE_CASE 
		final float pt = 3.14159f;
		final int RESIDENT_NUMBER = 1234567;
		
	}

}
