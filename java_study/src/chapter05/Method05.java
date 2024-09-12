package chapter05;

class BaseballPlayer {
	
	// 인스턴스 변수
	// 선수 이름(name) String 
	// 타율(battingAverage) double
	// 홈런 수 (homeRun) int
	
	//정적(클래스) 변수
	//:  생성 된 선수의 총 인원 (playerCount - 정수)
	// >> 모든 인스턴스에서 공유
	
	// 생성자 >> 인스턴스 변수 초기화 & 정적변수 후위 증가 (변수명++)
	// 인스턴스 메서드로 선수의 타율과 홈런 수를 업데이트 하는 메서드
	// >> 매개변수로 newBattingAverage, newHomeRuns을 받아
	// 	  기존의 인스턴스 변수에 재할당
	
	String name;
	double battingAverage;
	int homeRun;
	static int playerCount;
	
	BaseballPlayer(String name, double battingAverage, int homeRun){
		this.name = name;
		this.battingAverage = battingAverage;
		this.homeRun = homeRun;
		playerCount++;
	}
	
	void updateStatus(double newBattingAverage, int newHomeRun) {
		battingAverage = newBattingAverage;
		homeRun = newHomeRun;
	}
	
	void display() {
		System.out.println("이름: "+ this.name + ", 타율: " + this.battingAverage + ", 홈런: " + this.homeRun );
		System.out.println("플레이어 수: " + playerCount);
	}
}

public class Method05 {
	public static void main(String[] args) {
		BaseballPlayer bp1 = new BaseballPlayer("김다혜", 0.255, 3);
		BaseballPlayer bp2 = new BaseballPlayer("홍길동", 0.325, 10);
		BaseballPlayer bp3 = new BaseballPlayer("강감찬", 0.215, 4);
		BaseballPlayer bp4 = new BaseballPlayer("유관순", 0.195, 7);

		System.out.println(BaseballPlayer.playerCount);
	}
}
