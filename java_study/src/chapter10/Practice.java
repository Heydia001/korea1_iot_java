package chapter10;

import java.util.Calendar;
import java.util.Scanner;

// 생일까지 남은 일수 계산 프로그램
// :  사용자로 부터 생년월일을 입력 받고
// :  다가오는 생일까지 남은 일수를 반환

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자로부터 생년월일 입력 받기
		System.out.println("연도: YYYY, 월: 1-12, 일: 1-31;");
		int birthYear = sc.nextInt();
		int birthMonth = sc.nextInt();
		int birthDay = sc.nextInt();
		
		// 2. 현재 날짜와 시간을 포함하는 calendar 인스턴스를 생성
		Calendar today = Calendar.getInstance();
		
		// 2. 사용자의 생일 설정 (월은  0 부터 시작해서 -1)
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.YEAR, birthYear);
		birthday.set(Calendar.MONDAY, birthMonth);
		birthday.set(Calendar.DAY_OF_MONTH, birthDay);
		
		if (birthday.before(today)) {
			birthday.set(Calendar.YEAR, today.get(Calendar.YEAR) + 1);
		}
		long difference = (birthday.getTimeInMillis() - today.getTimeInMillis()) / (1000 * 60 * 60 * 24);
		System.out.println("남은 생일은" + difference);
	}

}
